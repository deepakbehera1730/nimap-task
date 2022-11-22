package TodayTask;

class Addition {
	int x, y, z;

	void Add(int a, int b) {
		x = a;
		y = b;
		z = x + y;
		System.out.println("Addition of two Numbers:" + z);
	}
}

class Substraction extends Addition {
	float a, b, c;

	void substract(float a, float b) {
		this.a = a;
		this.b = b;
		c = this.a - this.b;
		System.out.println("Substraction of two numbers:" + c);
	}
}

public class MethodOverloading {
	public static void main(String args[]) {
		Substraction A1 = new Substraction();
		A1.Add(34, 67);
		A1.substract(789.7f, 187.45f);
	}

}
