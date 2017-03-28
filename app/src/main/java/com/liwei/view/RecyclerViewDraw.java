package com.liwei.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by wu  suo  wei on 2017/3/19.
 */

public class RecyclerViewDraw extends RecyclerView {

    public RecyclerViewDraw(Context context) {
        super(context);
    }

    public RecyclerViewDraw(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RecyclerViewDraw(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //得到RecyclerView的最大高度
        heightMeasureSpec=MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
