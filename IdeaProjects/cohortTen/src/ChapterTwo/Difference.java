package ChapterTwo;

import java.util.Scanner;

public class Difference{

public static void main(String [] args){

Scanner in = new Scanner(System.in);

System.out.println("Number1 ");

int number1 = in.nextInt();

System.out.println("Number2 ");

int number2 = in.nextInt();

System.out.println("The largest number of the two number is " + Math.max(number1,number2));

System.out.println("The smallest number of the two number is " + Math.min(number1,number2));

}

}