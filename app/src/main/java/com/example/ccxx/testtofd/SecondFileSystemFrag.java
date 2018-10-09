package com.example.ccxx.testtofd;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SecondFileSystemFrag extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_file_sys_frag, container, false);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button_second_file_sys = (Button) getActivity().
                findViewById(R.id.second_file_system);//在当前活动中获取按键id
        button_second_file_sys.setOnClickListener(new ButtonListener());
        Button button_data_manage = (Button) getActivity().
                findViewById(R.id.data_manage);//在当前活动中获取按键id
        button_data_manage.setOnClickListener(new ButtonListener());
        Button button_data_analysis = (Button) getActivity().
                findViewById(R.id.data_analysis);//在当前活动中获取按键id
        button_data_analysis.setOnClickListener(new ButtonListener());
    }

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.second_file_system:
                    fir_menu_replaceFragment(new FirstMenuFragment());
                    thir_menu_replaceFragment(new ThirdMenuFrag());
                break;
                case R.id.data_manage:
                    thir_menu_replaceFragment(new ThirdDataManageFrag());
                break;
                case R.id.data_analysis:
                    thir_menu_replaceFragment(new ThirdWorkplaceCondFrag());
                default:
                    break;
            }
        }
    }

    private void fir_menu_replaceFragment(Fragment fragment){//第一级菜单替换
        MainActivity activity = (MainActivity) getActivity();//从碎片中获取当前所在的活动
        FragmentManager fragmentManager = activity.getSupportFragmentManager();//向当前活动提出事务申请
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.first_menu_frag,fragment);
        transaction.commit();
    }

    private void thir_menu_replaceFragment(Fragment fragment){//第三级菜单替换
        MainActivity activity = (MainActivity) getActivity();//从碎片中获取当前所在的活动
        FragmentManager fragmentManager = activity.getSupportFragmentManager();//向当前活动提出事务申请
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.third_menu_frag,fragment);
        transaction.commit();
    }
}
