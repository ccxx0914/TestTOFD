package com.example.ccxx.testtofd;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextButton extends LinearLayout {
    private Button button;
    private TextView textView;
    public TextButton(Context context){
        super(context);
    }

    public TextButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.third_textbtn, this);
        button =(Button) findViewById(R.id.textbtn_btn);
        textView=(TextView) findViewById(R.id.textbtn_text);
    }

    public void setTextViewText(String text) {
       textView.setText(text);
    }

    public void setButtonText(String text) {
        button.setText(text);
    }
}
