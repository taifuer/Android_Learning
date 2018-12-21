package com.taifua.androidlearning.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.taifua.androidlearning.R;

public class LinearAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{

    private Context mContext;
    private OnItemClickListener mListener;

    public LinearAdapter(Context context, OnItemClickListener listener)
    {
        this.mContext = context;
        this.mListener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        if (i == 0)
            return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item, viewGroup, false));
        else
            return new LinearViewHolder2(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item2, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i)
    {
        if (getItemViewType(i) == 0)
        {
            ((LinearViewHolder)viewHolder).textView.setText("以梦为马，即刻出发");
        }
        else
        {
            ((LinearViewHolder2)viewHolder).imageView.setImageResource(R.drawable.xinyuanjieyi);
            ((LinearViewHolder2)viewHolder).textView.setText("面朝大海，春暖花开");
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mListener.onClick(i);
//                Toast.makeText(mContext, "click..." + i, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public int getItemViewType(int pos)
    {
        if (pos % 2 == 0)
            return 0;
        else
            return 1;
    }

    @Override
    public int getItemCount()
    {
        return 20;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder
    {

        private TextView textView;

        public LinearViewHolder(@NonNull View itemView)
        {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }

    class LinearViewHolder2 extends RecyclerView.ViewHolder
    {

        private TextView textView;
        private ImageView imageView;

        public LinearViewHolder2(@NonNull View itemView)
        {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
            imageView = itemView.findViewById(R.id.iv);
        }
    }

    public interface OnItemClickListener
    {
        void onClick(int pos);
    }
}
