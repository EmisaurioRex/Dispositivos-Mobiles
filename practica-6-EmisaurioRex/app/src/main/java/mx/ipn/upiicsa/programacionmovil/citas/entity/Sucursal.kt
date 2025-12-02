package mx.ipn.upiicsa.programacionmovil.citas.entity

class Sucursal {
    var idSucursal: Int? = null
    var fkIdEstablecimiento: Int? = null
    var nombre: String? = null
    var ubicacion: String? = null

    constructor(idSucursal: Int, fkIdEstablecimiento: Int, nombre: String, ubicacion: String) {
        this.idSucursal = idSucursal
        this.fkIdEstablecimiento = fkIdEstablecimiento
        this.nombre = nombre
        this.ubicacion = ubicacion
    }
}