package chang.kotlin.kotlin_ecommerce_prac.services.accounts.domain

import java.util.*

interface AccountRepository {
    fun save(account: Account): Account
    fun findByOwnerId(ownerId: UUID): Optional<Account>
}