package org.example.BiFunction;

import java.util.function.BiFunction;

public class _BiFunction {
    // BiFunction<T,U,R> Takes 2 Arguments and produces 1 Result

    public static void main(String[] args) {

        // Normal Function Result
        int incAndMultiplied = incrementBy1AndMultiplyBy(2,10);
        System.out.format("Result with Normal Function: %d \n",incAndMultiplied);

        // Bi-Function Result
        int incBy1AndMultiplied = incrementByOneAndMultiplyBy.apply(2,10);
        System.out.format("Result with Bi Function: %d \n",incBy1AndMultiplied);
    }

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBy = (number,multiplyBy) -> (number + 1) * multiplyBy;
    static int incrementBy1AndMultiplyBy(int number,int multiplyBy)
    {
        return (number + 1) * multiplyBy;
    }
}
