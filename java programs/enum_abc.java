
public class enum_abc {
public enum month{
	jan(1),feb(2),mar(3);
	private int value;
	private month(int value) {
		this.value=value;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(month m: month.values())
	System.out.println(m+" "+m.value);
	}

}
