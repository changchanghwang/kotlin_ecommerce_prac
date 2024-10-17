package chang.kotlin.kotlin_ecommerce_prac.services.customers.infrastructure

import chang.kotlin.kotlin_ecommerce_prac.services.customers.domain.Customer
import chang.kotlin.kotlin_ecommerce_prac.services.customers.domain.CustomerRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class CustomerRepositoryImpl(private val customerRepository: JpaCusomterRepostiory) : CustomerRepository {
    override fun save(customer: Customer): Customer {
        return this.customerRepository.save(customer)
    }

    override fun findByEmail(email: String): Optional<Customer> {
        return this.customerRepository.findByEmail(email)
    }
}