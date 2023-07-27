package org.example.Function;

import java.util.function.Function;

public class _Function {
    // Function<T,R> : Takes 1 Argument and produces a Result
    public static void main(String[] args) {

        int incrementNumber = increment(0);
        System.out.format("Incremented Number Using Normal Function : %d \n",incrementNumber);

        int incrementedNumber = incrementByOneFunction.apply(1);
        System.out.format("Incremented Number Using FI : %d \n",incrementedNumber);

        int multiplyNumberBy10 = multiplyByTenFunction.apply(incrementedNumber);
        System.out.format("Incremented & Multiplied by 10 : %d \n",multiplyNumberBy10);

        int incAndMultiply = incrementBy1ThenMultiplyBy10.apply(1);
        System.out.format("Incremented and Multiply as Single Function:  %d",incAndMultiply);

    }
    // Normal Function
    static int increment(int number) {
        return number + 1;
    }

    // Function<T,R>
    static Function<Integer,Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer,Integer> multiplyByTenFunction = number -> number * 10;
    static Function<Integer,Integer> incrementBy1ThenMultiplyBy10  = incrementByOneFunction.andThen(multiplyByTenFunction);
}
