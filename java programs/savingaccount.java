class save {
	
	void show(int a){
	System.out.println("hello");
	}
}
class save1 extends save {
	float intrest;
	float diposite;
	
	void show() {
		System.out.println(" save the money");
	}
}
public class savingaccount {
	public static void main(String[] args) {
save1 a=new save1();
a.show(20);
a.show();
	}
}
