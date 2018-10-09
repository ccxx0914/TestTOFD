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

public class FirstMenuFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_menu_fragment, container, false);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button button_file_system = (Button) getActivity().
                findViewById(R.id.file_system);//在当前活动中获取按键id
        button_file_system.setOnClickListener(new ButtonListener());
    }

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.file_system:
                    replaceFragment(new SecondFileSystemFrag());
                    break;
                default:
                    break;
            }
        }
    }

    private void replaceFragment(Fragment fragment){//第一级菜单替换
        MainActivity activity = (MainActivity) getActivity();//从碎片中获取当前所在的活动
        FragmentManager fragmentManager = activity.getSupportFragmentManager();//向当前活动提出事务申请
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.first_menu_frag,fragment);
        transaction.commit();
    }
}
