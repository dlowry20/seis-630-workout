package lowry.stthomas.seis630.workout.workout.entity

import lowry.stthomas.seis630.workout.workout.dto.WorkoutDto
import java.time.LocalDate
import javax.persistence.*

@Entity
class Workout(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val workoutId: Int,

    @Column(nullable = false)
    val workoutName: String,

    @Column(nullable = false)
    val workoutDate: LocalDate = LocalDate.now(),

    @Column(nullable = false)
    val userName: String,
)


