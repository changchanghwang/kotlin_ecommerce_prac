package chang.kotlin.kotlin_ecommerce_prac.services.accounts.domain

import com.fasterxml.uuid.Generators
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.apache.coyote.BadRequestException
import java.util.*

@Entity
class Account(
    @Column(nullable = false)
    val ownerId: UUID,
    @Column(nullable = false)
    var balance: Long,
    @Id val id: UUID = Generators.timeBasedEpochGenerator().generate()
) {
    fun withdraw(amount: Long) {
        if (amount > balance) {
            throw BadRequestException("Account($this.id) don't have enough money. (amount: $this.amount, balance: $this.balance)")
        }
        this.balance -= amount
    }

    fun deposit(amount: Long) {
        if (amount < 0) {
            throw BadRequestException("Account($this.id) can't have negative deposit.")
        }

        this.balance += amount
    }
}