import java .util . Scanner;

public class Compare{

public static void main(String [] args){

Scanner in = new Scanner(System.in);

int a = 5;

int b = 10;

System.out.print("Enter first integer: ");

int number1 = in.nextInt();

System.out.print("Enter second integer: ");

int number2 = in.nextInt();

if (number1 < number2) {

System.out.printf("%d < %d%n", number1, number2);

}

int c = 20;

int d = 30;

System.out.print("Enter first integer: ");

int number3 = in.nextInt();

System.out.print("Enter second integer: ");

int number4 = in.nextInt();

if (number3 == number4) {

System.out.printf("%d == %d%n", number3, number4);

}

}

}




