package lowry.stthomas.seis630.workout.workout.repository

import lowry.stthomas.seis630.workout.workout.entity.LiftSet
import lowry.stthomas.seis630.workout.workout.entity.LiftSetId
import org.springframework.data.repository.CrudRepository

interface LiftSetRepository : CrudRepository<LiftSet, LiftSetId> {

    fun findAllByWorkoutIdAndLiftNumber(workoutId: Int, liftNumber: Int): List<LiftSet>
}