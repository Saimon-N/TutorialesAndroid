//segundo activity
package com.example.tutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }

    //Metodo para el segunto activity
    public void Anterior(View view)
    {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}