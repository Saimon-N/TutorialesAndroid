//hacemos uso de un ListView
//nos permite crear una lista de elementos desplazables
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

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private ListView lv1;

    private String nombre[]={"Samuel","Valentina","Jesus","Francisco","Santiago","Miguel"};
    private String edades[]={"18","25","25","21","20","23"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tv1);
        lv1=(ListView)findViewById(R.id.lv1);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.list_item_modificaciones,nombre);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de "+nombre[i]+ " es " +edades[i]+" anios" );
            }
        });
    }
}