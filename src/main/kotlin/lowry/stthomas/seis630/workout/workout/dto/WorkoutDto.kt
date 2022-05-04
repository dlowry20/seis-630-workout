package lowry.stthomas.seis630.workout.workout.dto

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.time.LocalDate

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class WorkoutDto(
    var workoutName: String,
    var workoutDate: LocalDate = LocalDate.now(),
    var userName: String,
)