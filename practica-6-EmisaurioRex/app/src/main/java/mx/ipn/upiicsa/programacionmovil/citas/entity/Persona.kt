package mx.ipn.upiicsa.programacionmovil.citas.entity

import java.util.Date

class Persona {
    var idPersona: Int? = null
    var fkIdGenero: Int? = null
    var nombre: String? = null
    var primerApellido: String? = null
    var segundoApellido: String? = null
    var nacimiento: Date? = null

    constructor(idPersona: Int, fkIdGenero: Int, nombre: String, primerApellido: String, segundoApellido: String?, nacimiento: Date) {
        this.idPersona = idPersona
        this.fkIdGenero = fkIdGenero
        this.nombre = nombre
        this.primerApellido = primerApellido
        this.segundoApellido = segundoApellido
        this.nacimiento = nacimiento
    }
}