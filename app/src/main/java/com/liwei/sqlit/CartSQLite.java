package com.liwei.sqlit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by wu  suo  wei on 2017/3/25.
 *
 * 创建数据库
 */


public class CartSQLite extends SQLiteOpenHelper {
    public CartSQLite(Context context) {
        super(context, "shop_cart", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table cart(_id integer primary key autoincrement,imageUrl varchar(100) unique,name varchar(20),price double)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

