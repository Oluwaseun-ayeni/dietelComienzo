package ChapterTwo;

import java.util.Scanner;
public class Celsius{
public static void main(String [] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter a degree :");
double celsius = in.nextDouble();
double fahrenhiet = (9.0/5.0) * celsius + 32;
System.out.println("Fahrenhiet is" +fahrenhiet);
}
}