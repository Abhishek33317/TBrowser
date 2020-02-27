package com.example.tbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread ak= new Thread()
        {
            @Override
            public void run()
            {
                try {
                    sleep(5000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent home= new Intent(MainActivity.this, Main_Page2.class);
                    startActivity(home);
                }
            }

        };
        ak.start();
    }
    @Override
    protected  void onPause()
    {
        super.onPause();
        finish();
    }
}
