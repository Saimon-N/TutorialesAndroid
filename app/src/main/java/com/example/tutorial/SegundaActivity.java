//segundo activity
package com.example.tutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tv1=(TextView)findViewById(R.id.tv1);

        String dato = getIntent().getStringExtra("batman");
        tv1.setText("Hola"+dato);
    }

    //metodo del boton de la segunda actividad
    public void Regresar(View view)
    {
        Intent j=new Intent(this, MainActivity.class);
        startActivity(j);
    }
}