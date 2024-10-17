package chang.kotlin.kotlin_ecommerce_prac.services.customers.domain.services

import chang.kotlin.kotlin_ecommerce_prac.services.customers.domain.CustomerRepository
import org.apache.coyote.BadRequestException
import org.springframework.stereotype.Component

@Component
class CustomerValidator(private val customerRepository: CustomerRepository) {
    fun validateSignUp(email: String) {
        val existCustomer = customerRepository.findByEmail(email)
        if (!existCustomer.isEmpty) {
            throw BadRequestException("Duplicated Email($email)")
        }
    }
}