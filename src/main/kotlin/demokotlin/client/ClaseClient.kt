package demokotlin.client

import demokotlin.domain.Clase
import org.springframework.data.repository.CrudRepository

interface ClaseClient:CrudRepository<Clase,Int> {

}