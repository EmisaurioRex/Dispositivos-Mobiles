package mx.ipn.upiicsa.programacionmovil.citas.entity

class Rol {
    var id: Int ?= null
    var nombre: String ?= null
    var descripcion: String ?= null
    var activo: Boolean ?= null

    constructor(id : Int, nombre: String, desc : String, activo : Boolean) {
        this.id = id
        this.nombre = nombre
        this.descripcion = descripcion
        this.activo = activo
    }
}