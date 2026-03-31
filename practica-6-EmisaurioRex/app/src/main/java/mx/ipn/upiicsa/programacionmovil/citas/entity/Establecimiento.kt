package mx.ipn.upiicsa.programacionmovil.citas.entity

class Establecimiento {
    var idEstablecimiento: Int? = null
    var nombre: String? = null

    constructor(idEstablecimiento: Int, nombre: String) {
        this.idEstablecimiento = idEstablecimiento
        this.nombre = nombre
    }
}