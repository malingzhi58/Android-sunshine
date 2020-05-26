package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication3.widget.CustomDialog;

public class CustomeDialogActivity extends AppCompatActivity {
    private Button mBtnDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_dialog);
        mBtnDialog = findViewById(R.id.btn_custom_dialog);
        mBtnDialog.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                CustomDialog customDialog = new CustomDialog(CustomeDialogActivity.this, R.style.CustomDialog);
//                customDialog..setTitle("提示");
                customDialog.setMessage("确认删除此项？")
                        .setCancel("取消", new CustomDialog.IonCancelListener()
                        {
                            @Override
                            public void onCancel(CustomDialog dialog)
                            {
                                ToastUtil.showMsg(CustomeDialogActivity.this, "已取消");
                            }
                        }).setConfirm("不会把不会吧", new CustomDialog.IonConfirmListener()
                {
                    @Override
                    public void onConfirm(CustomDialog dialog)
                    {
                        ToastUtil.showMsg(CustomeDialogActivity.this, "确认成功");
                    }
                }).show();
            }
        });
    }
}