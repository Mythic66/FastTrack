package com.company;

public class Metode {
    public static void main(String[] args) {
        PrintMyName();
        System.out.println("The result of Sum is : " + Sum(2,3));
        System.out.println("The result of the Subtraction is : " + Substraction(2436,456));
        System.out.println("The result of the Multiplication is :" + Multiplication(56d,47d) );
        System.out.println("The result of the Division is : " + Division(43252345d,345d) );
        Java();

        System.out.println("The Median value is : " + Median(3d,4d,5d));

        Smiley();

        System.out.println("The remainder of these two number is : " + Remainder(6345,43));
        System.out.println("The Celsius equivalent is :" + Celsius(100) );
        System.out.println("The lenght in Meter is : "+ Meter(120));
        System.out.println("The current Speed in m/s is : "+ Speed(25458,1,1,1));
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

    public static void Java() {
        System.out.print("    J     a    v     v  a \n    J    a a    v   v  a a \n J  J   aaaaa    V V  aaaaa \n  JJ   a     a    V  a     a\n");
    }

    public static double Median(double FirstNumber, double SecondNumber, double ThirdNumber) {
        double Median = (FirstNumber + SecondNumber +ThirdNumber) / 3d;
        return Median;
    }

    public static void Smiley() {
        System.out.print("  +\"\"\"\"\"+ \n[ | o o | ] \n  |  ^  |\n  | '_' |\n  +-----+\n");
   }

    public static double Remainder(double FirstNumber,double SecondNumber) {
        double Remainder = FirstNumber % SecondNumber;
        return Remainder;
    }

    public static double Celsius(double Farenheit) {
        double Celsius = (Farenheit - 32) * 5/9D;
        return Celsius;
    }

    public static double Meter(double inch) {
        double Meter = inch / 39.37D;
        return Meter;
    }

    public static double Speed(double meters,int hours,int minutes, int seconds) {
        double MetersPerSecond = meters /((hours * 3600) + (minutes * 60 ) + seconds);
        double KmPerHour = (meters * 1000 ) / (hours + (minutes / 60) + (seconds / 3600));

        double Speed = MetersPerSecond;
        return Speed;
    }
}


