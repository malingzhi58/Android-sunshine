package com.example.myapplication3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity2 extends AppCompatActivity {
    private WebView mWVMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view2);
        mWVMain = findViewById(R.id.wb);
//        mWVMain.loadUrl("file:///android_asset/404.html");
        mWVMain.getSettings().setJavaScriptEnabled(true);
//        mWVMain.loadUrl("https://taifua.com/");
        mWVMain.setWebViewClient(new MyWebViewClient());
        mWVMain.setWebChromeClient(new MyWebChromeClient());
        mWVMain.loadUrl("https://m.baidu.com");
    }

    private class MyWebViewClient extends WebViewClient {
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request)
//        {
//            view.loadUrl(request.getUrl().toString());
//            return true;
//        }
//

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
//            return super.shouldOverrideUrlLoading(view, request);
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                view.loadUrl(request.getUrl().toString());
//            }
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon)
        {
            super.onPageStarted(view, url, favicon);
            Log.d("Webview", "onPageStarted...");
        }

        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        @Override
        public void onPageFinished(WebView view, String url)
        {
            super.onPageFinished(view, url);
            Log.d("Webview", "onPageFinished...");
            mWVMain.loadUrl("javascript:alert('hello')");
            mWVMain.evaluateJavascript("javascript:alert('hello')", null);
        }
    }
    class MyWebChromeClient extends WebChromeClient
    {
        @Override
        public void onProgressChanged(WebView view, int newProgress)
        {
            super.onProgressChanged(view, newProgress);
        }

        @Override
        public void onReceivedTitle(WebView view, String title)
        {
            super.onReceivedTitle(view, title);
            setTitle(title);
        }
    }
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK && mWVMain.canGoBack())
        {
            mWVMain.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}