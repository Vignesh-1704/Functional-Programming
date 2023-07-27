package org.example.Consumer;


import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //Consumer<T> : Takes 1 Argument and Returns Nothing

        // Result with Normal Function
        greetCustomer(new Customer("Vignesh","9999977777"));

        // Result with Consumer Function
        greetNewCustomer.accept(new Customer("Vignesh","9999977777"));

    }

    // Normal Function which takes 1 Argument and Returns Nothing
    static void greetCustomer(Customer customer)
    {
        System.out.println("Hello "+ customer.customerName + ", thanks for registering your phone number "+ customer.customerPhoneNumber);
    }

    // Consumer Function
    static Consumer<Customer> greetNewCustomer = customer -> System.out.println("Hello " + customer.customerName + ", thank you for registering your phone number " + customer.customerPhoneNumber);
}
