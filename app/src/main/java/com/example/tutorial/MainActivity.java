//hacemos uso de un Edit text
//nos permite colocar texto
package com.example.tutorial;

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
    private EditText etn, ctp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn=(EditText)findViewById(R.id.nombre);
        ctp=(EditText)findViewById(R.id.password);
    }
    //creamos el metodo para el boton
    public void Registrar(View view)
    {
        String nombre=etn.getText().toString();
        String contrasenia=ctp.getText().toString();

        if(nombre.length()==0)
        {
            Toast.makeText(this, "debes de agregar un nombre", Toast.LENGTH_SHORT).show();
        }
        if(contrasenia.length()==0)
        {
            Toast.makeText(this, "debes de agregar una contrasenia", Toast.LENGTH_SHORT).show();
        }
        if(nombre.length()!=0 && contrasenia.length()!=0)
        {
            Toast.makeText(this, "Registro de proceso", Toast.LENGTH_SHORT).show();
        }
    }

}