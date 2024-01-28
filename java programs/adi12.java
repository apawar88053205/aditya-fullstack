 class adi6 {

	
int add (int a,int b) {
	System.out.println(" adding two integers");
	return a+b;
}
double add (double a, double b) {
	System.out.println(" adding two doubles ");
	return a+b;
	
}
}
class adi12 {
	public static void main (String [] args) {
		adi6 a=new adi6 ();
	System.out.println(a.add(5, 5));
	System.out.println(a.add(5.5, 2.3));
	}

}
