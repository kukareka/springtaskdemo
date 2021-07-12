package com.clearcover.springtask

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Weather(
    var city: String,
    var temperature: Float,
    @Id @GeneratedValue var id: Long? = null
)

@Repository
interface WeatherRepository: CrudRepository<Weather, Long> {

}
