import java.util.*;

public class array_collaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();
a1.add(100);
a1.add(200);
a1.add(300);
a1.add(400);

	System.out.println(a1);
ArrayList a2=new ArrayList();
a2.add("aditya");
a2.add("hanumant");
a2.add("nava");
a2.add("ranjit");
System.out.println(a2);
	a1.addAll(a2);
	System.out.println(a1);
	Iterator itr=a1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
