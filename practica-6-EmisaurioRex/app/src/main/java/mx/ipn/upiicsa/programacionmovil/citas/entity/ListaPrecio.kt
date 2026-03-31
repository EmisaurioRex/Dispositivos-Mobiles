package mx.ipn.upiicsa.programacionmovil.citas.entity

import java.time.Instant

class ListaPrecio {
    var idListaPrecio: Int? = null
    var fkIdEstado: Int? = null
    var nombre: String? = null
    var fechaTimestamp: Instant? = null

    constructor(idListaPrecio: Int, fkIdEstado: Int, nombre: String, fechaTimestamp: Instant) {
        this.idListaPrecio = idListaPrecio
        this.fkIdEstado = fkIdEstado
        this.nombre = nombre
        this.fechaTimestamp = fechaTimestamp
    }
}