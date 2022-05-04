package lowry.stthomas.seis630.workout.workout.controller

import lowry.stthomas.seis630.workout.workout.dto.ExerciseDto
import lowry.stthomas.seis630.workout.workout.entity.Exercise
import lowry.stthomas.seis630.workout.workout.repository.ExerciseRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/exercise")
class ExerciseController(
    private val exerciseRepository: ExerciseRepository,
) {

    @PostMapping("/add")
    fun addExercise(@RequestBody exerciseDto: ExerciseDto) : Exercise {
        return exerciseRepository.save(
            Exercise(
                exerciseName = exerciseDto.exerciseName,
                primaryBodyPart = exerciseDto.primaryBodyPart,
                secondaryBodyPart = exerciseDto.secondaryBodyPart,
            )
        )
    }

}