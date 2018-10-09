package com.example.ccxx.testtofd;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayWindowFragment extends Fragment {
    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.right_layout, container, false);
        return view;
    }

    public void top_init (){
        TextView current_channel_text = (TextView) view.findViewById(R.id.current_channel);
        TextView gain_text = (TextView) view.findViewById(R.id.gain);
        TextView sound_path_text = (TextView) view.findViewById(R.id.sound_path);
        TextView delay_time_text = (TextView) view.findViewById(R.id.delay_time);
        TextView sound_speed_text = (TextView) view.findViewById(R.id.sound_speed);
        TextView scan_depth_text = (TextView) view.findViewById(R.id.scan_depth);
        current_channel_text.setText("当前通道\nTOFD1");
        gain_text.setText("增益(dB)\n55.0");
        sound_path_text.setText("声程(us)\n46.0");
        delay_time_text.setText("延时(us)\n10.0");
        sound_speed_text.setText("声速(m/s)\n5900.0");
        scan_depth_text.setText("扫查长度\n200.00(mm)");
    }

}
