package com.liwei.adaptert;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.liwei.moneyprojecttwo.R;

/**
 * Created by wu  suo  wei on 2017/3/17.
 */

public class HomeRecBenViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public ImageView image;
    public TextView name;
    public TextView newmoney;
    public TextView yanmoney;
    MyItemClickListener onClickx;
    public HomeRecBenViewHolder(View itemView, MyItemClickListener onClickx) {
        super(itemView);
        this.onClickx = onClickx;
        image = (ImageView) itemView.findViewById(R.id.fra_home_recben_image);
        name = (TextView) itemView.findViewById(R.id.fra_home_recben_name);
        newmoney = (TextView) itemView.findViewById(R.id.fra_home_recben_newmoney);
        yanmoney = (TextView) itemView.findViewById(R.id.fra_home_recben_yanmoney);
        itemView.setOnClickListener(this);
    }
    /**
    * 点击监听
    */
    @Override
    public void onClick(View v) {
        onClickx.onItemClick(v,getPosition());
    }

    public interface MyItemClickListener {
        void onItemClick(View view,int postion);
    }
}
