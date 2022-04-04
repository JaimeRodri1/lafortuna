package com.example.lafortuna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var contador = 3


        juegar.setOnClickListener {
            if (contador==0){
                juegar.visibility = View.GONE
            }
            else{
                val rango = mutableListOf("1","2","3","4","5","6","7")
                num1.text = (rango.random())
                num2.text = (rango.random())
                num3.text = (rango.random())
                contador--
                mensaje.setText("Intentos : $contador ")
            }
            if (num1.text.equals("7") && num2.text.equals("7") && num3.text.equals("7")){
                juegar.visibility = View.GONE
            }

        }

        again.setOnClickListener {
            contador = 3
            juegar.visibility = View.VISIBLE
            mensaje.setText("Intentos : 3")
            num1.setText("0")
            num2.setText("0")
            num3.setText("0")
        }
    }
}