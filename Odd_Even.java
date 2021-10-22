import java.util.Scanner;
public class Odd_Even
{
 public static void main(String[] args)
{
int n; 
Scanner s= new Scanner (System.in);
System.out.println("ENTER NUMBER: ");
n=s.nextInt();
if(n%2==0) { System.out.println("THE GIVEN NUMBER"+n+" IS EVEN ");}
else { System.out.println("THE GIVEN NUMBER"+n+" IS ODD ");}
}
}