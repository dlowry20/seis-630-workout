package lowry.stthomas.seis630.workout.workout.repository

import lowry.stthomas.seis630.workout.workout.entity.Exercise
import org.springframework.data.repository.CrudRepository

interface ExerciseRepository : CrudRepository<Exercise, String> {
}