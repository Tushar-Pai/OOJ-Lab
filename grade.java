import java.util.Scanner;

class grade{
public static void main(String args[]){

Scanner myObj= new Scanner(System.in);

System.out.println("Enter CIE marks");
int c= myObj.nextInt();

System.out.println("Enter SIE marks");
int s= myObj.nextInt();
int z=s/2;
int res=z+c;

if(res>90 && res<=100)
System.out.println("S Grade");
else if(res>80 && res<=90)
System.out.println("A Grade");
else if(res>70 && res<=80)
System.out.println("B Grade");
else if(res>60 && res<=70)
System.out.println("C Grade");
else if(res>50 && res<=60)
System.out.println("D Grade");
else if(res>40 && res<=50)
System.out.println("E Grade");
else
System.out.println("F Grade");

}
}