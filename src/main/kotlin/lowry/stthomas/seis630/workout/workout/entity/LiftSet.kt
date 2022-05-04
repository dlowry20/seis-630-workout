package lowry.stthomas.seis630.workout.workout.entity

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass

@Entity
@IdClass(LiftSetId::class)
class LiftSet(
    @Id
    val workoutId: Int = 0,
    @Id
    val liftNumber: Int = 0,
    @Id
    val setNumber: Int = 0,

    val weight: Int,
    val reps: Int,
)

data class LiftSetId(
    val workoutId: Int = 0,
    val liftNumber: Int = 0,
    val setNumber: Int = 0,
) : Serializable