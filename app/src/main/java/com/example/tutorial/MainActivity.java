//hacemos uso de un CheckBox
package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private CheckBox check1, check2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.valor1);
        et2=(EditText)findViewById(R.id.valor2);
        check1=(CheckBox)findViewById(R.id.check_suma);
        check2=(CheckBox)findViewById(R.id.check_resta);
        tv1=(TextView)findViewById(R.id.resultado);
    }

    //funcion o metodo del button
    public void Calcular(View view)
    {
        String valor1_String=et1.getText().toString();
        String valor2_String=et2.getText().toString();

        int valor1_int=Integer.parseInt(valor1_String);
        int valor2_int=Integer.parseInt(valor2_String);

        String resultado="";

        if(check1.isChecked()==true)
        {
            int suma=valor1_int + valor2_int;
            resultado="La suma es :"+ suma +"  ";
            //resultado="La suma es :"+String.valueOf(suma)+"  ";
        }
        if(check2.isChecked()==true)
        {
            int resta=valor1_int - valor2_int;
            resultado+="La resta es :"+resta;
            //resultado+="La resta es :"+String.valueOf(resta);
        }
        tv1.setText(resultado);
    }
}









