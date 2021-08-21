package com.jsisques.cursokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Lección 1
        variablesYConstantes()
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
}