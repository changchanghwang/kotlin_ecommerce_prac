package chang.kotlin.kotlin_ecommerce_prac.services.customers.presentation

import chang.kotlin.kotlin_ecommerce_prac.services.customers.application.CustomerService
import chang.kotlin.kotlin_ecommerce_prac.services.customers.commands.SignUpCustomerCommand
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerController(private val customerService: CustomerService) {
    @PostMapping
    fun singup(@RequestBody command: SignUpCustomerCommand) {
        val result = this.customerService.signup(command)

        return result
    }
}