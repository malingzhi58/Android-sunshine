package com.example.myapplication3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DialogueActivity extends AppCompatActivity {
    private Button mBtnDialog1, mBtnDialog2, mBtnDialog3, mBtnDialog4, mBtnDialog5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);
        mBtnDialog1 = findViewById(R.id.btn_diolog1);
        mBtnDialog2 = findViewById(R.id.btn_diolog2);
        mBtnDialog3 = findViewById(R.id.btn_diolog3);
        mBtnDialog4 = findViewById(R.id.btn_diolog4);
        mBtnDialog5 = findViewById(R.id.btn_diolog5);
        OnClick onClick = new OnClick();
        mBtnDialog1.setOnClickListener(onClick);
        mBtnDialog2.setOnClickListener(onClick);
        mBtnDialog3.setOnClickListener(onClick);
        mBtnDialog4.setOnClickListener(onClick);
        mBtnDialog5.setOnClickListener(onClick);
    }
    class OnClick implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
            switch (view.getId())
            {
                case R.id.btn_diolog1:
                    AlertDialog.Builder builder = new AlertDialog.Builder(DialogueActivity.this);
                    builder.setTitle("请回答：").setMessage("你喜欢计算机吗？").setIcon(R.drawable.username).setPositiveButton("喜欢", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            ToastUtil.showMsg(DialogueActivity.this, "真的吗？");
                        }
                    }).setNeutralButton("还行", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            ToastUtil.showMsg(DialogueActivity.this, "你确定吗？");
                        }
                    }).setNegativeButton("不喜欢", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            ToastUtil.showMsg(DialogueActivity.this, "为什么呢？");
                        }
                    }).show();
                    break;
                case R.id.btn_diolog2:
                    final String[] array2 = new String[]{"男", "女"};
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(DialogueActivity.this);
                    builder2.setTitle("请选择性别").setItems(array2, new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            ToastUtil.showMsg(DialogueActivity.this, array2[i]);
                        }
                    }).show();
                    break;
                case R.id.btn_diolog3:
                    final String[] array3 = new String[]{"男", "女"};
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(DialogueActivity.this);
                    builder3.setTitle("请选择性别").setSingleChoiceItems(array3, 0, new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            ToastUtil.showMsg(DialogueActivity.this, array3[i]);
                            dialogInterface.dismiss();
                        }
                    });
                    builder3.setCancelable(false).show();
                    break;
                case R.id.btn_diolog4:
                    final String[] array4 = new String[]{"唱歌", "跳舞", "写代码"};
                    final boolean[] isCheckd = new boolean[]{false, false, true};
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(DialogueActivity.this);
                    builder4.setTitle("选择兴趣").setMultiChoiceItems(array4, isCheckd, new DialogInterface.OnMultiChoiceClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i, boolean b)
                        {
                            ToastUtil.showMsg(DialogueActivity.this, array4[i] + ": " + isCheckd[i]);
                        }
                    }).setPositiveButton("确定", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {
                            ToastUtil.showMsg(DialogueActivity.this,"your choice is yes");
                        }
                    }).setNegativeButton("取消", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i)
                        {

                        }
                    }).show();
                    break;
                case R.id.btn_diolog5:
                    AlertDialog.Builder builder5 = new AlertDialog.Builder(DialogueActivity.this);
                    View loginview = LayoutInflater.from(DialogueActivity.this).inflate(R.layout.layout_dialog, null);
                    EditText username = loginview.findViewById(R.id.et_username);
                    EditText password = loginview.findViewById(R.id.et_password);
                    Button btnLogin = loginview.findViewById(R.id.btn_login);
                    btnLogin.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            //
                        }
                    });
                    builder5.setTitle("请先登录").setView(loginview).setCancelable(true).show();
                    break;
            }
        }
    }
}