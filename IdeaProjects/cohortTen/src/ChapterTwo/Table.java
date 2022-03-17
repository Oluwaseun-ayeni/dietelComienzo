package ChapterTwo;

public class Table{
public static void main(String [] args){
System.out.print("a b power(a b)");
int number = 1;
int power = 2;
System.out.printf("%d %d %f %n" , number , power , Math.pow(number,power) );

number = 2;
power = 3;
System.out.printf("%d %d %f %n" , number , power , Math.pow(number,power) );

number = 3;
power = 4;
System.out.printf("%d %d %f %n" , number , power , Math.pow(number,power) );

number = 4;
power = 5;
System.out.printf("%d %d %f %n" , number , power ,Math.pow(number,power) );

number = 5;
power = 6;
System.out.printf("%d %d %f %n" , number , power , Math.pow(number,power) ) ;

}
}