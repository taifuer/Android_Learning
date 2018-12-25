package com.taifua.androidlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.taifua.androidlearning.gridview.GridViewActivity;
import com.taifua.androidlearning.listview.ListViewActivity;
import com.taifua.androidlearning.recyclerview.RecyclerViewActivity;

public class UIActivity extends AppCompatActivity
{

    private Button mBtnLinearlayout;
    private Button mBtnRelativelayout;
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRatioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnScrollView;
    private Button mBtnRecycleView;
    private Button mBtnWebView;
    private Button mBtnToast;
    private Button mBtnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        mBtnLinearlayout = findViewById(R.id.btn_linearlayout);
        mBtnRelativelayout = findViewById(R.id.btn_relativelayout);
        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnButton = findViewById(R.id.btn_button);
        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnRatioButton = findViewById(R.id.btn_ratiobutton);
        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnImageView = findViewById(R.id.btn_image_view);
        mBtnListView = findViewById(R.id.btn_list_view);
        mBtnGridView = findViewById(R.id.btn_grid_view);
        mBtnScrollView = findViewById(R.id.btn_scroll_view);
        mBtnRecycleView = findViewById(R.id.btn_recycle_view);
        mBtnWebView = findViewById(R.id.btn_web_view);
        mBtnToast = findViewById(R.id.btn_toast);
        mBtnDialog = findViewById(R.id.btn_dialog);

        setListeners();
    }

    // 监听器方法
    private void setListeners()
    {
        OnClick onClick = new OnClick();
        mBtnLinearlayout.setOnClickListener(onClick);
        mBtnRelativelayout.setOnClickListener(onClick);
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRatioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnScrollView.setOnClickListener(onClick);
        mBtnRecycleView.setOnClickListener(onClick);
        mBtnWebView.setOnClickListener(onClick);
        mBtnToast.setOnClickListener(onClick);
        mBtnDialog.setOnClickListener(onClick);
    }

    // 实现监听器接口
    private class OnClick implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            Intent intent = null;
            switch (view.getId())
            {
                // 跳转到LinearLayout演示页面
                case R.id.btn_linearlayout:
                    intent = new Intent(UIActivity.this, LinearlayoutActivity.class);
                    break;
                // 跳转到RelativeLayout演示页面
                case R.id.btn_relativelayout:
                    intent = new Intent(UIActivity.this, RelativelayoutActivity.class);
                    break;
                // 跳转到TextView演示页面
                case R.id.btn_textview:
                    intent = new Intent(UIActivity.this, TextViewActivity.class);
                    break;
                // 跳转到Button演示页面
                case R.id.btn_button:
                    intent = new Intent(UIActivity.this, ButtonActivity.class);
                    break;
                // 跳转到EditText演示页面
                case R.id.btn_edittext:
                    intent = new Intent(UIActivity.this, EditTextActivity.class);
                    break;
                // 跳转到RatioButton演示页面
                case R.id.btn_ratiobutton:
                    intent = new Intent(UIActivity.this, RatioButtonActivity.class);
                    break;
                // 跳转到CheckBox演示页面
                case R.id.btn_checkbox:
                    intent = new Intent(UIActivity.this, CheckBoxActivity.class);
                    break;
                // 跳转到ImageView演示页面
                case R.id.btn_image_view:
                    intent = new Intent(UIActivity.this, ImageViewActivity.class);
                    break;
                // 跳转到ListView演示页面
                case R.id.btn_list_view:
                    intent = new Intent(UIActivity.this, ListViewActivity.class);
                    break;
                // 跳转到GridView演示页面
                case R.id.btn_grid_view:
                    intent = new Intent(UIActivity.this, GridViewActivity.class);
                    break;
                // 跳转到ScrollView演示页面
                case R.id.btn_scroll_view:
                    intent = new Intent(UIActivity.this, ScrollViewActivity.class);
                    break;
                // 跳转到RecycleView演示页面
                case R.id.btn_recycle_view:
                    intent = new Intent(UIActivity.this, RecyclerViewActivity.class);
                    break;
                // 跳转到WebView演示页面
                case R.id.btn_web_view:
                    intent = new Intent(UIActivity.this, WebViewActivity.class);
                    break;
                // 跳转到Toast页面
                case R.id.btn_toast:
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    break;
                // 跳转到Dialog页面
                case R.id.btn_dialog:
                    intent = new Intent(UIActivity.this, DialogActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        }
    }
}


