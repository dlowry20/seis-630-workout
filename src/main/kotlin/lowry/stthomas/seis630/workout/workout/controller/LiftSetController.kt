package lowry.stthomas.seis630.workout.workout.controller

import lowry.stthomas.seis630.workout.workout.dto.LiftSetDto
import lowry.stthomas.seis630.workout.workout.entity.LiftSet
import lowry.stthomas.seis630.workout.workout.repository.LiftSetRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/liftSet")
class LiftSetController(
    private val liftSetRepository: LiftSetRepository,
) {

    @PostMapping("/add")
    fun addLiftSet(@RequestBody liftSetDto: LiftSetDto): LiftSet {
        return liftSetRepository.save(
            LiftSet(
                workoutId = liftSetDto.workoutId,
                liftNumber = liftSetDto.liftNumber,
                setNumber = liftSetDto.setNumber,
                weight = liftSetDto.weight,
                reps = liftSetDto.reps,
            )
        )
    }
}