//Disenio Lineal (LinearLayout)
//es un grupo de vista que alinea todos los campos secundarios en una unica direccion,
// tanto de manera vertical u horizontal

package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
