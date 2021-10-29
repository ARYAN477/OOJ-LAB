import java.util.Scanner;
public class Mainclass
{
 public static void main(String[] args)
  {
   System.out.println("ENTER NUMBER OF ROWS: ");
   Scanner sc= new Scanner(System.in);
   int noOfrows=sc.nextInt();
 int value=1;
   System.out.println("PATTERN: ");
for(int i=1;i<=noOfrows;i++) {
for(int j=1;j<=i;j++) { System.out.print(value+"\t");
value++;
}

System.out.println();
}
}
}