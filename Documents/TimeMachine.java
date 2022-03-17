import java.util.Scanner;
public class TimeMachine{
public static void main(String [] agrs){
Scanner in = new Scanner(System.in);
System.out.print("Enter the number of minutes");
int numberOfMinutes = in.nextInt();


int years = numberOfMinutes / (60 * 24 * 365);
int numberOfdays = (numberOfMinutes % (60 * 24 *365)) /1440; 

System.out.printf("%d minutes is approximately %d years and %d days %n", numberOfminutes, years,numberOfdays);

}
}	