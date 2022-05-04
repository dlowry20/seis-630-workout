package lowry.stthomas.seis630.workout.workout.entity

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass

@Entity
@IdClass(WorkoutLiftId::class)
class WorkoutLift(

    @Id
    val workoutId: Int = 0,

    @Id
    val liftNumber: Int = 0,

    val exerciseName: String,

)

data class WorkoutLiftId(
    val workoutId: Int = 0,
    val liftNumber: Int = 0,
) : Serializable