package com.taifua.androidlearning;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity
{

    private WebView mBtnWv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        mBtnWv = findViewById(R.id.wv);
        // 加载本地html
//        mBtnWv.loadUrl("file:///android_asset/404.html");
        // 加载网络url
        mBtnWv.getSettings().setJavaScriptEnabled(true);
        mBtnWv.setWebViewClient(new MyWebViewClient());
        mBtnWv.setWebChromeClient(new MyWebChromeClient());
        mBtnWv.loadUrl("https://taifua.com/");
    }

    class MyWebViewClient extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request)
        {
            view.loadUrl(request.getUrl().toString());
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon)
        {
            super.onPageStarted(view, url, favicon);
            Log.d("Webview", "onPageStarted...");
        }

        @Override
        public void onPageFinished(WebView view, String url)
        {
            super.onPageFinished(view, url);
            Log.d("Webview", "onPageFinished...");
//            mBtnWv.loadUrl("javascript:alert('hello')");
            mBtnWv.evaluateJavascript("javascript:alert('hello')", null);
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
        if (keyCode == KeyEvent.KEYCODE_BACK && mBtnWv.canGoBack())
        {
            mBtnWv.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
