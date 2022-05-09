package lowry.stthomas.seis630.workout.workout.dto

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class SetDescriptor(
    val setNumber: Int,
    val weight: Int,
    val reps: Int,
)