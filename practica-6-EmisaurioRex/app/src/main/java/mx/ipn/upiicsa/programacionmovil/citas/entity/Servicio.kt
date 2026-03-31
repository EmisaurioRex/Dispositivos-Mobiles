package mx.ipn.upiicsa.programacionmovil.citas.entity

class Servicio {
    var idServicio: Int? = null
    var nombre: String? = null
    var descripcion: String? = null
    var duracion: Int? = null

    constructor(idServicio: Int, nombre: String, descripcion: String, duracion: Int) {
        this.idServicio = idServicio
        this.nombre = nombre
        this.descripcion = descripcion
        this.duracion = duracion
    }
}