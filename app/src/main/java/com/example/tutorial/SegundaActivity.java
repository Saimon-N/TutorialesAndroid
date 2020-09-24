//segundo activity
package com.example.tutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        wv1=(WebView)findViewById(R.id.wv1);
        String URL=getIntent().getStringExtra("batman");
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("http://"+URL);
    }
    //metodo para cerra
    public void Cerra(View view)
    {
        finish();
    }
}