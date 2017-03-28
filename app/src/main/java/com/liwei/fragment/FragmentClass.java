package com.liwei.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.liwei.activity.fragmentclassactivity.ClassMaskActivity;
import com.liwei.adaptert.FragmentClassRecAdapter;
import com.liwei.bean.ClassMingXingBean;
import com.liwei.intfac.RecyclerViewOnClickListener;
import com.liwei.moneyprojecttwo.R;
import com.liwei.moneyprojecttwo.ShangPinXiangQing;
import com.liwei.utils.Connected;
import com.liwei.utils.OkhttpTest;
import com.liwei.utils.StringURL;
import com.liwei.view.RecyclerViewDraw;
import com.liwei.view.ScrollGridLayoutManager;

import java.util.List;

/**
 * Created by wu  suo  wei on 2017/3/16.
 */

public class FragmentClass extends Fragment implements View.OnClickListener, OkhttpTest.getCallBackStr {

    private View view;
    private ImageView mask;
    private ImageView jeMianRu;
    private ImageView kit;
    private Button btnbuShui;
    private Button btnmeiBai;
    private Button btnquDou;
    //分类页面左下方recyclerView的adapter
    private FragmentClassRecAdapter adapter;
    private List<ClassMingXingBean.DataBean> data;
    Gson gson = new Gson();
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int i = msg.what;
            if (i==1){
                String str = (String) msg.obj;
                ClassMingXingBean classMingXingBean = gson.fromJson(str, ClassMingXingBean.class);
                int code = classMingXingBean.getCode();
                if (code==200){
                    data = classMingXingBean.getData();
                    //操作分页左下方RecyclerView
                    fra_class_recbenAdapter();
                }
            }
        }
    };

    private void fra_class_recbenAdapter() {
        adapter.addData(data);
        //刷新适配器
        adapter.notifyDataSetChanged();
        fra_class__rec.setLayoutManager(new ScrollGridLayoutManager(getActivity(),2));
        fra_class__rec.setAdapter(adapter);
    }

    private RecyclerViewDraw fra_class__rec;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragmentclass, container, false);
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

    private void initData() {
        String mClassMingXing = StringURL.mClassMingXing;
        OkhttpTest.getStr(mClassMingXing, this);
        adapter = new FragmentClassRecAdapter(getActivity());
        //设置点击事件
        adapter.OnItemClickListener(new RecyclerViewOnClickListener() {
            @Override
            public void OnItemListener(int position) {
                Toast.makeText(getActivity(),position+"",Toast.LENGTH_SHORT).show();
                Intent in=new Intent(getActivity(), ShangPinXiangQing.class);
                in.putExtra("image",data.get(position).getGoods_img());
                in.putExtra("name",data.get(position).getGoods_name());
                in.putExtra("newPrice",data.get(position).getShop_price()+"");
                in.putExtra("jiuPrice",data.get(position).getMarket_price()+"");
                startActivity(in);
            }
        });
    }

    private void initView() {
        //顶部图片控件
        mask = (ImageView) view.findViewById(R.id.fra_class_maskImage);
        jeMianRu = (ImageView) view.findViewById(R.id.fra_class_jeMianRuImage);
        kit = (ImageView) view.findViewById(R.id.fra_class_kitImage);
        //功效按钮
        btnbuShui = (Button) view.findViewById(R.id.fra_class_btnbuShui);
        btnmeiBai = (Button) view.findViewById(R.id.fra_class_btnmeiBai);
        btnquDou = (Button) view.findViewById(R.id.fra_class_btnquDou);
        //底部ReclcerView控件
        fra_class__rec = (RecyclerViewDraw) view.findViewById(R.id.fra_class__rec);
        //点击事件
        mask.setOnClickListener(this);
        jeMianRu.setOnClickListener(this);
        kit.setOnClickListener(this);
        btnbuShui.setOnClickListener(this);
        btnmeiBai.setOnClickListener(this);
        btnquDou.setOnClickListener(this);

    }

    //点击事件
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //面膜 的点击事件
            case R.id.fra_class_maskImage:
                Intent in1 = new Intent(getActivity(), ClassMaskActivity.class);
                startActivity(in1);
                break;
            //洁面乳 的点击事件
            case R.id.fra_class_jeMianRuImage:
                Intent in2 = new Intent(getActivity(), ClassMaskActivity.class);
                startActivity(in2);
                break;
            //实惠套装的 点击事件
            case R.id.fra_class_kitImage:
                Intent in3 = new Intent(getActivity(), ClassMaskActivity.class);
                startActivity(in3);
                break;
            case R.id.fra_class_btnbuShui:
                Intent in4 = new Intent(getActivity(), ClassMaskActivity.class);
                startActivity(in4);
                break;
            case R.id.fra_class_btnmeiBai:
                Intent in5 = new Intent(getActivity(), ClassMaskActivity.class);
                startActivity(in5);
                break;
            case R.id.fra_class_btnquDou:
                Intent in6 = new Intent(getActivity(), ClassMaskActivity.class);
                startActivity(in6);
                break;
        }
    }

    @Override
    public void getDataBase(String sring) {
        Message msg = Message.obtain();
        msg.what = 1;
        msg.obj = sring;
        handler.sendMessage(msg);
    }
}
