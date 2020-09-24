//Como pasar  datos de un activity a otro

package com.example.tutorial;

import android.content.Intent;
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

        et1=(EditText)findViewById(R.id.pt1);
    }
    //metodo para el boton
    public void Enviar(View view)
    {
        //parte muy importante---->
        Intent i=new Intent(this, SegundaActivity.class);
        i.putExtra("batman", et1.getText().toString());//envia os datos de este activity hacia otro con una llave
        startActivity(i);
        //---->
    }
}
