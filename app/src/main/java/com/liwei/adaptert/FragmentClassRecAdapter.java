package com.liwei.adaptert;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.liwei.bean.ClassMingXingBean;
import com.liwei.intfac.RecyclerViewOnClickListener;
import com.liwei.moneyprojecttwo.R;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wu  suo  wei on 2017/3/18.
 */

public class FragmentClassRecAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    List<ClassMingXingBean.DataBean> list=new ArrayList<>();
    private RecyclerViewOnClickListener recyclerViewOnClickListener;

    //点击事件
    public void OnItemClickListener(RecyclerViewOnClickListener recyclerViewOnClickListener){
        this.recyclerViewOnClickListener=recyclerViewOnClickListener;
    }

    public FragmentClassRecAdapter(Context context) {
        this.context=context;
    }
    /**
     * 绑定viewHodler
     * 加载item
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragmenthomerecben_item, parent,false);
        ClassRecAdapterViewHolder vh = new ClassRecAdapterViewHolder(itemView);
        return vh;
    }

    /**
     * 绑定并修改数据
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        ImageLoader.getInstance().displayImage(list.get(position).getGoods_img(),
                ((ClassRecAdapterViewHolder)holder).image);
        ((ClassRecAdapterViewHolder)holder).name.setText(list.get(position).getEfficacy());
        ((ClassRecAdapterViewHolder)holder).newmoney.setText("￥"+list.get(position).getShop_price());
        ((ClassRecAdapterViewHolder)holder).newmoney.setTextColor(Color.parseColor("#ff0000"));
        ((ClassRecAdapterViewHolder)holder).yanmoney.setText("￥"+list.get(position).getMarket_price());
        ((ClassRecAdapterViewHolder)holder).image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断   点击事件
                if (recyclerViewOnClickListener!=null){
                    recyclerViewOnClickListener.OnItemListener(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addData(List<ClassMingXingBean.DataBean> data) {
        list.addAll(data);
    }

    class ClassRecAdapterViewHolder extends RecyclerView.ViewHolder{

        public ImageView image;
        public TextView name;
        public TextView newmoney;
        public TextView yanmoney;

        public ClassRecAdapterViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.fra_home_recben_image);
            name = (TextView) itemView.findViewById(R.id.fra_home_recben_name);
            newmoney = (TextView) itemView.findViewById(R.id.fra_home_recben_newmoney);
            yanmoney = (TextView) itemView.findViewById(R.id.fra_home_recben_yanmoney);
        }
    }

}
