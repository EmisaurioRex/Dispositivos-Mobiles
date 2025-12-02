package mx.ipn.upiicsa.programacionmovil.citas.entity

class ServicioListaPrecio {
    var idServicioListaPrecio: Int? = null
    var fkIdServicio: Int? = null
    var fkIdListaPrecio: Int? = null
    var precio: Int? = null

    constructor(idServicioListaPrecio: Int, fkIdServicio: Int, fkIdListaPrecio: Int, precio: Int) {
        this.idServicioListaPrecio = idServicioListaPrecio
        this.fkIdServicio = fkIdServicio
        this.fkIdListaPrecio = fkIdListaPrecio
        this.precio = precio
    }
}