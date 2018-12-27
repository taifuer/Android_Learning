package com.taifua.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.taifua.androidlearning.widget.CustomDialog;

public class CustomDialogActivity extends AppCompatActivity
{

    private Button mBtnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
        mBtnDialog = findViewById(R.id.btn_custom_dialog);
        mBtnDialog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CustomDialog customDialog = new CustomDialog(CustomDialogActivity.this, R.style.CustomDialog);
                customDialog.setTitle("提示").setMessage("确认删除此项？")
                        .setCancel("取消", new CustomDialog.IonCancelListener()
                        {
                            @Override
                            public void onCancel(CustomDialog dialog)
                            {
                                ToastUtil.showMsg(CustomDialogActivity.this, "已取消");
                            }
                        }).setConfirm("确认", new CustomDialog.IonConfirmListener()
                        {
                            @Override
                            public void onConfirm(CustomDialog dialog)
                            {
                                ToastUtil.showMsg(CustomDialogActivity.this, "确认成功");
                            }
                        }).show();
            }
        });
    }
}
