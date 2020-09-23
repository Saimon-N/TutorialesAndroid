//hacemos uso de un Spinner
//nos permite crear una lista en un menu desplegable
package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1;
    private EditText et1, et2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.valor1);
        et2=(EditText)findViewById(R.id.valor2);
        tv1=(TextView)findViewById(R.id.resultado);
        spinner1=(Spinner)findViewById(R.id.spinner);

        //para el Spinner
        String opciones[]={"Sumar","Restar","Multiplicar","Dividir"};
        //modo normal
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);

        //agregando modificaciones para spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_item_modificaciones,opciones);
        //R=carpeta "res",layout=carpeta "layout"

        
        spinner1.setAdapter(adapter);
    }

    //metodo del botton
    public void Calcular(View view)
    {
        String valor1_string=et1.getText().toString();
        String valor2_string=et2.getText().toString();

        int valor1_int=Integer.parseInt(valor1_string);
        int valor2_int=Integer.parseInt(valor2_string);

        String selccion=spinner1.getSelectedItem().toString();
        if(selccion.equals("Sumar"))
        {
            int suma=valor1_int+valor2_int;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else if(selccion.equals("Restar"))
        {
            int resta=valor1_int-valor2_int;
            String resultado = String.valueOf(resta);
            tv1.setText(resultado);
        }else if(selccion.equals("Multiplicar"))
        {
            int multiplicar=valor1_int*valor2_int;
            String resultado = String.valueOf(multiplicar);
            tv1.setText(resultado);
        }else if(selccion.equals("Dividir"))
        {
            int div=valor1_int/valor2_int;
            String resultado = String.valueOf(div);
            tv1.setText(resultado);
        }
    }
}









