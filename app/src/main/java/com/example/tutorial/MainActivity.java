//hacemos uso de un Botton de imagen
//nos permite crear un botton con imagen
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

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo para los botones boton 1
    public void Mensaje1(View view)
    {
        Toast.makeText(this,"La imagen 1",Toast.LENGTH_SHORT).show();
    }
    //metodo para los botones boton 2
    public void Mensaje2(View view)
    {
        Toast.makeText(this,"La imagen 2",Toast.LENGTH_SHORT).show();
    }
}