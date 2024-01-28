import java.util.*;
public class asending_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println(" enter the number 1 ");
a=sc.nextInt();
System.out.println(" enter the number 2");
b=sc.nextInt();
System.out.println(" enter the number 3 ");
c=sc.nextInt();
if(a<b && a<c && b<c ) {
	System.out.println(" the numbers are in assending order");
}
	  else if(a>b && a>c && b>c) {
		System.out.println(" the numbers are in desending order");
	}
	  else {
		  System.out.println(" number are not in accending and desending");
	  }

	}

}
