package com.jsisques.cursokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Lección 1
        variablesYConstantes()

        //Lección 2
        tiposDeDatos()
    }

    private fun variablesYConstantes(){

        //Variables
        var myFirstVariable = "Hola mundo!"
        var myFirstNumber = 1

        println(myFirstVariable)
        println(myFirstNumber)

        var mySecondVariable = myFirstVariable + " " + myFirstNumber.toString()

        println(mySecondVariable)

        //Constantes
        val myFirstConstant = "Holiwis"

        println(myFirstConstant)
    }

    private fun tiposDeDatos(){

        //String
        var myFirstString: String = "Hola mundo!"
        var mySecondString: String = "Soy un String"
        var bothStrings: String = myFirstString + " " + mySecondString

        println(bothStrings)

        //Enteros (Byte, Short, Int, Long)
        val myInt = 21422
        val myInt2 = 12313
        val intResult: Int = myInt + myInt2

        println(intResult)

        //Decimales (Float, Double)
        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 3.5
        var myDouble3 = 1
        var myDouble4: Double = myDouble + myDouble2 + myDouble3

        println(myDouble4)

        //Boolean
        var myBool: Boolean = true
        var myBool2 = false

        println(myBool == myBool2)
        println(myBool && myBool2)
        println(myBool || myBool2)
    }
}