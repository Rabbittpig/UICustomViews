package com.example.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Author: Created by zwp on 2020/9/29.
 */
public class TitleLayout extends LinearLayout {
    public TitleLayout(final Context context, AttributeSet attrs) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button titleBack = findViewById(R.id.title_back);
        Button titleEdit = findViewById(R.id.text_edit);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity)getContext()).finish();
            }
        });
        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"You clicked Edit button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
