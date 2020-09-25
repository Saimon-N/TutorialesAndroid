//Aplicamos un SharedPrferences
//nos ayuda para almecenear datos pero de forma "temporar"

package com.example.tutorial;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.mail);

        //como utilizar el SharedPrferences;
        SharedPreferences Guason= getSharedPreferences("batman", Context.MODE_PRIVATE);
        et1.setText(Guason.getString("mail",""));
    }

    //crear el metodo del boton
    public void Guardar(View view)
    {
        SharedPreferences preferncias=getSharedPreferences("batman", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferncias.edit();
        editor.putString("mail", et1.getText().toString());
        editor.commit();
        finish();
    }
}
