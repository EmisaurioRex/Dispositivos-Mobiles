package mx.ipn.upiicsa.programacionmovil.citas.entity

class Empleado {
    var idEmpleado: Int? = null
    var fkIdEmpleado: Int? = null

    constructor(idEmpleado: Int, fkIdEmpleado: Int) {
        this.idEmpleado = idEmpleado
        this.fkIdEmpleado = fkIdEmpleado
    }
}