package com.liwei.adaptert;


import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liwei.bean.BannerBean;
import com.liwei.moneyprojecttwo.R;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wu  suo  wei on 2017/3/17.
 */

public class FragmentHomeRecBenAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context context;
    private HomeRecBenViewHolder.MyItemClickListener mItemClickListener;
    List<BannerBean.DataBean.BestSellersBean.GoodsListBeanX> list=new ArrayList<>();
    public FragmentHomeRecBenAdapter(Context context) {
        this.context=context;
    }
    //绑定viewholder
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragmenthomerecben_item, parent,false);
        HomeRecBenViewHolder vh = new HomeRecBenViewHolder(itemView,mItemClickListener);
        return vh;
    }

    /**
     * 绑定并修改数据
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ImageLoader.getInstance().displayImage(list.get(position).getGoods_img(),
                ((HomeRecBenViewHolder)holder).image);
        ((HomeRecBenViewHolder)holder).name.setText(list.get(position).getGoods_name());
        ((HomeRecBenViewHolder)holder).newmoney.setText("￥"+list.get(position).getShop_price());
        ((HomeRecBenViewHolder)holder).newmoney.setTextColor(Color.parseColor("#ff0000"));
        ((HomeRecBenViewHolder)holder).yanmoney.setText("￥"+list.get(position).getMarket_price());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    /**
     * 设置Item点击监听
     * @param listener
     */
    public void setOnItemClickListener(HomeRecBenViewHolder.MyItemClickListener listener){
        this.mItemClickListener = listener;
    }

    public void addDataBen(List<BannerBean.DataBean.BestSellersBean.GoodsListBeanX> goodsList) {
        list.addAll(goodsList);
    }
}
