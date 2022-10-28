package org.example;

/**
 * Hello world!
 *
 */
import org.example.calcpack.Calc;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Addition = "+calc.add(a,b));
        System.out.println("Substraction = "+calc.sub(a,b));
        System.out.println("Multiplication = "+calc.mul(a,b));
        System.out.println("Divicion = "+calc.div(a,b));
    }
}
