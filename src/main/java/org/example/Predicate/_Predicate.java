package org.example.Predicate;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        // Result With Normal Function
        boolean isValid = isPhoneNumberValid("9789711111");
        System.out.println("Given Phone Number is Valid : "+ isValid);

        // Result with Predicate Function
        boolean isValidNumber = isValidPhoneNumberOrNot.test("9999988888");
        System.out.println("Given Phone Number is Valid: "+isValidNumber);
    }
    static boolean isPhoneNumberValid(String phoneNumber)
    {
        return phoneNumber.startsWith("97") && phoneNumber.length() == 10;
    }

    // Predicate<T,R> Takes a Input and Returns a Boolean
    static Predicate<String> isValidPhoneNumberOrNot = phoneNumber -> phoneNumber.startsWith("97") && phoneNumber.length() == 10;
}
