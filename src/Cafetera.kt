/**
 *Clase que representa una cafetera con capacidad para almacenar cafe
 * @param ubicacion en la que se encuentra la cafetera
 */
class Cafetera(val ubicacion:String) {

    private var cantidadActual:Int = 0 // pero esta vacia

    private var capacidadMax:Int = 1000 //Por defecto tiene una capacidad de 1000 ml
        set(value) {
            if (value in 0..1000) {
                field = value
            } else {
                throw IllegalArgumentException("La capacidad no puede ser menor que 0 ni mayor que 1000")
            }
        }

    /**
     * Constructor secundario, en el que se iguala la cantidad de cafe con el maximo que cabe en la cafetera lo que la llena al completo
     * @param ubicacion donde se encuentra la cafetera
     * @param capacidad capacidad maxima que tiene la cafetera
     */
    constructor(ubicacion: String, capacidad:Int): this(ubicacion){
        this.capacidadMax = capacidad
        this.cantidadActual = this.capacidadMax
    }

    /**
     * Constructor secundario en el que puedes especificar todas las caracteristicas de la cafetera
     * @param ubicacion en la que se encuentra la cafetera
     * @param capacidad capacidad maxima que tiene la cafetera
     * @param cantidad cantidad de cafe que tiene la cafetera en ese momento
     */
    constructor(ubicacion: String, capacidad: Int, cantidad:Int): this(ubicacion){
        this.capacidadMax = capacidad

        if (cantidad > capacidad){
            this.cantidadActual = capacidad
        }else{
            this.cantidadActual = cantidad
        }
    }

    /**
     * Llena la cafetrera lo cual asigna la cantidad actual a la capacidad maxima que tiene la cafetera
     */
    fun llenar(){
        cantidadActual = capacidadMax
    }

    /**
     * Realiza la accion de llenar una taza dependiendo de si tiene cafe suficiente o no
     * @param taza A llenar
     */
    fun servirTaza(taza:Taza){
        //no entiendo muy bien el enunciado asi que lo voy a hacer a "mi manera" Si la cafetera no alcanza para llenar la taza, se llena la cafetera y despues de eso, llena la taza
        if (cantidadActual < taza.capacidad){
            llenar() //lleno la cafetera
            cantidadActual- taza.capacidad //lleno la taza
        }else {
            cantidadActual - taza.capacidad //Llenamos la taza con el cafe que tenemos actualmente
        }
    }

    /**
     * Vacia la cafetera
     */
    fun vaciar(){
        cantidadActual = 0
    }

    fun agregarCafe(cantidadllenar:Int = 200){
        cantidadActual += cantidadllenar //se hace esto primero para despues comprobar si se ha pasado

        if (cantidadActual > capacidadMax){
            cantidadActual = capacidadMax
        }
    }

    override fun toString(): String {
        return "Cafetera ubicada en $ubicacion, con capacidad $capacidadMax, y cafe actual $cantidadActual"
    }
}