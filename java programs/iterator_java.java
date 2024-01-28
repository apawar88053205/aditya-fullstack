import java.util.*;

public class iterator_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
a.add("adi");
a.add("hanumant");
a.add("abhi");
Iterator itr= a.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}
	}

}
