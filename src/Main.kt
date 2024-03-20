import kotlin.random.Random

/*
En el programa principal se deben crear 3 cafeteras de capacidad 1000, 750 y 500 c.c. con 0, 750 y 200 c.c de cantidad respectivamente.
Para crear cada cafetera, debéis utilizar un constructor diferente.
También debéis generar una lista de 20 tazas con la capacidad de 50, 75 y 100 de manear aleatoria.
Implementar el resto de comentarios TODO de la función main().

NOTA:
la sobrecarga de métodos se refiere a la capacidad de definir varios métodos en una clase con el mismo nombre pero con diferentes parámetros.
Esto permite que una clase tenga varios métodos con la misma firma (nombre de método) pero con listas de parámetros diferentes.

La sobrecarga de métodos facilita la legibilidad del código y proporciona flexibilidad al programador al permitirle utilizar el mismo nombre de
método para realizar operaciones similares pero con diferentes conjuntos de datos.

*/

fun main() {

    //TODO: Crear 3 cafeteras en la Sala, Cocina y Oficina
    val cafetera1 = Cafetera("Sala")
    val cafetera2 = Cafetera("Cocina",750)
    val cafetera3 = Cafetera("Oficina", 500, 200)

    //TODO: Crear una lista de 20 tazas con capacidades aleatorias

    val listaTazas = mutableListOf<Taza>() //Creamos una lista en la que van a estar todas las tazas

    val capacidadTaza = listOf(50, 75, 100) // Le asignamos los tamaños posibles

    repeat(20) {listaTazas.add(Taza(
        (TipoColor.values().random()),
        capacidadTaza[Random.nextInt(0,3)]
    ))}

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.
    println("Cafetera1 -> $cafetera1")
    println("Cafetera2 -> $cafetera2")
    println("Cafetera3 -> $cafetera3")

        for (taza in listaTazas){
            println(taza.toString())
        }

    println("**********************************************")
    println("Llenar la cafetera1 de café...")
    cafetera1.llenar()
    println("Vaciar la cafetera2...")
    cafetera2.vaciar()
    println("Agregar café a la cafetera2 a la mitad de su capacidad...")
    cafetera2.agregarCafe(375)
    println("Agregar 400 c.c. de café a la cafereta3...")
    cafetera3.agregarCafe(400)

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)

    println("**********************************************")
    println("Servir café en las tazas...")

    for (taza in listaTazas){
        cafetera1.servirTaza(taza)
        cafetera2.servirTaza(taza)
        cafetera3.servirTaza(taza)

    }

    println("**********************************************")
    //TODO: Mostrar por pantalla el contenido de las 3 cafeteras y las tazas.
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)
    println("\n")

   //Me falla esto, no se como mostrar las tazas porque si hago un for con las tazas me salen los valores vacios ya que esta cogiendo "valores nuevos" esta creando nuevas tazas
}