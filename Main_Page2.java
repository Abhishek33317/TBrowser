package com.example.tbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.net.URL;

public class Main_Page2 extends AppCompatActivity implements View.OnClickListener {
    private EditText edit;
    private Button search;
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__page2);
        edit = (EditText) findViewById(R.id.text);
        search = (Button) findViewById(R.id.search1);
        button1 = (ImageButton) findViewById(R.id.google);
        button2 = (ImageButton) findViewById(R.id.facebook);
        button3 = (ImageButton) findViewById(R.id.twitter);
        button4 = (ImageButton) findViewById(R.id.pinterest);
        button5 = (ImageButton) findViewById(R.id.youtube);
        button6 = (ImageButton) findViewById(R.id.instagram);

        search.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view == search) {
          OpenWebsite();
        }
        if (view == button1) {
            Intent google = new Intent(Main_Page2.this, Search.class);
            google.putExtra("url_address", "http://www.google.com");
            startActivity(google);
        }
        if (view == button2) {
            Intent facebook = new Intent(Main_Page2.this, Search.class);
            facebook.putExtra("url_address", "http://www.facebook.com");
            startActivity(facebook);
        }
        if (view == button3) {
            Intent twitter = new Intent(Main_Page2.this, Search.class);
            twitter.putExtra("url_address", "http://www.twitter.com");
            startActivity(twitter);
        }
        if (view == button4) {
            Intent pinterest = new Intent(Main_Page2.this, Search.class);
            pinterest.putExtra("url_address", "http://www.pinterest.com");
            startActivity(pinterest);
        }
        if (view == button5) {
            Intent youtube = new Intent(Main_Page2.this, Search.class);
            youtube.putExtra("url_address", "http://www.youtube.com");
            startActivity(youtube);
        }
        if (view == button6) {
            Intent instagram = new Intent(Main_Page2.this, Search.class);
            instagram.putExtra("url_address", "http://www.instagram.com");
            startActivity(instagram);
        }
    }

    private  void OpenWebsite()
    {
       String url_add= edit.getText().toString();
        if(TextUtils.isEmpty(url_add))
        {
        Toast empty=Toast.makeText(Main_Page2.this,"please enter Url or Web Address",Toast.LENGTH_LONG);
                empty.show();
        }
        else
        {
            String url_without_http=url_add.replaceAll("https://www.","");
            Intent search=new Intent(Main_Page2.this,Search.class);
            String https="https://";
            String www="www.";
            search.putExtra("url_address",https+www+url_without_http);
            startActivity(search);
        }

    }
}

