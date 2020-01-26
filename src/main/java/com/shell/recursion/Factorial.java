package com.shell.recursion;

public class Factorial {

    public int factorialRecursive(int n){
        int fact = 1;
        if(n==0){
           return 1;
        }
        return fact*n*factorialRecursive(n-1);
    }

    public int factorialIterative(int n){
        int factorial = 1;
        while(n>0){
            factorial = factorial * n;
            n--;
        }
        return factorial;
    }
}
