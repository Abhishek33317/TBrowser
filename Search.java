package com.example.tbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class Search extends AppCompatActivity {
    public EditText UrlInput;
    public Button search;
    public Button home;
    public View view;
    public ProgressBar progressBar;
    public WebView searchAddress;
    String url;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
         view=(View)findViewById(R.id.divider);
         url=getIntent().getExtras().get("url_address").toString();

         UrlInput=(EditText) findViewById(R.id.edit2);
         search=(Button) findViewById(R.id.search2);
         searchAddress=(WebView)findViewById(R.id.webview);
         home=(Button) findViewById(R.id.home);
         progressBar=(ProgressBar)findViewById(R.id.progressBar);
        WebSettings webSettings=searchAddress.getSettings();
        webSettings.setJavaScriptEnabled(true);
        searchAddress.loadUrl(url);
        searchAddress.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed()
    {
        if(searchAddress.canGoBack())
        {
            searchAddress.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
