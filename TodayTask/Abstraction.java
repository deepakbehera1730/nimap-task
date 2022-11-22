package TodayTask;

abstract class Fruits {
	abstract void Taste();

}

class Mango extends Fruits {
	public void Taste() {
		System.out.println("Mango Taste is Sweeat");
	}

}

public class Abstraction {
	public static void main(String args[]) {
		Mango M1 = new Mango();
		M1.Taste();
	}

}
