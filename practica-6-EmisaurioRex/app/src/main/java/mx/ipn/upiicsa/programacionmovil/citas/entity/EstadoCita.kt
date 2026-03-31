package mx.ipn.upiicsa.programacionmovil.citas.entity

class DiaDescanso {
    var idDiaDescanso: Int? = null
    var fkIdEmpleado: Int? = null
    var diaDescanso: Int? = null

    constructor(idDiaDescanso: Int, fkIdEmpleado: Int, diaDescanso: Int) {
        this.idDiaDescanso = idDiaDescanso
        this.fkIdEmpleado = fkIdEmpleado
        this.diaDescanso = diaDescanso
    }
}