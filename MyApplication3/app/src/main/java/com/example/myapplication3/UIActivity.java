package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication3.Listview.ListViewActivity2;
import com.example.myapplication3.gridview.GridViewActivity;
import com.example.myapplication3.jump.AActivity;
import com.example.myapplication3.recyclerview.RecyclerViewActivity;

public class UIActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText,mBtnRadioButton,mBtnProgress,mBtnCustomeDialog;
    private Button mBtnCheckBox,mBtnImageView,mBtnListView,mBtnGridView,mBtnRv,mBtnWeb,mBtnToast,mBtnDialog;
    private Button mBtnPopupWindow;
    private Button mBtnJump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        mBtnTextView = findViewById(R.id.bottom_1);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIActivity.this, TextViewActivity2.class);
                startActivity(intent);
            }
        });
        mBtnButton=findViewById(R.id.bottom_2);
        mBtnEditText = findViewById(R.id.btn_editext);
        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnImageView = findViewById(R.id.btn_imageview);
        mBtnListView = findViewById(R.id.btn_listview);
        mBtnGridView = findViewById(R.id.btn_gridview);
        mBtnRv = findViewById(R.id.btn_rv);
        mBtnWeb = findViewById(R.id.btn_wv);
        mBtnToast =findViewById(R.id.btn_toast);
        mBtnDialog =findViewById(R.id.btn_dialog);
        mBtnProgress =findViewById(R.id.btn_pb);
        mBtnCustomeDialog =findViewById(R.id.btn_custom_dialog);
        mBtnPopupWindow = findViewById(R.id.btn_popup);
        mBtnJump = findViewById(R.id.btn_jump_ui);
//        R.id.btn_jump
        setListeners();
    }
    private void setListeners()
    {
        OnClick onClick = new OnClick();
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnTextView.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnRv.setOnClickListener(onClick);
        mBtnWeb.setOnClickListener(onClick);
        mBtnToast.setOnClickListener(onClick);
        mBtnDialog.setOnClickListener(onClick);
        mBtnProgress.setOnClickListener(onClick);
        mBtnCustomeDialog.setOnClickListener(onClick);
        mBtnPopupWindow.setOnClickListener(onClick);
        mBtnJump.setOnClickListener(onClick);

    }
    private  class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.btn_radiobutton:
                    intent = new Intent(UIActivity.this,RadioButtonActivity2.class);
                    break;
                case R.id.bottom_1:
                    intent = new Intent(UIActivity.this,TextViewActivity2.class);
                    break;
                case R.id.bottom_2:
                    intent = new Intent(UIActivity.this,ButtonActivity2.class);
                    break;
                case R.id.btn_checkbox:
                    intent = new Intent(UIActivity.this,CheckBoxActivity2.class);
                    break;
                case R.id.btn_imageview:
                    intent = new Intent(UIActivity.this,ImageViewActivity2.class);
                    break;
                case R.id.btn_listview:
                    intent = new Intent(UIActivity.this, ListViewActivity2.class);
                    break;
                case R.id.btn_gridview:
                    intent = new Intent(UIActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_rv:
                    intent = new Intent(UIActivity.this, RecyclerViewActivity.class);
                    break;
                case R.id.btn_wv:
                    intent = new Intent(UIActivity.this, WebViewActivity2.class);
                    break;
                case R.id.btn_toast:
                    intent = new Intent(UIActivity.this, ToastActivity2.class);
                    break;
                case R.id.btn_dialog:
                    intent = new Intent(UIActivity.this, DialogueActivity.class);
                    break;
                case R.id.btn_pb:
                    intent = new Intent(UIActivity.this, ProgressActivity.class);
                    break;
                case R.id.btn_custom_dialog:
                    intent = new Intent(UIActivity.this, CustomeDialogActivity.class);
                    break;
                case R.id.btn_popup:
                    intent = new Intent(UIActivity.this, PopUpWindowActivity.class);
                    break;
                case R.id.btn_jump_ui:
                    intent = new Intent(UIActivity.this, AActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}