package demokotlin.domain

import jakarta.persistence.*


@Entity
@Table(name="alumno")
data class Alumno(override var nombre: String,
             override var apellido: String,
             override var email: String,
                  @Id
                  var id: Int,
                  @ManyToMany @JoinTable(name = "alumno_clase",
                          joinColumns = arrayOf(JoinColumn(name = "id_alumno", referencedColumnName="id")),
                          inverseJoinColumns = arrayOf(JoinColumn(name = "id_clase",referencedColumnName="id"))
                  )
var clases: List<Clase>) : Persona() {

    //Preguntar a Lechu atributos sin inicializar


}