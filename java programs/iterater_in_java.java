import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class iterater_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
a.add("friends");
a.add("hunumant");
a.add("Aditya");
Iterator itr=a.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
