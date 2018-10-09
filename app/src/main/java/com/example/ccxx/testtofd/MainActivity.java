package com.example.ccxx.testtofd;

import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity{
//    private int i= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();//隐藏活动标题
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//隐藏顶部状态栏
        hideBottomUIMenu();
//      用一级菜单初始化左侧菜单栏
//        FragmentManager fragmentManager = getSupportFragmentManager();//向当前活动提出事务申请
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.first_menu_frag,new FirstMenuFragment());
//        transaction.commit();
//        transaction.replace(R.id.third_menu_frag,new ThirdMenuFrag());
//        transaction.commit();
        fir_menu_replaceFragment(new FirstMenuFragment());
        thir_menu_replaceFragment(new ThirdMenuFrag());
    }

    protected void hideBottomUIMenu() {//隐藏底部导航栏
            Window _window = getWindow();
            WindowManager.LayoutParams params = _window.getAttributes();
            params.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|
                    View.SYSTEM_UI_FLAG_IMMERSIVE;
            _window.setAttributes(params);
    }

    private void fir_menu_replaceFragment(Fragment fragment){//第一级菜单替换
        FragmentManager fragmentManager = getSupportFragmentManager();//向当前活动提出事务申请
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.first_menu_frag,fragment);
        transaction.commit();
    }

    private void thir_menu_replaceFragment(Fragment fragment){//第三级菜单替换
        FragmentManager fragmentManager = getSupportFragmentManager();//向当前活动提出事务申请
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.third_menu_frag,fragment);
        transaction.commit();
    }
}

