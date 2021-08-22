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

        //Lección 3
        sentenciaIf()

        //Lección 4
        sentenciaWhen()

        //Lección 5
        arrays()
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

    private fun sentenciaIf(){

        val myNumber = 10

        if ((myNumber <= 10 && myNumber > 5) || myNumber == 53){
            println("$myNumber es menor que 10")
        } else if(myNumber == 60){
            println("$myNumber es 60")
        } else {
            println("$myNumber es mayor que 10")
        }
    }

    private fun sentenciaWhen(){
        //La sentencia when sustituye al switch

        val country = "España"

        when(country){
            "España", "Colombia", "Chile", "Ecuador" -> {
                println("En el pais $country se habla español")
            }
            "EEUU" -> println("En el pais $country se habla inglés")
            "Francia" -> println("En el pais $country se habla francés")
            else -> println("No conocemos el idioma")
        }

        val age = 100

        when(age){
            0,1,2 -> println("Eres un bebé")
            in 3..10 -> println("Eres un niño") //El in es un rango
            in 11..17 -> println("Eres un adolescente") //El in es un rango
            in 18..69-> println("Eres un adulto") //El in es un rango
            in 70..99 -> println("Eres un anciano") //El in es un rango
            else -> println("😱")
        }
    }

    private fun arrays(){

        val name = "Javi"
        val surname = "Sisques"
        val company = "JSisques"
        val age = "32"

        //Añadir datos
        val myArray: ArrayList<String> = arrayListOf<String>()

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        //Añadir multiples datos
        myArray.addAll(listOf("Hola", "Palabra"))

        println(myArray)

        //Obtener datos
        val myCompany = myArray[2]

        println(myCompany)

        //Modificar datos
        myArray[4] = "22"

        println(myArray)

        //Borrar un dato
        myArray.removeAt(4)

        println(myArray)

        //Recorrer array
        myArray.forEach{
            println(it)
        }

        //Otras operaciones
        println(myArray.first())
        println(myArray.last())

        myArray.sort()
        println(myArray)

        println(myArray.count())
        myArray.clear()
        println(myArray.count())
    }

}