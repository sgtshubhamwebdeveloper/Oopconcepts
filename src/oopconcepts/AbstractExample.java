package oopconcepts;


abstract class Bike {
	abstract void run();
}
class Honda extends Bike {
	public void run() {
		System.out.println("Honda bike is running");
	}
}
public class AbstractExample {
	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
		
	}

}
