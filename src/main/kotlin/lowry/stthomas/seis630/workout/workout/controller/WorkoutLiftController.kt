package lowry.stthomas.seis630.workout.workout.controller

import lowry.stthomas.seis630.workout.workout.dto.WorkoutLiftDto
import lowry.stthomas.seis630.workout.workout.entity.WorkoutLift
import lowry.stthomas.seis630.workout.workout.repository.WorkoutLiftRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/workoutLift"])
class WorkoutLiftController(
    private val workoutLiftRepository: WorkoutLiftRepository,
) {

    @PostMapping("/add")
    fun addWorkout(@RequestBody workoutLiftDto: WorkoutLiftDto) : WorkoutLift {
        return workoutLiftRepository.save(WorkoutLift(
            workoutId = workoutLiftDto.workoutId,
            liftNumber = workoutLiftDto.liftNumber,
            exerciseName = workoutLiftDto.exerciseName,
        ))
    }

    @GetMapping(path = ["/workoutId"])
    @ResponseBody
    fun getAllWorkoutsForUser(@RequestParam("workout_id") workoutId: Int): Iterable<WorkoutLift> {
        return workoutLiftRepository.findAllByWorkoutId(workoutId)
    }

}