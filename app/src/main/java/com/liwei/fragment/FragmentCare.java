package com.liwei.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.liwei.moneyprojecttwo.R;
import com.liwei.utils.StringURL;

/**
 * Created by wu  suo  wei on 2017/3/16.
 */

public class FragmentCare extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmentcare, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        WebView webView= (WebView) view.findViewById(R.id.cart_webView);
        String cart = StringURL.cart;
        //js交互
        webView.loadUrl(cart);
    }
}
