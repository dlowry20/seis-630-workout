package lowry.stthomas.seis630.workout.workout.dto

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class LiftSetDto(
    var workoutId: Int,
    var liftNumber: Int,
    var setNumber: Int,
    var weight: Int,
    var reps: Int,
)