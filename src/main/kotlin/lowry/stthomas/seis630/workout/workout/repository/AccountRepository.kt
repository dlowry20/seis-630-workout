package lowry.stthomas.seis630.workout.workout.repository

import lowry.stthomas.seis630.workout.workout.entity.Account
import org.springframework.data.repository.CrudRepository

interface AccountRepository : CrudRepository<Account, String> {

    /**
     * select * from account where userName = {userName};
     */
    fun findAccountByUserName(userName: String): Account
}