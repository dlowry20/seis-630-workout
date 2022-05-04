package lowry.stthomas.seis630.workout.workout.entity

import javax.persistence.*

@Entity
class Account(
    @Id
    val userName: String,

    @Column(nullable = false)
    val firstName: String,

    @Column(nullable = false)
    val lastName: String,

    @Column(nullable = false)
    val email: String,

    @Column(nullable = false)
    val password: String,

    @Column(nullable = true)
    val trainerName: String?,
)