package com.example.trabajou2_ventas

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.CursorFactory
import android.database.sqlite.SQLiteOpenHelper

class BD_VENTAS(context: Context, name:String, factory: CursorFactory?, version: Int) : SQLiteOpenHelper(context, name, factory,version) {
    //Creando TABLAS
    override fun onCreate(db: SQLiteDatabase){
        db.execSQL("create table ventas(codigo INTEGER primary key AUTOINCREMENT, Año int, Mes text, Dia int, Cantidad_de_productos_vendidos int,Total_Diario_Venta real )")
    }

    override fun onUpgrade (db: SQLiteDatabase, oldVersion: Int, newVersion: Int){

    }
}