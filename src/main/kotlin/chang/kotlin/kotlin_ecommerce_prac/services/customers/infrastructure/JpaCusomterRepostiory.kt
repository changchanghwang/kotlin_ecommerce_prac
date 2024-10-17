package chang.kotlin.kotlin_ecommerce_prac.services.customers.infrastructure

import chang.kotlin.kotlin_ecommerce_prac.services.customers.domain.Customer
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface JpaCusomterRepostiory : JpaRepository<Customer, UUID> {
    fun findByEmail(email: String): Optional<Customer>
}