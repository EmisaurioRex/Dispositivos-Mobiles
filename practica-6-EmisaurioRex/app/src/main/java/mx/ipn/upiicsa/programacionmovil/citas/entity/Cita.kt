package mx.ipn.upiicsa.programacionmovil.citas.entity

class Cita {
    var idCita: Int? = null
    var fkIdListaPrecio: Int? = null
    var fkIdEstado: Int? = null
    var fkIdServicioListaPrecio: Int? = null
    var fkIdCita: Int? = null

    constructor(idCita: Int, fkIdListaPrecio: Int, fkIdEstado: Int, fkIdServicioListaPrecio: Int, fkIdCita: Int?) {
        this.idCita = idCita
        this.fkIdListaPrecio = fkIdListaPrecio
        this.fkIdEstado = fkIdEstado
        this.fkIdServicioListaPrecio = fkIdServicioListaPrecio
        this.fkIdCita = fkIdCita
    }
}