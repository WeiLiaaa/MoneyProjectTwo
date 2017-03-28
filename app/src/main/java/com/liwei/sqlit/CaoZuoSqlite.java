package com.liwei.sqlit;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by wu  suo  wei on 2017/3/25.
 * 操作数据库的帮助类   之封装
 */

public class CaoZuoSqlite {
    private Context context;
    private CartSQLite sqlite;
    public CaoZuoSqlite(Context context) {
        this.context=context;
    }
    public void insert(String imageUrl, String name, double price) {
        //实例化数据库sqliteopenhelper
        sqlite = new CartSQLite(context);
        //创建可读可写的数据库
        SQLiteDatabase db = sqlite.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("imageUrl", imageUrl);
        values.put("name", name);
        values.put("price", price);
        db.insert("cart", null, values);
        db.close();
    }

    public void update(String imageUrl,String name) {
        //实例化数据库sqliteopenhelper
        sqlite = new CartSQLite(context);
        //创建可读可写的数据库
        SQLiteDatabase db = sqlite.getWritableDatabase();
        ContentValues values=new ContentValues();
        //values是要修改的内容
        //第二个参数是修改的条件
        //第三个参数是对应的传入参数
        values.put("imageUrl", imageUrl);
        db.update("cart", values, "name=?", new String[]{name});
        db.close();
    }

    public void delete(String name) {
        //实例化数据库sqliteopenhelper
        sqlite = new CartSQLite(context);
        //创建可读可写的数据库
        SQLiteDatabase db = sqlite.getWritableDatabase();
        //按条件删除
        db.delete("cart", "name=?", new String [] {name});
        db.close();

    }

    public ArrayList<CartBean> query() {
        ArrayList<CartBean> list=new ArrayList<>();
        //实例化数据库sqliteopenhelper
        sqlite = new CartSQLite(context);
        //注意查询中不能关闭数据库否则报空指针异常

        //创建可读可写的数据库
        SQLiteDatabase db = sqlite.getWritableDatabase();

        Cursor cursor = db.query("cart", null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            CartBean bean=new CartBean();
            String imageUrl = cursor.getString(cursor.getColumnIndex("imageUrl"));
            String name = cursor.getString(cursor.getColumnIndex("name"));
            int price = cursor.getInt(cursor.getColumnIndex("price"));
            bean.setImage(imageUrl);
            bean.setName(name);
            bean.setPrice(price);
            list.add(bean);
        }
        return list;
    }
}
