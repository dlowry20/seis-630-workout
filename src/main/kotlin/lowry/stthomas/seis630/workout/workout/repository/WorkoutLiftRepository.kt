package lowry.stthomas.seis630.workout.workout.repository

import lowry.stthomas.seis630.workout.workout.entity.WorkoutLift
import lowry.stthomas.seis630.workout.workout.entity.WorkoutLiftId
import org.springframework.data.repository.CrudRepository

interface WorkoutLiftRepository : CrudRepository<WorkoutLift, WorkoutLiftId> {
    fun findAllByWorkoutId(workoutId: Int): List<WorkoutLift>
}