package lowry.stthomas.seis630.workout.workout.repository

import lowry.stthomas.seis630.workout.workout.entity.Workout
import org.springframework.data.repository.CrudRepository

interface WorkoutRepository : CrudRepository<Workout, Int>{

    fun findAllByUserName(userName: String): List<Workout>
}