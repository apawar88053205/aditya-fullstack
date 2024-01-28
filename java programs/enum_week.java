
public class enum_week {
public enum week{
	monday(1),tuesday(2), wednusday(3),thersday(4),friday(5),saturday(6),
	sunday(7);
	private int value;
	private week(int value) {
		this.value=value;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(week w:week.values())
	System.out.println(w+" "+w.value);
	}

}
