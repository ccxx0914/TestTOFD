package com.example.ccxx.testtofd;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ThirdWorkplaceCondFrag extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.third_workplace_cond_frag, container, false);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextButton workpiece_thick = (TextButton) getActivity().findViewById(R.id.workpiece_thickness);
        TextButton weld_width = (TextButton) getActivity().findViewById(R.id.weld_width);
        TextButton groove_form = (TextButton) getActivity().findViewById(R.id.groove_form);
        TextButton curvature_radius = (TextButton) getActivity().findViewById(R.id.curvature_radius);

        workpiece_thick.setTextViewText("0.0mm");
        workpiece_thick.setButtonText("工件厚度");
        weld_width.setTextViewText("0.0mm");
        weld_width.setButtonText("焊缝宽度");
        groove_form.setTextViewText("V型");
        groove_form.setButtonText("坡口形式");
        curvature_radius.setTextViewText("0.0mm");
        curvature_radius.setButtonText("曲率半径");

//        Button button_second_file_sys = (Button) getActivity().
//                findViewById(R.id.second_file_system);//在当前活动中获取按键id
//        button_second_file_sys.setOnClickListener(new SecondFileSystemFrag.ButtonListener());
//        Button button_data_manage = (Button) getActivity().
//                findViewById(R.id.data_manage);//在当前活动中获取按键id
//        button_data_manage.setOnClickListener(new SecondFileSystemFrag.ButtonListener());
    }
}
