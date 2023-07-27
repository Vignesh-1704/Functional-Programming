package org.example.BiConsumer;

import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {

        // Result with Normal Function
        greetCustomerWithPhoneNumber(new Customer("Vignesh","9999977777"),true);

        // Result with BiConsumer Function
        greetCustomerWithNumberFI.accept(new Customer("Vignesh","9999977777"),false);
    }

    static void greetCustomerWithPhoneNumber(Customer customer,boolean showPhoneNumber)
    {
        System.out.println("Hello "+ customer.customerName + ", thanks for registering with phone number "+ (showPhoneNumber ? customer.customerPhoneNumber : "*****-*****"));
    }

    static BiConsumer<Customer,Boolean> greetCustomerWithNumberFI = ((customer, showPhoneNumber) -> System.out.println("Hello "+ customer.customerName + ", thanks for registering with phone number "+ (showPhoneNumber ? customer.customerPhoneNumber : "*****-*****")));
}
