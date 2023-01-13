package demokotlin.service

import demokotlin.client.ClaseClient
import demokotlin.domain.Clase
import org.springframework.stereotype.Service

@Service
class ClaseServiceImpl(val client: ClaseClient):ClaseService {

    override fun getClases(): List<Clase> {
        return client.findAll() as List<Clase>
    }
}