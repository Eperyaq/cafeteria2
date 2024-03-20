class Taza(val color:TipoColor = TipoColor.BLANCO , val capacidad:Int = 50, var cantidad:Int = 0) {

    init {
        if (cantidad > capacidad){
            cantidad = capacidad
        }
        if (color !in TipoColor.entries){
            throw IllegalArgumentException("El color elegido no se encuentra en el catálogo disponible")
        }
    }

    /**
     * Método que llena la taza con la capacidad maxima de esta
     */
    fun llenar(){
        cantidad = capacidad
    }

    /**
     * Metodo que llena la taza con la capacidad que se le pasa por parámetros, si se le pasa un numero mayor que la capacidad maxima se llena hasta donde puede.
     * @param num cantidad de café a llenar
     */
    fun llenar(num:Int){
        if (num > capacidad){
            println("no puedes llenar más de lo que cabe, he llenado hasta el maximo posible")
            cantidad = capacidad
        }else{
            cantidad = num
        }
    }

    /**
     * To string personalizado paracada vez
     */
    override fun toString(): String {
        return "Taza (Color: $color, capacidad: $capacidad, cantidad: $cantidad"
    }
}