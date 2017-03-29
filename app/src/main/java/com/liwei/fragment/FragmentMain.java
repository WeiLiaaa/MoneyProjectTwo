package com.liwei.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.liwei.moneyprojecttwo.R;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.tencent.connect.UserInfo;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by wu  suo  wei on 2017/3/16.
 */

public class FragmentMain extends Fragment {
    private IUiListener userInfoListener;
    private View view;
    private ImageView mQQImageView;
    private static final String APP_ID = "1105602574";//官方获取的APPID
    //获取权限列表。所有权限为 all
    private static String SCOPE = "all";
    private Tencent mTencent;
    private IUiListener loginListener;
    private UserInfo mUserInfo;
    private TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmentmain, container, false);
        //初始化QQ登录
        initQqLogin();
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tv = (TextView) view.findViewById(R.id.main_tv);
        mQQImageView = (ImageView) view.findViewById(R.id.main_qq_imageview);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTencent.login(getActivity(), SCOPE, loginListener);
            }
        });
    }
    //初始化QQ登录分享的需要的资源
    private void initQqLogin() {
        try {
            mTencent = Tencent.createInstance(APP_ID, getActivity());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //创建QQ登录回调接口
        loginListener = new IUiListener() {
            @Override
            public void onComplete(Object o) {

                //登录成功后回调该方法
                Toast.makeText(getActivity(), "登录成功", Toast.LENGTH_SHORT).show();
                SharedPreferences spf = getActivity().getSharedPreferences("myheading", Context.MODE_PRIVATE);
                SharedPreferences.Editor edit = spf.edit();
                edit.putBoolean("islogin", true);
                edit.commit();

                //设置openid，如果不设置这一步的话无法获取用户信息
                JSONObject jo = (JSONObject) o;
                String openID;
                try {
                    openID = jo.getString("openid");
                    String accessToken = jo.getString("access_token");
                    String expires = jo.getString("expires_in");
                    mTencent.setOpenId(openID);
                    mTencent.setAccessToken(accessToken, expires);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onError(UiError uiError) {
                //登录失败后回调该方法
                Toast.makeText(getActivity(), "登录失败", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancel() {
                //取消登录后回调该方法
                Toast.makeText(getActivity(), "取消登录", Toast.LENGTH_SHORT).show();
            }
        };
        //获取用户信息的回调接口
        userInfoListener = new IUiListener() {
            @Override
            public void onComplete(Object o) {
                JSONObject jo = (JSONObject) o;
                try {
                    JSONObject info = (JSONObject) o;
                    //获取用户具体信息
                    String nickName = info.getString("nickname");
                    String figureurl_qq_2 = info.getString("figureurl_qq_2");
                    //隐藏图片  gone与invisible的区别gone只是隐藏，invisible隐藏而且占位位置
                   //mQQImageView.s
                    ImageLoader.getInstance().displayImage(figureurl_qq_2,mQQImageView);
                    tv.setText(nickName);
                    SharedPreferences sp = getActivity().getSharedPreferences("myheading", Context.MODE_PRIVATE);
                    SharedPreferences.Editor edit1 = sp.edit();
                    edit1.putString("qqname", nickName);
                    edit1.putString("qqimg", figureurl_qq_2);
                    edit1.commit();


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onError(UiError uiError) {

            }

            @Override
            public void onCancel() {

            }
        };
    }

    //获取用户信息
    private void getUserInfo() {
        UserInfo info = new UserInfo(getActivity(), mTencent.getQQToken());
        info.getUserInfo(userInfoListener);
    }

    //在调用Login的Activity或者Fragment中重写onActivityResult方法
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
       /* if (requestCode == Constants.REQUEST_LOGIN) {
            Tencent.onActivityResultData(requestCode, resultCode, data, mIUiListener);
        }
        super.onActivityResult(requestCode, resultCode, data);*/
        Tencent.handleResultData(data, loginListener);
        //获取用户信息
        getUserInfo();
    }
}
