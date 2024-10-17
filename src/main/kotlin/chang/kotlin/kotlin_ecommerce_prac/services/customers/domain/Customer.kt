package chang.kotlin.kotlin_ecommerce_prac.services.customers.domain

import chang.kotlin.kotlin_ecommerce_prac.services.customers.domain.services.CustomerValidator
import chang.kotlin.kotlin_ecommerce_prac.services.customers.domain.services.PasswordService
import com.fasterxml.uuid.Generators
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
class Customer(
    @Column(nullable = false)
    val email: String,
    @Column(nullable = false)
    val name: String,
    @Column(nullable = false)
    var password: String,
    @Id
    val id: UUID
) {
    companion object {
        fun of(
            email: String,
            name: String,
            password: String,
            customerValidator: CustomerValidator,
            passwordService: PasswordService
        ): Customer {
            customerValidator.validateSignUp(email)
            val hashedPassword = passwordService.hash(password)
            return Customer(
                email,
                name,
                hashedPassword,
                Generators.timeBasedEpochGenerator().generate()
            )
        }
    }
}