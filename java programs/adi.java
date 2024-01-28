
import java.util.Scanner;
class stud{
	Scanner sc=new Scanner(System.in);
	int roll;
void getroll(){
	System.out.println(" enter the roll no ");
    roll=sc.nextInt();
}
void setroll(){
	System.out.println(" the roll number is = "+roll);
}
}
class test extends stud{
 Scanner sc =new Scanner(System.in);
 int mark2 ,mark1;
 	void getmark()	{
		System.out.println(" Enter the marks");
		mark1=sc.nextInt();
		mark2=sc.nextInt();
	}
	void setmark()	{
		System.out.println(" the marks are = "+mark1+"  "+mark2);
	}
}
interface adi2
{
	int smark=25;
	void show();
}
class adi1 extends test implements adi2{
	public void show()	{
		System.out.println(" marks of smark = "+smark);
	}
	void display()	{
       getroll();
		getmark();
	    show();
	}
}
class adi {
	public static void main (String [] args ) {
		adi1 ap=new adi1();
		ap.display();
		ap.setroll();
		ap.setmark();
		ap.show();
	}
}