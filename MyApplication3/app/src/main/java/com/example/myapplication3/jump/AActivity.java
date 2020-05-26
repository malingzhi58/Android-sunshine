package com.example.myapplication3.jump;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication3.R;

public class AActivity extends AppCompatActivity {
    private Button mbtn_jump;
    // activity 启动模式
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_a );
        Log.d("AAcitivity","oncreat");
        Log.d("AActivity","taskid"+getTaskId()+" hash"+hashCode());
        logtaskName();
        mbtn_jump = findViewById( R.id.btn_jump );
        mbtn_jump.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显式一；
                Intent intent = new Intent(AActivity.this,BActivity.class );
                Bundle bundle = new Bundle(  );
                bundle.putString( "name","Matrix" );
                bundle.putInt( "No",9527 );
                intent.putExtras( bundle );
//                startActivity( intent );
                startActivityForResult( intent,0 );

                //显式二；
//                Intent intent = new Intent(  );
//                intent.setClass( AActivity.this,BActivity.class );
//                startActivity( intent );

                //显式三；
//                Intent intent = new Intent(  );
//                intent.setClassName( AActivity.this,"com.example.matrix.jump.BActivity" );
//                startActivity( intent );

                //显式四；
//                Intent intent = new Intent(  );
//                intent.setComponent( new ComponentName( AActivity.this,"com.example.matrix.jump.BActivity" ) );
//                startActivity( intent );

                //隐式一；
//                Intent intent = new Intent(  );
//                intent.setAction( "android.example.action.BActivity" );
//                startActivity( intent );

            }
        } );
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("AAcitivity","oncreat");
        Log.d("AActivity","taskid"+getTaskId()+" hash"+hashCode());
        logtaskName();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult( requestCode, resultCode, data );
        String getback = data.getExtras().getString("return");
        Toast.makeText( AActivity.this,getback,Toast.LENGTH_SHORT ).show();
    }
    private void logtaskName(){
        try {
            ActivityInfo activityInfo = getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            // print 任务栈的name
            Log.d("AActivity",activityInfo.taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
