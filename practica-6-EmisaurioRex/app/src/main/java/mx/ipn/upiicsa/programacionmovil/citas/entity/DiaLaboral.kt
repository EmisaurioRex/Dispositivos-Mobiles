package mx.ipn.upiicsa.programacionmovil.citas.entity

class DiaLaboral {
    var idDia: Int? = null
    var fkIdSucursal: Int? = null
    var nombre: String? = null
    var descripcion: String? = null
    var activo: Int? = null

    constructor(idDia: Int, fkIdSucursal: Int, nombre: String, descripcion: String, activo: Int) {
        this.idDia = idDia
        this.fkIdSucursal = fkIdSucursal
        this.nombre = nombre
        this.descripcion = descripcion
        this.activo = activo
    }
}