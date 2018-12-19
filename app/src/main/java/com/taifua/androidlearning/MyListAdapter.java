package com.taifua.androidlearning;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;
import java.util.Map;

public class MyListAdapter extends BaseAdapter
{
    private List<Map<String, Object>> mDataList;
    private Context mContext;
    private int mResource;
    private LayoutInflater mLayoutInflater;

    public MyListAdapter(Context context, List<Map<String, Object>> dataList, int resource)
    {
        this.mContext = context;
        this.mDataList = dataList;
        this.mResource = resource;
//        获取LayoutInflater的实例
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return mDataList.size();
    }

    @Override
    public Object getItem(int i)
    {
        return mDataList.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    static class ViewHolder
    {
        private ImageView imageView;
        private TextView tvTitle, tvTime, tvContent;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        ViewHolder holder = null;
        if (view == null)
        {
//            调用它的inflate()方法来加载布局
            view = mLayoutInflater.inflate(mResource, null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.iv);
            holder.tvTitle = view.findViewById(R.id.tv_title);
            holder.tvTime = view.findViewById(R.id.tv_time);
            holder.tvContent = view.findViewById(R.id.tv_content);
            view.setTag(holder);
        }
        else holder = (ViewHolder) view.getTag();
        Map<String, Object> map = mDataList.get(i);

        holder.tvTitle.setText((String) map.get("tvTitle"));
        holder.tvTime.setText((String) map.get("tvTime"));
        holder.tvContent.setText((String) map.get("tvContent"));
        Glide.with(mContext).load((String) map.get("imageView")).into(holder.imageView);
//        holder.tvTitle.setText("安卓应用开发");
//        holder.tvTime.setText("2018-12-19");
//        holder.tvContent.setText("面朝大海，春暖花开");
//        Glide.with(mContext).load("https://pic.taifua.com/me/material-1.png").into(holder.imageView);
        return view;
    }
}
