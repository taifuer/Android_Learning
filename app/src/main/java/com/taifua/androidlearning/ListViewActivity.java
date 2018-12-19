package com.taifua.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewActivity extends AppCompatActivity
{

    private final int itemNum = 15;
    private ListView mLv1;

    private List<Map<String,Object>> dataList;
    private String[] imgList = new String[itemNum+1];
    private String[] tvTitleIndex = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九", "十",
                                          "十一", "十二", "十三", "十四", "十五"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        mLv1 = findViewById(R.id.lv_1);

        initDataList();
        mLv1.setAdapter(new MyListAdapter(ListViewActivity.this, dataList, R.layout.layout_list_item));

        // 点击事件
        mLv1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(ListViewActivity.this, (String)dataList.get(i).get("tvTitle"), Toast.LENGTH_SHORT).show();
            }
        });

        // 长按事件
        mLv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
        {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast.makeText(ListViewActivity.this, (String)dataList.get(i).get("tvContent"), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    private void initDataList()
    {
        for (int i = 1; i <= itemNum; ++i)
            imgList[i] = "https://pic.taifua.com/me/material-" + i + ".png";
        dataList = new ArrayList<Map<String, Object>>();
        for (int i = 1; i <= itemNum; ++i)
        {
            Map<String, Object> map = new HashMap<String, Object>();

            map.put("tvContent", "面朝大海，春暖花开");
            map.put("tvTime", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            map.put("imageView", imgList[i]);
            map.put("tvTitle", "安卓应用开发" + tvTitleIndex[i]);

            dataList.add(map);
        }
    }
}
