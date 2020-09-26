//Hacemos una agenda con SharedPrferences
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
    private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.nombre);
        et2=(EditText)findViewById(R.id.datos);
    }
    //creamos el metodo guardar
    public void Guardar(View view)
    {
        String nombre=et1.getText().toString();
        String datos=et2.getText().toString();

        SharedPreferences preferencia= getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencia.edit();
        editor.putString(nombre, datos);

        editor.commit();
        Toast.makeText(this,"El contacto ha sido guardado",Toast.LENGTH_SHORT).show();
    }

    //creamos el metodo buscar
    public void Buscar(View view)
    {
        String nombre = et1.getText().toString();

        SharedPreferences preferrencia2 = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String datos=preferrencia2.getString(nombre, "");

        if(datos.length()==0)
        {
            Toast.makeText(this, "No se encontro ningun registro",Toast.LENGTH_SHORT).show();
        }else
        {
            et2.setText(datos);
        }
    }
}
