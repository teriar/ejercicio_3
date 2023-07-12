package com.example.cl.ejercicio_3

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numero1 = findViewById<EditText>(R.id.numero1)
        val numero2 = findViewById<EditText>(R.id.numero2)

        //Toast.makeText(this, "soy un toast", Toast.LENGTH_SHORT).show();
        val botonSumar = findViewById<Button>(R.id.buttonSumar)
        val botonRestar = findViewById<Button>(R.id.buttonRestar)
        val botonMultiplicar = findViewById<Button>(R.id.buttonMultiplicar)
        val botonDividir = findViewById<Button>(R.id.buttonDividir)
        botonSumar.setOnClickListener(View.OnClickListener {
            if (numero1.text.toString().trim { it <= ' ' }.isEmpty() || numero2.text.toString()
                    .trim { it <= ' ' }
                    .isEmpty()
            ) {
                Toast.makeText(baseContext, "faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val valor1 = numero1.text.toString().toDouble()
            val valor2 = numero2.text.toString().toDouble()
            val suma = valor1 + valor2
            Toast.makeText(baseContext, "resultado: $suma", Toast.LENGTH_SHORT).show()
        })
        botonRestar.setOnClickListener(View.OnClickListener {
            if (numero1.text.toString().trim { it <= ' ' }
                    .isEmpty() || numero2.text.toString().trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val valor1 = numero1.text.toString().toDouble()
            val valor2 = numero2.text.toString().toDouble()
            val resta = valor1 - valor2
            Toast.makeText(baseContext, "resultado: $resta", Toast.LENGTH_SHORT).show()
        })
        botonMultiplicar.setOnClickListener(View.OnClickListener {
            if (numero1.text.toString().trim { it <= ' ' }
                    .isEmpty() || numero2.text.toString().trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val valor1 = numero1.text.toString().toDouble()
            val valor2 = numero2.text.toString().toDouble()
            val multiplicacion = valor1 * valor2
            Toast.makeText(baseContext, "resultado: $multiplicacion", Toast.LENGTH_SHORT).show()
        })
        botonDividir.setOnClickListener(View.OnClickListener {
            if (numero1.text.toString().trim { it <= ' ' }
                    .isEmpty() || numero2.text.toString().trim { it <= ' ' }.isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val valor1 = numero1.text.toString().toDouble()
            val valor2 = numero2.text.toString().toDouble()
            if (valor2.equals(0)) {
                Toast.makeText(baseContext, "no se puede dividir por 0: ", Toast.LENGTH_SHORT)
                    .show()
                return@OnClickListener
            }
            val division = valor1 / valor2
            Toast.makeText(baseContext, "resultado: $division", Toast.LENGTH_SHORT).show()
        })
    }
}