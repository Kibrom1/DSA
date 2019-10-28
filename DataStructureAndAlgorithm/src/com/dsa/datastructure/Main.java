package com.dsa.datastructure;

import com.dsa.datastructure.recurssion.RecursionStack;

public class Main {

    public static void main(String[] args) {
	    //Testing how stack works when executing a function
        RecursionStack.mainPrinter();

        //Testing recursive call and stack together
        RecursionStack.foo(3);

        //Testing recursion with factorial
        System.out.println(RecursionStack.factorial(5));

        //Testing recursion using fibonacci series
        System.out.println(RecursionStack.fibonacci(6));
    }
}
    