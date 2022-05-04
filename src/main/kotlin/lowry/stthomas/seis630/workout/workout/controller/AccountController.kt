package lowry.stthomas.seis630.workout.workout.controller

import lowry.stthomas.seis630.workout.workout.dto.AccountDto
import lowry.stthomas.seis630.workout.workout.entity.Account
import lowry.stthomas.seis630.workout.workout.repository.AccountRepository
import org.springframework.http.MediaType
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.*
import java.security.SecureRandom

@RestController
@RequestMapping(path = ["/account"])
class AccountController(
    private val accountRepository: AccountRepository,
) {

    @PostMapping(path = ["/register"], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun saveAccount(@RequestBody accountDto: AccountDto) : Account {
        return accountRepository.save(Account(
            userName = accountDto.userName,
            firstName = accountDto.firstName,
            lastName = accountDto.lastName,
            password = encryptPassword(accountDto.password),
            trainerName = accountDto.trainerName,
            email = accountDto.email,
        ))
    }

    @GetMapping("/findByName")
    fun getAccountByName(@RequestParam("user_name") userName: String): Account {
        return accountRepository.findAccountByUserName(userName)
    }

    fun encryptPassword(password: String): String {
        val strength = 10
        val bcryptPasswordEncoder = BCryptPasswordEncoder(strength, SecureRandom())
        return bcryptPasswordEncoder.encode(password)
    }
}