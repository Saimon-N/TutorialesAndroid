//utilizanod un botton de radio
package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2; //varibles para los radioBottons

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.valor1);
        et2 = (EditText)findViewById(R.id.valor2);
        tv1 = (TextView)findViewById(R.id.resultado);
        rb1 = (RadioButton)findViewById(R.id.rb_sumar);
        rb2 = (RadioButton)findViewById(R.id.rb_restar);
    }

    //metodo para el botton caltucar
    public void Calcular(View view)
    {
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valo1_int = Integer.parseInt(valor1_String);
        int valo2_int = Integer.parseInt(valor2_String);

        if(rb1.isChecked()==true)//preguntamos si la opcion 1 o rb1 del radiobotton esta marcada
        {
            int suma=valo1_int + valo2_int;
            String resultado=String.valueOf(suma);
            tv1.setText(resultado);//envia el resultado
        }
        else if(rb2.isChecked()==true)//preguntamos si la opcion 2 o rb2 del radiobotton esta marcada
        {
            int resta=valo1_int-valo2_int;
            String resultado=String.valueOf(resta);
            tv1.setText(resultado);//envia el resultado
        }
    }
}









//Sacar los valores de textView y mostrar la suma de los mismos en un texView  2 ---------------------------------------------
/*package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText et1; //variable que guardara los valores que le manden
    private EditText et2; //variable que guardara los valores que le manden
    private EditText et3; //variable que guardara los valores que le manden
    private TextView tv1; //variable que mandara respuesta a la interfaz;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.matematicas);
        et2=(EditText)findViewById(R.id.fisica);
        et3=(EditText)findViewById(R.id.quimica);
        tv1=(TextView)findViewById(R.id.estatus);
    }

    public void estatus(View view) //crear un metodo publico, 100pre debe tener el parametro View, el view es el nombre que le das
    {
        String Matemticas_String= et1.getText().toString();
        String Fisica_String= et2.getText().toString();
        String Quimica_String= et3.getText().toString();

        int Matematicas_int = Integer.parseInt(Matemticas_String);
        int Fisica_int = Integer.parseInt(Fisica_String);
        int Quimica_int = Integer.parseInt(Quimica_String);

        int promedio=(Matematicas_int+Fisica_int+Quimica_int)/3;

        if(promedio >= 6)
        {
            tv1.setText("Estatus aprobado con "+ promedio);
        }
        else if(promedio <=5)
        {
            tv1.setText("Estatus Reprobado con "+ promedio);
        }
    }
}
*/







//Sacar los valores de textView y mostrar la suma de los mismos en un texView ---------------------------------------------
/*package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText Valor1;
    private EditText Valor2;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Valor1 = (EditText)findViewById(R.id.txt_numero1);
        Valor2 = (EditText)findViewById(R.id.txt_numero2);
        res = (TextView)findViewById(R.id.resultado);
    }

    //Este metodo realiza la suma
    public void suma(View view){
        String diferente_valor1=Valor1.getText().toString();
        String diferente_valor2=Valor2.getText().toString();

        int num1=Integer.parseInt(diferente_valor1);
        int num2=Integer.parseInt(diferente_valor2);
        int suma=num1+num2;

        String resultado=String.valueOf(suma);
        res.setText(resultado);
    }
}*/


//Como mostrar mensajes en una actividad por un momento---------------------------------------------
/*package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;//libreria que utiliza la clase Toast

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //----------------------2do Ejemplo--------------------
        int matematica = 5;
        int quimica = 5;
        int fisica = 5;
        int promedio=0;

        promedio=(matematica+quimica+fisica)/3;

        if(promedio>5)
        {
            Toast.makeText(this, "Aprovado", Toast.LENGTH_SHORT).show();
        }
        else if(promedio <=5)
        {
            Toast.makeText(this, "Aprovado", Toast.LENGTH_LONG).show();
        }
    }
}*/







//Ejemplo de ciclo de vida de un activity--------------------------------------------------------------------
/*package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate",Toast.LENGTH_SHORT).show();//<--es es aumentado y <-- nos muestra el mensaje de text:
        //la actividad esta creada
    }

    //-----------------Creando el ciclo de vida del activity (sin contar el onCreate)------------
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();//<-- nos muestra el mensaje de text:
        // la actividad esta a punto de hacerlo visible
    }
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();//<-- nos muestra el mensaje de text:
        // la actividad se vuelto visible (ahora se reanuda);
    }
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();//<-- nos muestra el mensaje de text:
        // puedes ir a otra actividad
    }
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();//<-- nos muestra el mensaje de text:
        // la actividad ya no es visible
    }
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();//<-- nos muestra el mensaje de text:
        // la acividad esta a punto de ser destruida
    }
}


//--Toast-- nos permite mostrar un mensaje mediante una capa, nos muestra un mensaje cuando ejecutamos el codigo*/