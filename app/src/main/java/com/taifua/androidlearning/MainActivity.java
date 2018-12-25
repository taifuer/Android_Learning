package com.taifua.androidlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    private Button mBtnUIView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnUIView = findViewById(R.id.btn_ui_view);

        setListeners();
    }

    private void setListeners()
    {
        OnClick onClick = new OnClick();
        mBtnUIView.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            Intent intent = null;
            switch (view.getId())
            {
                case R.id.btn_ui_view:
                    intent = new Intent(MainActivity.this, UIActivity.class);
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }
    }
}
