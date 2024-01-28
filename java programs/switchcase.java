import java.util.*;
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int daynum;
Scanner sc =new Scanner(System.in);
System.out.println(" Enter the day number");
daynum =sc.nextInt();
switch (daynum)
{
case 1:
	System.out.println(" monday");
	break;
case 2:
	System.out.println("tuesday");
	break;
case 3:
	System.out.println(" wednusday");
	break;
case 4:
	System.out.println("thersday");
	break;
case 5:
	System.out.println("friday");
	break;
case 6:
System.out.println("saturday");
break;
case 7:
	System.out.println("sunday");
	break;
  default :
	  System.out.println(" wrong input");
	  
break;
	
}
	}

}
