package com.example.trabajou2_ventas

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.Toast


class INGRESO_DE_VENTAS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingreso_de_ventas)

        //creacion de variables EditText-Botones
        //EditText
        val D_AÑO = findViewById<EditText>(R.id.AÑO)
        val D_MES= findViewById<EditText>(R.id.MES)
        val D_DIA= findViewById<EditText>(R.id.DIA)
        val D_CANTIDAD_DE_PRODUCTOS_V= findViewById<EditText>(R.id.CDPV)
        val D_TOTALDIARIO= findViewById<EditText>(R.id.TOTALDIARIO)
        //Botones
        val Ingresar_datos = findViewById<Button>(R.id.button_Ingresar_datos)


        val Enero="Enero"
        val Febrero="Febrero"
        val Marzo="Marzo"
        val Abril="Abril"
        val Mayo="Mayo"
        val Junio="Junio"
        val Julio="Julio"
        val Agosto="Agosto"
        val Septiembre="Septiembre"
        val Octubre= "Octubre"
        val Noviembre= "Noviembre"
        val Diciembre="Diciembre"


        //Ingreso de datos
        Ingresar_datos.setOnClickListener{
            val admin= BD_VENTAS(this, "BD_VENTAS", null, 1)
            val bd= admin.writableDatabase
            val registro= ContentValues()
            if(D_AÑO.getText().isEmpty() || D_MES.getText().isEmpty() || D_DIA.getText().isEmpty()
                || D_CANTIDAD_DE_PRODUCTOS_V.getText().isEmpty() || D_TOTALDIARIO.getText().isEmpty() ){

                Toast.makeText(this, "Por favor ingrese todos los datos", Toast.LENGTH_SHORT).show()
            }else{if( D_MES.text.toString().equals(Enero) || D_MES.text.toString().equals(Enero) || D_MES.text.toString().equals(Febrero) || D_MES.text.toString().equals(Marzo)
                || D_MES.text.toString().equals(Abril) || D_MES.text.toString().equals(Mayo) || D_MES.text.toString().equals(Junio)
                || D_MES.text.toString().equals(Julio) || D_MES.text.toString().equals(Agosto) || D_MES.text.toString().equals(Septiembre)
                || D_MES.text.toString().equals(Octubre) || D_MES.text.toString().equals(Noviembre) || D_MES.text.toString().equals(Diciembre)) {

                registro.put("Año",D_AÑO.getText().toString() )
                registro.put("Mes",D_MES.getText().toString() )
                registro.put("Dia",D_DIA.getText().toString() )
                registro.put("Cantidad_de_productos_vendidos", D_CANTIDAD_DE_PRODUCTOS_V.getText().toString() )
                registro.put("Total_Diario_Venta", D_TOTALDIARIO.getText().toString() )

                bd.insert("ventas", null, registro)
                bd.close()

                D_AÑO.setText("")
                D_MES.setText("")
                D_DIA.setText("")
                D_CANTIDAD_DE_PRODUCTOS_V.setText("")
                D_TOTALDIARIO.setText("")

                Toast.makeText(this, "Se ha ingresado su venta del dia", Toast.LENGTH_SHORT).show()
            }else{

                Toast.makeText(this, "Ingrese el mes segun el formato", Toast.LENGTH_SHORT).show()}
            }

        }
    }
}