package chang.kotlin.kotlin_ecommerce_prac.services.accounts.infrastructure

import chang.kotlin.kotlin_ecommerce_prac.services.accounts.domain.Account
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface JpaAccountRepository : JpaRepository<Account, UUID> {
    fun findByOwnerId(ownerId: UUID): Optional<Account>
}