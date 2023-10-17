package com.example.trabajou2_ventas


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MOSTRAR_VENTAS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_ventas)

        val et1 = findViewById<EditText>(R.id.et1)
        val button_consulta = findViewById<Button>(R.id.button_consulta)
        val etv2 = findViewById<TextView>(R.id.etv2)


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








        button_consulta.setOnClickListener{

            val admin= BD_VENTAS(this, "BD_VENTAS", null, 1)
            val bd= admin.writableDatabase

            if( et1.text.toString().equals(Enero) || et1.text.toString().equals(Febrero) || et1.text.toString().equals(Marzo) || et1.text.toString().equals(Abril)
                || et1.text.toString().equals(Mayo) || et1.text.toString().equals(Junio) || et1.text.toString().equals(Julio) || et1.text.toString().equals(Agosto)
                || et1.text.toString().equals(Septiembre) || et1.text.toString().equals(Octubre) || et1.text.toString().equals(Noviembre) ||
                et1.text.toString().equals(Diciembre)
                ){ val Consulta= bd.rawQuery("SELECT SUM(Total_Diario_Venta) FROM ventas Where Mes='${et1.text.toString()}'", null)
                if (Consulta.moveToFirst()) {

                etv2.append((Consulta.getString(0)) +"\n" )

                }
            }else
            { Toast.makeText(this, "Ingreso un formato incorrecto", Toast.LENGTH_SHORT).show()
            bd.close()}
        }



        val textView0= findViewById<TextView>(R.id.textView0)
        val textView1= findViewById<TextView>(R.id.textView1)
        val textView2= findViewById<TextView>(R.id.textView2)
        val textView3= findViewById<TextView>(R.id.textView3)
        val textView4= findViewById<TextView>(R.id.textView4)
        val textView5= findViewById<TextView>(R.id.textView5)

        textView0.text = ""
        textView1.text = ""
        textView2.text = ""
        textView3.text = ""
        textView4.text = ""
        textView5.text = ""

            val admin= BD_VENTAS(this, "BD_VENTAS", null, 1)
            val bd= admin.writableDatabase
            val cursor= bd.rawQuery("select * from ventas", null)


            if (cursor.moveToFirst()) {
            do {
                textView0.append(cursor.getString(0).toString()+ "\n")

            } while (cursor.moveToNext()) }

            if (cursor.moveToFirst()) {
            do {
                textView1.append(cursor.getString(1).toString()+ "\n")

            } while (cursor.moveToNext()) }

            if (cursor.moveToFirst()) {
            do {
                textView2.append(cursor.getString(2).toString()+ "\n")

            } while (cursor.moveToNext()) }

            if (cursor.moveToFirst()) {
            do {
                textView3.append(cursor.getString(3).toString()+ "\n")

            } while (cursor.moveToNext()) }

            if (cursor.moveToFirst()) {
            do {
                textView4.append(cursor.getString(4).toString()+ "\n")

            } while (cursor.moveToNext()) }

            if (cursor.moveToFirst()) {
            do {
                textView5.append(cursor.getString(5).toString()+ "\n")

            } while (cursor.moveToNext()) }






    }
}