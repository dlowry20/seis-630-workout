package lowry.stthomas.seis630.workout.workout.dto

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.time.LocalDate

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class WorkoutDescriptionDto(
    var workoutId: Int,
    var userName: String,
    var workoutDate: LocalDate,
    var liftMap: Map<String, List<SetDescriptor>>,
)