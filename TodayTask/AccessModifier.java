package TodayTask;
//Access modifier

// there 4 types of access 
//private,protected,public,default

class First {
	private int x = 40;
	protected int g = 90;
	public int f = 7865;

}

class Second extends First {
	void Integ() {
		System.out.println("protected and public value" + g + " and" + f);
	}

}

public class AccessModifier {

	public static void main(String args[]) {
		Second S1 = new Second();
		S1.Integ();
		System.out.println("public value " + S1.f);
	}

}
