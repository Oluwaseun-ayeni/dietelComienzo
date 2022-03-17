import java .util . Scanner;

public class Storm{

public static void main(String [] args){

Scanner in = new Scanner(System.in);

System.out.print("Enter first integer ");

int firstinteger = in.nextInt();

System.out.print("Enter second integer ");

int secondinteger = in.nextInt();

int square1 = firstinteger * firstinteger;

int square2 = secondinteger * secondinteger;

int different = firstinteger - secondinteger;

int sum = firstinteger + secondinteger;

System.out.println("Square1 = " + square1);

System.out.println("Square2 = " + square2);

System.out.println("Different = " + different);

System.out.println("Sum = " + sum);

}

}
