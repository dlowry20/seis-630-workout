package lowry.stthomas.seis630.workout.workout.controller

import lowry.stthomas.seis630.workout.workout.dto.SetDescriptor
import lowry.stthomas.seis630.workout.workout.dto.WorkoutDescriptionDto
import lowry.stthomas.seis630.workout.workout.entity.Workout
import lowry.stthomas.seis630.workout.workout.entity.WorkoutLift
import lowry.stthomas.seis630.workout.workout.repository.LiftSetRepository
import lowry.stthomas.seis630.workout.workout.repository.WorkoutLiftRepository
import lowry.stthomas.seis630.workout.workout.repository.WorkoutRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/summary"])
class SummaryController(
    val workoutRepository: WorkoutRepository,
    val workoutLiftRepository: WorkoutLiftRepository,
    val liftSetRepository: LiftSetRepository,
) {

    @GetMapping(path = ["/workout"])
    @ResponseBody
    fun getWorkoutDescriptionsForUser(@RequestParam("workout_id") workoutId: Int): WorkoutDescriptionDto {
        val workout: Workout = workoutRepository.findById(workoutId).get()
        var liftMap = mutableMapOf<String, List<SetDescriptor>>()
        for (workoutLift: WorkoutLift in workoutLiftRepository.findAllByWorkoutId(workout.workoutId)) {
            val liftSets = liftSetRepository.findAllByWorkoutIdAndLiftNumber(workout.workoutId, workoutLift.liftNumber)
            val setDescriptors = liftSets.map {
                SetDescriptor(
                    it.setNumber,
                    it.weight,
                    it.reps
                )
            }
            liftMap[workoutLift.exerciseName] = setDescriptors
        }
        return WorkoutDescriptionDto(
            workoutId = workout.workoutId,
            userName = workout.userName,
            workoutDate = workout.workoutDate,
            liftMap = liftMap,
        )
    }
}