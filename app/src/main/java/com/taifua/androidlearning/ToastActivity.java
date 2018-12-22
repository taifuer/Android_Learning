package com.taifua.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity
{

    private Button mBtnToast1;
    private Button mBtnToast2;
    private Button mBtnToast3;
    private Button mBtnToast4;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        OnClick onClick = new OnClick();

        mBtnToast1 = findViewById(R.id.btn_toast1);
        mBtnToast2 = findViewById(R.id.btn_toast2);
        mBtnToast3 = findViewById(R.id.btn_toast3);
        mBtnToast4 = findViewById(R.id.btn_toast4);
        mBtnToast1.setOnClickListener(onClick);
        mBtnToast2.setOnClickListener(onClick);
        mBtnToast3.setOnClickListener(onClick);
        mBtnToast4.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            switch (view.getId())
            {
                case R.id.btn_toast1:
                    Toast.makeText(getApplicationContext(), "Toast", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn_toast2:
                    Toast toastCenter = Toast.makeText(getApplicationContext(), "居中Toast", Toast.LENGTH_LONG);
                    toastCenter.setGravity(Gravity.CENTER, 0, 0);
                    toastCenter.show();
                    break;
                case R.id.btn_toast3:
                    Toast toastCustom = new Toast(getApplicationContext());
                    LayoutInflater inflater = LayoutInflater.from(ToastActivity.this);
                    View viewCustom = inflater.inflate(R.layout.layout_toast, null);
                    ImageView imageView = viewCustom.findViewById(R.id.iv_toast);
                    TextView textView = viewCustom.findViewById(R.id.tv_toast);
                    imageView.setImageResource(R.drawable.smile);
                    textView.setText("自定义Toast");
                    toastCustom.setView(viewCustom);
                    toastCustom.setDuration(Toast.LENGTH_LONG);
                    toastCustom.show();
                    break;
                case R.id.btn_toast4:
                    ToastUtil.showMsg(ToastActivity.this, "包装过的Toast");
                default:
                    break;
            }
        }
    }
}
