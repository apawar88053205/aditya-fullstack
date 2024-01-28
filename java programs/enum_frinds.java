
public class enum_frinds {
public enum friends{
	adi(11),hanumant(3),abhi(15),ranjit(10),kishor(12);
	private int value;
	private friends(int value) {
		this.value=value;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(friends f:friends.values())
System.out.println(f+" roll no = "+f.value);
	}

}
