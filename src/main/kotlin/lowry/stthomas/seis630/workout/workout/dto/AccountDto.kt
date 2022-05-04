package lowry.stthomas.seis630.workout.workout.dto

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class AccountDto(
    var userName: String,
    var firstName: String,
    var lastName: String,
    var email: String,
    var password: String,
    var trainerName: String? = null,
)