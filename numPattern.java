import java.util.Scanner;

public class numPattern{
public static void main(String args[]){

Scanner s= new Scanner(System.in);
System.out.println("Enter a number");
int n=s.nextInt();
int k=1;

for(int i=1;i<=n;i++)
{
 System.out.println(" ");
 for(int j=1;j<=i;j++)
{
 System.out.print(k+" ");
 k++;
}
}
}
}