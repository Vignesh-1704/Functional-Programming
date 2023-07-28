package org.example.Supplier;

import java.util.function.Supplier;

public class _Supplier {
    // Supplier<T> Represents a Supplier of results
    // Takes no argument and returns data
    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrl());

    }
    static String getDBConnectionUrl(){
        return "jdbc://localhost:3306/HSM";
    }

    Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:3306/HSM";
}
