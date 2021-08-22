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

        //Lección 6
        maps()

        //Leccion 7
        loops()

        //Lección 8
        nullSafety()

        //Lección 9
        funciones()

        //Lección 10
        clases()
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

    private fun maps(){

        var myMap: Map<String, Int> = mapOf()
        var myMutableMap: Map<String, Int> = mutableMapOf()
        println(myMap)

        //Añadir elementos (Este mapa no es mutable por lo tanto no se pueden añadir valores nuevos)
        myMap = mapOf("Javi" to 1, "Sisques" to 2, "Pedro" to 3)

        //Este mapa si es mutable por lo tanto se pueden añadir elementos nuevos
        myMutableMap = mutableMapOf("Javi" to 1, "Sisques" to 2, "Pedro" to 3)

        //Añadir un solo valor
        myMutableMap["Ana"] = 7
        myMutableMap.put("Maria", 9)
        println(myMutableMap)

        //Acceder a un dato
        var value = myMutableMap["Javi"]
        println(value)

        //Actualizar un dato
        myMutableMap.put("Javi", 11)
        println(myMutableMap)

        //Eliminar datos
        myMutableMap.remove("Pedro")
        println(myMutableMap)
    }

    private fun loops(){

        val myArray: List<String> = listOf("Uno", "Dos", "Tres", "Cuatro", "Cinco")
        var myMap: Map<String, Int> = mutableMapOf("Javi" to 1, "Sisques" to 2, "Pedro" to 3)

        //Bucle for
        for (myString in myArray){
            println(myString)
        }

        for (element in myMap){
            println("${element.key} - ${element.value}")
        }

        //Del 0 al 10 incluidos
        for (x in 0..10) {
            println(x)
        }

        //Del 0 al 9
        for (x in 0 until 10) {
            println(x)
        }

        //Del 0 al 99 de 11 en 11
        for (x in 0 until 100 step 11) {
            println(x)
        }

        //Bucle regresivo
        for (x in 10 downTo 0 step 2) {
            println(x)
        }

        //Crear array con rangos
        var array = (0..20)
        println(array)
        for (number in array) {
            println(number)
        }

        //While
        var x = 0

        while(x < 10){
            println(x)
            x++
        }

    }

    private fun nullSafety(){

        var myString = "Javi"
        //myString = null
        println(myString)

        //variable null safety
        var mySafetyString: String? = "Javi Safety"
        mySafetyString = null
        println(mySafetyString)

        //Comprobar que una variable no sea nula
        if (mySafetyString != null){
            //Imprimimos el valor a la fuerza
            println(mySafetyString!!)
        } else{
            println(mySafetyString)
        }

        //Safe call
        println(mySafetyString?.length) //No sabemos si es nulo por lo que ponemos el interrogante

        mySafetyString.let{
            //Cuando no sea nulo
            println(it)
        } ?: run{
            //Cuando sea nulo
            println(mySafetyString)
        }
    }

    private fun funciones(){

        sayHello()
        sayMyName("Javi")
        sayMyNameAndAge("Javi", 22)
        var result: Int = sumTwoNumbers(3, 9)
        println(result)
    }

    fun sayHello(){
        println("Hola!")
    }

    fun sayMyName(name: String){
        println("Tu nombre es: $name")
    }

    fun sayMyNameAndAge(name: String, age: Int){
        println("Tu nombre es: $name y tienes $age años")
    }

    fun sumTwoNumbers(firstNumber: Int, secondNumber: Int) : Int {
        var result = firstNumber + secondNumber
        return result
    }

    private fun clases(){

        var javi = Programmer("Javi", 11, arrayOf(Programmer.Language.JAVA, Programmer.Language.SWIFT, Programmer.Language.KOTLIN))
        javi.age = 22
        println(javi.age)
        javi.code()

        var antonio = Programmer("Antonio", 45, arrayOf(Programmer.Language.JAVA, Programmer.Language.SWIFT, Programmer.Language.KOTLIN, Programmer.Language.JAVASCRIPT ), arrayOf(javi))
        antonio.code()

        println("${antonio.friends?.first()?.name} es amigo de ${antonio.name}")
    }
}