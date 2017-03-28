package com.liwei.moneyprojecttwo;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.liwei.sqlit.CaoZuoSqlite;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by wu  suo  wei on 2017/3/24.
 */

public class ShangPinXiangQing extends AppCompatActivity implements View.OnClickListener {
    //商品图片
    private ImageView image;
    //商品介绍
    private TextView name;
    //商品价格
    private TextView newprice;
    //打折前价格
    private TextView jiuprice;
    //加入购物车
    private TextView cart;
    //购买
    private TextView money;

    private int position;
    //传递的图片
    private String image1;
    //传递的商品名字
    private String name1;
    //传递的价格
    private String newPrice1;
    //传递的原价
    private String jiuPrice;
    private CaoZuoSqlite sqlite;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shangpinxiangqingactivity);
        initData();
        initView();
    }

    private void initData() {
        Intent intent = getIntent();
        position = intent.getIntExtra("position", 0);
    }

    private void initView() {
        image = (ImageView) findViewById(R.id.shangpin_image);
        name = (TextView) findViewById(R.id.shangpin_name);
        newprice = (TextView) findViewById(R.id.shangpin_newprice);
        jiuprice = (TextView) findViewById(R.id.shangpin_jiuprice);
        cart = (TextView) findViewById(R.id.shangpin_cart);
        money = (TextView) findViewById(R.id.shangpin_money);
        setDataShuju();
        //点击事件
        cart.setOnClickListener(this);
    }

    private void setDataShuju() {
        /**
         * 获得传递过来的参数
         * 修改ui控件
         */
        Intent intent = getIntent();
        //图片
        image1 = intent.getStringExtra("image");
        //商品名字
        name1 = intent.getStringExtra("name");
        //价格
        newPrice1 = intent.getStringExtra("newPrice");
        //原价
        jiuPrice = intent.getStringExtra("jiuPrice");
        ImageLoader.getInstance().displayImage(image1,image);
        name.setText(name1);
        newprice.setText(newPrice1);
        newprice.setTextColor(Color.RED);
        jiuprice.setText(jiuPrice);
        //操作数据库
        sqlite = new CaoZuoSqlite(ShangPinXiangQing.this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //把数据添加到数据中
            case R.id.shangpin_cart:
                sqlite.insert(image1,name1, Double.parseDouble(newPrice1));
                Toast.makeText(ShangPinXiangQing.this,"添加成功",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
