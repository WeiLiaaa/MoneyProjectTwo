package com.liwei.moneyprojecttwo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by wu  suo  wei on 2017/3/15.
 * 欢迎页面
 * 停留3秒跳转下一个页面
 */

public class WelcomeActivity extends AppCompatActivity {
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            //跳转页面
            getHome();
            super.handleMessage(msg);
            sp.edit().putBoolean("falg",true).commit();
        }
    };
    private SharedPreferences sp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_main);
        handler.sendEmptyMessageDelayed(0,3000);
        sp = getSharedPreferences("daohang", MODE_PRIVATE);

    }
    public void getHome(){
        if (sp.getBoolean("falg",false)){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }else{
            Intent intent = new Intent(this, NavigateActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
