package com.taifua.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity
{
    private CheckBox mCb6, mCb7, mCb8;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        mCb6 = findViewById(R.id.cb_6);
        mCb7 = findViewById(R.id.cb_7);
        mCb8 = findViewById(R.id.cb_8);


        mCb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                Toast.makeText(CheckBoxActivity.this, b?"6选中":"6未选中", Toast.LENGTH_SHORT).show();
            }
        });
        mCb7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                Toast.makeText(CheckBoxActivity.this, b?"7选中":"7未选中", Toast.LENGTH_SHORT).show();
            }
        });
        mCb8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b)
            {
                Toast.makeText(CheckBoxActivity.this, b?"8选中":"8未选中", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
