package com.liwei.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.gson.Gson;
import com.liwei.activity.BannerWebViewActivity;
import com.liwei.adaptert.FragmentHomeRecBenAdapter;
import com.liwei.adaptert.HomeRecBenViewHolder;
import com.liwei.bean.BannerBean;
import com.liwei.modeview.GlideImageLoader;
import com.liwei.moneyprojecttwo.R;
import com.liwei.moneyprojecttwo.ShangPinXiangQing;
import com.liwei.utils.Connected;
import com.liwei.utils.OkhttpTest;
import com.liwei.utils.StringURL;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wu  suo  wei on 2017/3/16.
 */

public class FragmentHome extends Fragment implements OkhttpTest.getCallBackStr {

    private View view;
    //定义图片数组
    private ArrayList<String> images = new ArrayList<>();
    private ArrayList<String> list = new ArrayList<>();
    private Banner banner;
    private LinearLayout fra_home_li1;
    private LinearLayout fra_home_li2;
    private LinearLayout fra_home_li3;
    private LinearLayout fra_home_li4;
    //定义优惠活动图片
    private ArrayList<String> images_youhui = new ArrayList<>();

    Gson gson = new Gson();
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int i = msg.what;
            if (i == 1) {
                BannerBean bean = (BannerBean) msg.obj;
                if (bean.getCode() == 200) {
                    List<BannerBean.DataBean.Ad1Bean> ad1 = bean.getData().getAd1();
                    for (int j = 0; j < ad1.size(); j++) {
                        String image = ad1.get(j).getImage();
                        String ad_type_dynamic_data = ad1.get(j).getAd_type_dynamic_data();
                        list.add(ad_type_dynamic_data);
                        images.add(image);
                    }
                    //banner实现无限轮播
                    setBanner();
                    //本周热销下的recycler的具体操作及实现功能
                    goodsList = bean.getData().getBestSellers().get(0).getGoodsList();
                    //设置本周热销下放的RecyclerView的adapter
                    fra_home_recbenAdapter();
                    /**
                     * 得到优惠活动下放图片的值
                     */

                    List<BannerBean.DataBean.ActivityInfoBean.ActivityInfoListBean>
                            activityInfoList = bean.getData().getActivityInfo().
                            getActivityInfoList();
                    for (int j = 0; j < activityInfoList.size(); j++) {
                        String img = activityInfoList.get(j).getActivityImg();
                        images_youhui.add(img);
                    }
                    //设置优惠活动下放的banner
                    setBnanerYouHui();
                    //热门专题图片
                    ImageLoader.getInstance().displayImage(ad1.get(2).getImage(),fra_home_recRemen);
                }

            }
        }
    };
    private RecyclerView fra_home_recben;
    //本周热销的adapter
    FragmentHomeRecBenAdapter adapterBen;
    private List<BannerBean.DataBean.BestSellersBean.GoodsListBeanX> goodsList;
    private Banner banneryou;
    private ImageView fra_home_recRemen;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmenthome, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //判断网络
        boolean b = Connected.isNetworkConnected(getActivity());
        if (b) {
            initData();
            initView();
        } else {
            Toast.makeText(getActivity(), "请连接网络", Toast.LENGTH_SHORT).show();
        }
    }
    //刷新数据
    private void initData() {
        //得到首页轮播图 的接口
        String homeTop = StringURL.homeTop;
        OkhttpTest.getStr(homeTop, this);

    }
    private void initView() {
        //banner控件
        banner = (Banner) view.findViewById(R.id.fra_home_banner);
        //签到  积分  兑换  真伪查询控件
        fra_home_li1 = (LinearLayout) view.findViewById(R.id.fra_home_li1);
        fra_home_li2 = (LinearLayout) view.findViewById(R.id.fra_home_li2);
        fra_home_li3 = (LinearLayout) view.findViewById(R.id.fra_home_li3);
        fra_home_li4 = (LinearLayout) view.findViewById(R.id.fra_home_li4);
        //本周热销下放的RecyclerView控件
        fra_home_recben = (RecyclerView) view.findViewById(R.id.fra_home_recben);
        //优惠活动下放的view控件
        banneryou = (Banner) view.findViewById(R.id.fra_home_recyou);
        //热门专题
        fra_home_recRemen = (ImageView) view.findViewById(R.id.fra_home_recRemen);
    }
    //设置优惠活动下放的banner
    private void setBnanerYouHui() {
        //设置图片加载器
        banneryou.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banneryou.setImages(images_youhui);
        banneryou.isAutoPlay(false);
        //去掉banner的小圆点
        banneryou.setBannerStyle(BannerConfig.NOT_INDICATOR);
        //banner设置方法全部调用完毕时最后调用
        banneryou.start();
        //点击事件
        banneryou.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                Toast.makeText(getActivity(),"优惠活动"+position,Toast.LENGTH_SHORT).show();
            }
        });


    }
    //设置本周热销下放的RecyclerView的adapter
    private void fra_home_recbenAdapter() {

        adapterBen = new FragmentHomeRecBenAdapter(getActivity());
        adapterBen.addDataBen(goodsList);
        fra_home_recben.setAdapter(adapterBen);
        adapterBen.notifyDataSetChanged();
        fra_home_recben.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        //设置点击事件
        adapterBen.setOnItemClickListener(new HomeRecBenViewHolder.MyItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getActivity(),""+position,Toast.LENGTH_SHORT).show();
                /**
                 * 跳转商品详情页并传递数据
                 */
                Intent in=new Intent(getActivity(), ShangPinXiangQing.class);
                in.putExtra("image",goodsList.get(position).getGoods_img());
                in.putExtra("name",goodsList.get(position).getGoods_name());
                in.putExtra("newPrice",goodsList.get(position).getShop_price()+"");
                in.putExtra("jiuPrice",goodsList.get(position).getMarket_price()+"");
                startActivity(in);
            }
        });
    }

    private void setBanner() {
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(images);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
        //banner的监听事件   设置banner的点击事件
        banner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                //跳转webView展示数据
                Intent i=new Intent(getActivity(), BannerWebViewActivity.class);
                i.putExtra("webViewURL",list.get(position));
                startActivity(i);
            }
        });
    }

    @Override
    public void getDataBase(String sring) {
        //handler发送消息到handler里面解析数据
        Message msg = Message.obtain();
        msg.what = 1;
        BannerBean bean = gson.fromJson(sring, BannerBean.class);
        msg.obj = bean;
        handler.sendMessage(msg);
    }
}
