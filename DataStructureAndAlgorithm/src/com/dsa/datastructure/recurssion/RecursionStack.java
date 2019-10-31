package com.dsa.datastructure.recurssion;
/**
 * This class is used to study about stack on method calls and recursion
 * stack is a data structure that follows the rule LIFO - Last In First Out
 */
public class RecursionStack {
    public static void doMore() {
        System.out.println("Do more method is Printed");
    }

    public static void doWork() {
        doMore();
        System.out.println("Do work method is printed");
    }

    public static void bar() {
        doWork();
        System.out.println("Bar method is printed");
    }

    /**
     * So this is the main method that will be used to determine the order of printing on how the
     * statements are executed.
     * so the stack will be look like this mainPrinter->bar->doWork => this is how it will be stored and it will pop starting from form the top
     * Mainprinter->bar->doWork => this is how it is stored(pushed) in the stack
     * doWork ->bar->mainPrinter => this is how it will be popped
     */
    public static void mainPrinter(){
        bar();
        System.out.println("Main Method printed");
    }

    /**
     * @param n - The first number that will be provided to the function
     * @return a number
     */
    public static void foo(int n) {
        if (n < 1) {
            System.out.println("Hello World " + n);
        } else {
            foo(n - 1);
            System.out.println("Hello World " + n);
        }
    }

    /**
     * This function is used to find the factorial of a given number
     * @param n - the number that we want to find factorial
     * @return factorial of n f(n) = n * f(n)
     */
    public static int factorial(int n){
        if (n < 0)
            return 0;
        else if(n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }

    /**
     * This function is used to find the fibonacci series of a given number
     * @param n - the input number to find its fibonacci series
     * @return fibonacci of n f(n) = f(n-1) + f(n-2)
     */
    public static int fibonacci(int n){
        if(n < 1)
            return 0;
        else if(n == 1 || n == 2)
            return n - 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

}
