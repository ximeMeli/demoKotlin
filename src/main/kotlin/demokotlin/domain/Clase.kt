package demokotlin.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalTime
import java.util.*

@Entity
@Table(name="clase")
data class Clase(@Id var id: Int,
                 var nombre: String,
                 var horario: LocalTime) {

}
