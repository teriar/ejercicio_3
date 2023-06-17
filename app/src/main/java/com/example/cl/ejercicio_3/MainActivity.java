package com.example.cl.ejercicio_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EditText numero1 = findViewById(R.id.numero1);
        EditText numero2 = findViewById(R.id.numero2);

        //Toast.makeText(this, "soy un toast", Toast.LENGTH_SHORT).show();
        Button botonSumar = findViewById(R.id.buttonSumar);
        Button botonRestar = findViewById(R.id.buttonRestar);
        Button botonMultiplicar = findViewById(R.id.buttonMultiplicar);
        Button botonDividir = findViewById(R.id.buttonDividir);
        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                    return;
                }

                int valor1 = Integer.parseInt(numero1.getText().toString());
                int valor2 =  Integer.parseInt(numero2.getText().toString());

                int suma = valor1 + valor2;

                Toast.makeText(getBaseContext(),  "resultado: " + String.valueOf(suma) , Toast.LENGTH_SHORT).show();
            }
        });

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                    return;

                }
                int valor1 = Integer.parseInt(numero1.getText().toString());
                int valor2 =  Integer.parseInt(numero2.getText().toString());

                int resta = valor1 - valor2;

                Toast.makeText(getBaseContext(),  "resultado: " + String.valueOf(resta) , Toast.LENGTH_SHORT).show();

            }
        });

        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                    return;
                }
                int valor1 = Integer.parseInt(numero1.getText().toString());
                int valor2 =  Integer.parseInt(numero2.getText().toString());

                int multiplicacion = valor1 * valor2;

                Toast.makeText(getBaseContext(),  "resultado: " + String.valueOf(multiplicacion) , Toast.LENGTH_SHORT).show();

            }
        });

        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numero1.getText().toString().trim().isEmpty() || numero2.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                    return;
                }

                int valor1 = Integer.parseInt(numero1.getText().toString());
                int valor2 =  Integer.parseInt(numero2.getText().toString());
                 if(valor2 == 0){
                     Toast.makeText(getBaseContext(),  "no se puede dividir por 0: " , Toast.LENGTH_SHORT).show();
                      return;
                 }
                int division = valor1 / valor2;

                Toast.makeText(getBaseContext(),  "resultado: " + String.valueOf(division) , Toast.LENGTH_SHORT).show();



            }
        });


    }
}