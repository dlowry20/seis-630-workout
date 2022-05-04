package lowry.stthomas.seis630.workout.workout.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class ExerciseDto(
    var exerciseName: String,
    var primaryBodyPart: String,
    var secondaryBodyPart: String?,
)