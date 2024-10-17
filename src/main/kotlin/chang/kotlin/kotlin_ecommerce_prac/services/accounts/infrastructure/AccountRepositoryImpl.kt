package chang.kotlin.kotlin_ecommerce_prac.services.accounts.infrastructure

import chang.kotlin.kotlin_ecommerce_prac.services.accounts.domain.Account
import chang.kotlin.kotlin_ecommerce_prac.services.accounts.domain.AccountRepository
import java.util.*

class AccountRepositoryImpl(private val jpaRepository: JpaAccountRepository) : AccountRepository {
    override fun save(account: Account): Account {
        return this.jpaRepository.save(account)
    }

    override fun findByOwnerId(ownerId: UUID): Optional<Account> {
        return this.jpaRepository.findByOwnerId(ownerId)
    }
}