import java.util.Scanner;
public class MonthlyInterest{
public static void main(String [] args){
Scanner in = new Scanner(System.in);
System.out.print("Enter monthly saving amount");
double savingAmount = in.nextInt();

double accountValue;
double monthlyInterest;
monthlyInterest = 0.00417;

accountValue = savingAmount *( 1 + monthlyInterest );

accountValue = (savingAmount + accountValue) * (1 + monthlyInterest);
accountValue = (savingAmount + accountValue) * (1 + monthlyInterest);
accountValue = (savingAmount + accountValue) * (1 + monthlyInterest);
accountValue = (savingAmount + accountValue) * (1 + monthlyInterest);
accountValue = (savingAmount + accountValue) * (1 + monthlyInterest);

System.out.printf("After sixth month ,the account value is $%.3f%n " , accountValue );
}
}