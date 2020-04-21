package com.company;

public class Metode {
    public static void main(String[] args) {
        PrintMyName();
        System.out.println("The result of Sum is : " + Sum(6,5));
        System.out.println("The result of the Subtraction is : " + Substraction(2436,456));
        System.out.println("The result of the Multiplication is :" + Multiplication(56d,47d) );
        System.out.println("The result of the Division is : " + Division(43252345d,345d) );
    }

    public static void PrintMyName() {
        System.out.println("Hello \n Istvan");
    }

    public static int Sum(int FirstNumber,int SecondNumber){
        int Sum = FirstNumber + SecondNumber;
return Sum;
    }

    public static int Substraction(int FirstNumber, int SecondNumber) {
        int Substraction = FirstNumber - SecondNumber;
        return Substraction;
    }

    public static double Multiplication(double FirstNumber, double SecondNumber) {
        double Multiplication = FirstNumber * SecondNumber;
        return Multiplication;
    }

    public static double Division(double FirstNumber, double SecondNumber) {
        double Division = FirstNumber / SecondNumber ;
        return Division;
    }
}


