package demokotlin.controller

import demokotlin.domain.Clase
import demokotlin.service.ClaseServiceImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class ClaseController(val serviceImpl: ClaseServiceImpl) {

    @GetMapping("/clases")
    fun getClases(@RequestParam token: String): List<Clase> {
        return serviceImpl.getClases()
    }



}