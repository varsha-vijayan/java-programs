import java.util.Scanner;
public class Evenodd 
{
public static void main(String[] args) 
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter a number: ");
int num = obj.nextInt();
if(num % 2 == 0)
   System.out.println(num+" is even");
else
    System.out.println(num+" is odd");
}
}
