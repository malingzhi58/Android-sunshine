package com.example.myapplication3.datastorage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication3.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileActivity extends AppCompatActivity {
    private EditText mEtName;
    Button mBtnSave, mBtnshow;
    TextView mTvContent;
    private SharedPreferences mSharedPref;
    private SharedPreferences.Editor mEditor;
    private final  String mFilename ="test.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);
        mEtName =findViewById(R.id.et_name);
        mBtnSave=findViewById(R.id.btn_save);
        mBtnshow = findViewById(R.id.btn_show);
        mTvContent = findViewById(R.id.et_content);
        mBtnSave.setOnClickListener((v -> {save(mEtName.getText().toString());}));

        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save(mEtName.getText().toString());
            }
        });
        mBtnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvContent.setText(read());
            }
        });

    }

    private void save(String content){
        FileOutputStream fileOutputStream=null;
        try {
            File dir = new File(Environment.getExternalStorageDirectory(),"skypan");
            if(!dir.exists()){
                dir.mkdirs();
            }
            File file = new File(dir,mFilename);
            if(!file.exists()){
                file.createNewFile();
            }
            // 这是内部存储
//            fileOutputStream = openFileOutput(mFilename,MODE_PRIVATE);
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(content.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileOutputStream != null;
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private String read(){
        FileInputStream fileInputStream = null;
        try {

//            fileInputStream=openFileInput(mFilename);

            // which is deprecated
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+File.separator+"skypan",mFilename);
            byte[] buff = new byte[1024];
            StringBuilder sb = new StringBuilder();
            int len =0;
            while((len=fileInputStream.read(buff))>0){
                sb.append(new String(buff,0,len));
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert fileInputStream != null;
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}