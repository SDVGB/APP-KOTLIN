//lOGICA DEL SISTEMA
package com.example.trabajou2_ventas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //BOTON INGRESAR VENTAS(VARIABLE)
        val Button_Ingresar_ventas= findViewById<Button>(R.id.button_Ingresar_ventas)
        //BOTON VER VENTAS(VARIABLE)
        val Button_Ver_ventas= findViewById<Button>(R.id.button_Ver_ventas)


        //ACTIVAR VENTANA INGRESAR VENTAS
        Button_Ingresar_ventas.setOnClickListener {
            val ventanaIngreso = Intent(this,INGRESO_DE_VENTAS::class.java)
            startActivity(ventanaIngreso)
        }
        //ACTIVAR VENTANA VER VENTAS
        Button_Ver_ventas.setOnClickListener {
            val ventanaVer = Intent(this,MOSTRAR_VENTAS::class.java)
            startActivity(ventanaVer)
        }



    }
}