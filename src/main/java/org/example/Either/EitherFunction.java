package org.example.Either;

import io.vavr.control.Either;


public class EitherFunction {
    public static Either<String,Integer> divide(int dividend,int divisor)
    {
        if(divisor == 0){
            return Either.left("Division by Zero is not Allowed");
        }
        else {
            return Either.right(dividend/divisor);
        }
    }

    public static void main(String[] args) {

        Either<String,Integer> result = divide(10,0);
        if(result.isLeft())
            System.out.println("Error: " + result.getLeft());
        else
            System.out.println("Result: " + result.get());
    }
}
