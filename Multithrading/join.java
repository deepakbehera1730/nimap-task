package Multithrading;

class Heloo extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
		}
	}
}

public class join {
	public static void main(String args[]) throws Exception {
		Heloo j = new Heloo();
		j.start();
		j.join();

		for (int i = 1; i <= 10; i++) {

			System.out.println(" " + i);
		}
	}

}
