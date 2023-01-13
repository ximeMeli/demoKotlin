package demokotlin.domain

import lombok.Data

@Data
abstract class Persona {
    abstract  var nombre: String
    abstract var apellido: String
    abstract var email: String

}