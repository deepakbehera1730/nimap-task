package TodayTask;

class Base {
	void Same() {
		System.out.println("I am in base Class");
	}
}

class Derived extends Base {
	void Same() {
		System.out.println("I am in Child class");
	}
}

public class MethodOverriding {
	public static void main(String args[]) {
		Base b1 = new Base();
		b1.Same();
	}

}
