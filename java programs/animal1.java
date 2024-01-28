
class animalfamily{
	void makesound() {
		System.out.println("the animals makes sounds");
	}
}
class dog extends animalfamily{
	void makesound() {
		System.out.println(" the dog barks");
	}
}
class cat extends animalfamily{
	void makesound() {
		System.out.println(" the cat meows");
	}
}
class bird extends animalfamily{
	void makesound() {
		System.out.println(" the birds killbill");
	}
}
public class animal1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	animalfamily myanimal= new animalfamily();
	dog  mydog= new dog();
	cat mycat=new cat();
	bird mybird=new bird();
	
	myanimal.makesound();
	mydog.makesound();
	mycat.makesound();
	mybird.makesound();
	}

}
