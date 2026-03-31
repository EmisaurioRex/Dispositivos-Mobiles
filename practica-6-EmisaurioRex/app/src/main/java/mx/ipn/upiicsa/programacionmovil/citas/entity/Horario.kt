package mx.ipn.upiicsa.programacionmovil.citas.entity

import java.time.LocalTime

class Horario {
    var idHorario: Int? = null
    var fkIdDia: Int? = null
    var fkIdEmpleado: Int? = null
    var descanso: Int? = null
    var inicio: LocalTime? = null
    var fin: LocalTime? = null

    constructor(idHorario: Int, fkIdDia: Int, fkIdEmpleado: Int, descanso: Int, inicio: LocalTime, fin: LocalTime) {
        this.idHorario = idHorario
        this.fkIdDia = fkIdDia
        this.fkIdEmpleado = fkIdEmpleado
        this.descanso = descanso
        this.inicio = inicio
        this.fin = fin
    }
}