package com.taifua.androidlearning.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.taifua.androidlearning.R;

public class ListViewActivity extends AppCompatActivity
{

    private ListView mLv1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        mLv1 = findViewById(R.id.lv_1);
        mLv1.setAdapter(new MyListAdapter(ListViewActivity.this));

        // 点击事件
        mLv1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(ListViewActivity.this, "点击 pos: " + i, Toast.LENGTH_SHORT).show();
            }
        });

        // 长按事件
        mLv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
        {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(ListViewActivity.this, "长按 pos: " + i, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
