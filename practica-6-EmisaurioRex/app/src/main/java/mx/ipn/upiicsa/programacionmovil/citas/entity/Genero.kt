package mx.ipn.upiicsa.programacionmovil.citas.entity

class Genero (var id: Int , var nombre: String){
    var descripcion: String = ""
    var activo: Boolean = false

    constructor(id : Int, nombre: String, descripcion : String, activo : Boolean) : this(id,nombre) {
        this.descripcion = descripcion
        this.activo = activo
    }

}