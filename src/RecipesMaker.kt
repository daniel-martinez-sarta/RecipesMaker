fun main(){


    val menu: String = """
        Selecciona la opción deseada
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
            """.trimIndent()

    val ingredients: String = """
        Selecciona un ingrediente:
            1. Agua
            2. Leche
            3. Carne
            4. Verduras
            5. Frutas
            6. Cereal
            7. Huevos
            8. Aceite
            0. Terminar Receta.
    """.trimIndent()

    var recipeList: String = "Tu recetario: \n"
    var option: Int = 0

    println("\t :: Bienvenido a Recipe Maker ::")

    do {
        println(menu)
        option = readLine()?.toInt() ?: 0
        var ing: String? = "0"
        when(option){
            1 -> {

                println("Como se llamara tu receta?\n")
                val recipeName: String? = readLine() ?: "Receta sin nombre"
                recipeList += "Receta: $recipeName \n"

                do{
                    println(ingredients)
                    ing = readLine() ?: "0"

                    when(ing){
                        "1" -> recipeList += "Agua\n"
                        "2" -> recipeList += "Leche\n"
                        "3" -> recipeList += "Carne\n"
                        "4" -> recipeList += "Verduras\n"
                        "5" -> recipeList += "Frutas\n"
                        "6" -> recipeList += "Cereal\n"
                        "7" -> recipeList += "Huevos\n"
                        "8" -> recipeList += "Aceite\n"
                        else -> {recipeList += "Final de la receta **********\n\n"
                            ing = "0"
                        }
                    }
                }while(!ing.equals("0"))
            }

            2 -> {
                println(recipeList)

            }
        }

    }while ( !option.equals(3))

    println("Gracias por utilizar el recetario Platzi!")

}