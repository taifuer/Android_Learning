package com.taifua.androidlearning.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.taifua.androidlearning.R;

public class GridViewActivity extends AppCompatActivity
{

    private GridView mGv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        mGv = findViewById(R.id.gv);
        mGv.setAdapter(new MyGridAdapter(GridViewActivity.this));

        mGv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(GridViewActivity.this, "您点击了第" + i + "张图片.", Toast.LENGTH_SHORT).show();
            }
        });

       mGv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
       {
           @Override
           public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l)
           {
               Toast.makeText(GridViewActivity.this, "您长按了第" + i + "张图片.", Toast.LENGTH_SHORT).show();
               return true;
           }
       });
    }
}
