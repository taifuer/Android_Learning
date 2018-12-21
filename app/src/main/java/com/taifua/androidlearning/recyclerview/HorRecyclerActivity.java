package com.taifua.androidlearning.recycleview;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.taifua.androidlearning.R;

public class HorRecycleActivity extends AppCompatActivity
{

    private RecyclerView mRvHor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hor_recycle);
        mRvHor = findViewById(R.id.rv_hor);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(HorRecycleActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRvHor.setLayoutManager(linearLayoutManager);
        mRvHor.addItemDecoration(new MyDecoration());
        mRvHor.setAdapter(new HorAdapter(HorRecycleActivity.this, new HorAdapter.OnItemClickListener()
        {
            @Override
            public void onClick(int pos)
            {
                Toast.makeText(HorRecycleActivity.this, "click:" + pos, Toast.LENGTH_SHORT).show();
            }
        }));
    }

    class MyDecoration extends RecyclerView.ItemDecoration
    {
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state)
        {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0, 0, getResources().getDimensionPixelOffset(R.dimen.dividerHeight), 0);
        }
    }
}
