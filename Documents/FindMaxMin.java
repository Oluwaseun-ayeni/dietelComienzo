import java.util.Scanner;
public class FindMaxMin{
public static void  main (String [] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter first integer");
int firstinteger = input.nextInt();
System.out.println("Enter second integer");
int secondinteger = input.nextInt();
System.out.println("Enter third number");
int thirdinteger = input.nextInt();
int miniNumber = 0;
miniNumber = firstinteger;
int maxNumber =0;
maxNumber = secondinteger;

if (secondinteger < firstinteger){

System.out.printf("the smallest number is :%d ",secondinteger);

if (thirdinteger < firstinteger && thirdinteger < secondinteger){
miniNumber = thirdinteger;
System.out.printf("the smallest number is :%d " , thirdinteger);
}


if (firstinteger > secondinteger) {
maxNumber = firstinteger;
System.out.printf("the largest number is :%d ",firstinteger);
}
}
if (thirdinteger > secondinteger && thirdinteger > firstinteger){
maxNumber = thirdinteger;
System.out.printf("the largest number is :%d " , thirdinteger);

}
}

}

