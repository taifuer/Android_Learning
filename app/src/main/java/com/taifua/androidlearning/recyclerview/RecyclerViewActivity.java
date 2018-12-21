package com.taifua.androidlearning.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.taifua.androidlearning.MainActivity;
import com.taifua.androidlearning.R;
import com.taifua.androidlearning.gridview.GridViewActivity;

public class RecycleViewActivity extends AppCompatActivity
{

    private Button mBtnLinear;
    private Button mBtnHor;
    private Button mBtnGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        mBtnLinear = findViewById(R.id.btn_linear);
        mBtnHor = findViewById(R.id.btn_hor);
        mBtnGrid = findViewById(R.id.btn_grid);
        mBtnLinear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(RecycleViewActivity.this, LinearRecycleViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnHor.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(RecycleViewActivity.this, HorRecycleActivity.class);
                startActivity(intent);
            }
        });
        mBtnGrid.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(RecycleViewActivity.this, GridRecycleViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
