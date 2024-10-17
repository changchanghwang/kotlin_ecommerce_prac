package chang.kotlin.kotlin_ecommerce_prac.services.customers.domain

import java.util.*

interface CustomerRepository {
    fun save(customer: Customer): Customer
    fun findByEmail(email: String): Optional<Customer>
}