package chang.kotlin.kotlin_ecommerce_prac.services.customers.commands

data class SignUpCustomerCommand(
    val email: String,
    val name: String,
    val password: String
)
