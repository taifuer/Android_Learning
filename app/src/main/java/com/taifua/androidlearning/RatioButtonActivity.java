package com.taifua.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RatioButtonActivity extends AppCompatActivity
{

    private RadioGroup mRg1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratio_button);

        mRg1 = findViewById(R.id.rg_1);
        mRg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i)
            {
                RadioButton radioButton = radioGroup.findViewById(i);
                Toast.makeText(RatioButtonActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
