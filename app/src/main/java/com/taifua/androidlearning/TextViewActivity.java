package com.taifua.androidlearning;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity
{

    private TextView mTv4;
    private TextView mTv5;
    private TextView mTv6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        mTv4 = findViewById(R.id.tv_4);
        // 中划线
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        // 去除锯齿
        mTv4.getPaint().setAntiAlias(true);

        mTv5 = findViewById(R.id.tv_5);
        // 下划线
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        mTv6 = findViewById(R.id.tv_6);
        mTv6.setText(Html.fromHtml("<u>平凡的世界</u>"));
    }
}
