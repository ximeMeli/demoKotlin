package demokotlin.service

import demokotlin.domain.Clase

interface ClaseService {
    fun getClases():List<Clase>
}