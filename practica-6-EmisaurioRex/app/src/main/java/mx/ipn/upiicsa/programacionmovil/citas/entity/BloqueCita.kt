package mx.ipn.upiicsa.programacionmovil.citas.entity

import java.time.Instant

class BloqueCita {
    var idBloqueCita: Int? = null
    var fkIdSucursal: Int? = null
    var inicio: Instant? = null
    var fin: Instant? = null

    constructor(idBloqueCita: Int, fkIdSucursal: Int, inicio: Instant, fin: Instant) {
        this.idBloqueCita = idBloqueCita
        this.fkIdSucursal = fkIdSucursal
        this.inicio = inicio
        this.fin = fin
    }
}