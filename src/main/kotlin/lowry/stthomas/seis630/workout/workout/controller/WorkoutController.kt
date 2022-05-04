package lowry.stthomas.seis630.workout.workout.controller

import lowry.stthomas.seis630.workout.workout.dto.WorkoutDto
import lowry.stthomas.seis630.workout.workout.entity.Workout
import lowry.stthomas.seis630.workout.workout.repository.WorkoutRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["/workout"])
class WorkoutController(
    private val workoutRepository: WorkoutRepository,
) {

    @GetMapping(path = ["/all"])
    @ResponseBody
    fun getAllWorkouts(): Iterable<Workout> {
        return workoutRepository.findAll()
    }

    @PostMapping("/add")
    fun addWorkout(@RequestBody workoutDto: WorkoutDto) : Workout {
        return workoutRepository.save(Workout(
            workoutName = workoutDto.workoutName,
            workoutDate = workoutDto.workoutDate,
            userName = workoutDto.userName,
            workoutId = 0,
        ))
    }

    @GetMapping(path = ["/userName"])
    @ResponseBody
    fun getAllWorkoutsForUser(@RequestParam("user_name") userName: String): Iterable<Workout> {
        return workoutRepository.findAllByUserName(userName)
    }
}