package filehandling;
import java.io.*;

public class createfiles {

		public static void main(String args[]) throws IOException 
		{
//	{
//		File f1= new File("C:\\deepak\\files\\task.txt");
//		f1.createNewFile();
	FileWriter f= new FileWriter("task.txt");
	f.write("hello deepak");
	f.close();
	
		
	}
}
