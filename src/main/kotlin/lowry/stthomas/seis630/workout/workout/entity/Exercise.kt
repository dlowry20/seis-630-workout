package lowry.stthomas.seis630.workout.workout.entity

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Exercise(
    @Id
    val exerciseName: String,
    val primaryBodyPart: String,
    val secondaryBodyPart: String?,
)