package ExceptionHandling;
import java.lang.*;



public class Finallyblock {
	public static void main(String args[]) {
		String M=null;
		try {
			System.out.println(M.toUpperCase());
			
		} catch (NullPointerException H ) {
			System.out.println(H);
		}
		finally {
			System.out.println("this is the block");
		}
	}
}
