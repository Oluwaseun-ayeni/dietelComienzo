import java.util.Scanner;

public class MinutesConverter{
	public static void main(String[] args){
	
	System.out.print("Enter the number of minutes: ");
	
	Scanner collect = new Scanner(System.in);
	int numberOfMinutes = collect.nextInt();

	int years = numberOfMinutes / (60 * 24 * 365);
	int days = (numberOfMinutes % (60 * 24 * 365)) / 1440;

	System.out.printf("%d minutes is approximately %d years and %d days %n", numberOfMinutes, years, days);
	

}

} 