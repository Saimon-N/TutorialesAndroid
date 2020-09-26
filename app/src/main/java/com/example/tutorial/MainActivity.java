//Almacenamiento de datos
//crearemos un fichero que alcanara datos de tipo txto

package com.example.tutorial;

import android.app.Activity;
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.bitacora);

        fileList();//nos permite recuperar los ficheros
        String archivos[]=fileList();

        if(ArchivoExiste(archivos, "bitacora.txt"))
        {
            try
            {
                InputStreamReader archivo=new InputStreamReader(openFileInput("bitacora.txt"));
                BufferedReader br=new BufferedReader(archivo);
                String linea= br.readLine();
                String BitacoraCompleto="";
                while(linea!=null)
                {
                    BitacoraCompleto = BitacoraCompleto + linea +"\n";
                    linea=br.readLine();
                }
                br.close();
                archivo.close();
                et1.setText(BitacoraCompleto);
            }catch(IOException e)
            {

            }
        }

    }
    private boolean ArchivoExiste(String archivo[], String NombreArchivo)
    {
        for(int i=0;i<archivo.length;i++)
            if(NombreArchivo.equals(archivo[i]))
                return true;
            return false;
    }

    //metodo para el metodo guardar
    public void Guardar(View view)
    {
        try
        {
            OutputStreamWriter archivo=new OutputStreamWriter(openFileOutput("bitacora.txt", Activity.MODE_PRIVATE));
            archivo.write(et1.getText().toString());
            archivo.flush();
            archivo.close();
        }catch(IOException e)
        {

        }
        Toast.makeText(this,"bitacora guardada",Toast.LENGTH_LONG).show();
        finish();
    }
}
