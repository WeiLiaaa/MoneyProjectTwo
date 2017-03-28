package com.liwei.moneyprojecttwo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by wu  suo  wei on 2017/3/15.
 * 导航页面
 * 简单介绍app功能及操作
 */

public class NavigateActivity extends AppCompatActivity implements View.OnClickListener {
    //viewpager
    private ViewPager vp;
    //定义图片
    private int [] image={R.mipmap.daohang1,R.mipmap.daohang2,R.mipmap.daohang3};
    //textView点击进入主页面
    private TextView navigate_tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigateactivity);
        //初始化控件
        initView();
    }
    // 不可点击返回键
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    private void initView() {
        vp = (ViewPager) findViewById(R.id.navigate_vp);
        navigate_tv = (TextView) findViewById(R.id.navigate_tv);
        NavigateAdapter adapter = new NavigateAdapter();
        //设置adapter
        vp.setAdapter(adapter);
        //设置textView的点击事件
        navigate_tv.setOnClickListener(this);
        //设置viewpager的点击事件
        vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            //得到下标值判断textView是否隐藏并设置隐藏和显示
            @Override
            public void onPageSelected(int position) {
                if (position==2){
                    navigate_tv.setVisibility(View.VISIBLE);
                }else{
                    navigate_tv.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    //监听textView
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(NavigateActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    //设置Viewpager的Adapte
    class NavigateAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = View.inflate(NavigateActivity.this, R.layout.navigate_vp_item, null);
            ImageView vp_image= (ImageView) view.findViewById(R.id.navigate_vp_image);
            vp_image.setImageResource(image[position]);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
