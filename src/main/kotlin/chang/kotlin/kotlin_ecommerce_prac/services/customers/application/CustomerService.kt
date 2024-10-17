package chang.kotlin.kotlin_ecommerce_prac.services.customers.application

import chang.kotlin.kotlin_ecommerce_prac.services.customers.commands.SignUpCustomerCommand
import chang.kotlin.kotlin_ecommerce_prac.services.customers.domain.Customer
import chang.kotlin.kotlin_ecommerce_prac.services.customers.domain.CustomerRepository
import chang.kotlin.kotlin_ecommerce_prac.services.customers.domain.services.CustomerValidator
import chang.kotlin.kotlin_ecommerce_prac.services.customers.domain.services.PasswordService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val customerRepository: CustomerRepository,
    private val customerValidator: CustomerValidator,
    private val passwordService: PasswordService
) {
    fun signup(command: SignUpCustomerCommand) {
        val customer = Customer.of(
            command.email,
            command.name,
            command.password,
            customerValidator,
            passwordService
        )

        this.customerRepository.save(customer)
    }
}