package mx.ipn.upiicsa.programacionmovil.citas.entity

class Usuario {
    var idUsuario: Int? = null
    var fkIdPersona: Int? = null
    var fkIdRol: Int? = null
    var password: String? = null
    var activo: Boolean? = null

    constructor(idUsuario: Int, fkIdPersona: Int, fkIdRol: Int, password: String, activo: Boolean) {
        this.idUsuario = idUsuario
        this.fkIdPersona = fkIdPersona
        this.fkIdRol = fkIdRol
        this.password = password
        this.activo = activo
    }
}