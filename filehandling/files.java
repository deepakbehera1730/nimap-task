package filehandling;
import java.io.*;
public class files {

	static void file(String string)
	{
		System.out.println(string);
	}
	public static void main(String args[])
	{
		File f1= new File("C:\\deepak\\files\\spring.txt");
		file("get name "+f1.getName());
		file("get directory"+f1.getParent());
		file("get addres "+f1.getPath());
		file(f1.canRead()?"is readable":"is not reable");
		file(f1.canWrite()?"is wriateable":"is not reable");
		file("length of files:"+f1.length()+"bytes");
		File f2= new File("C:\\deepak\\files\\hello.txt");
		boolean f= f1.renameTo(f2);
		System.out.println(f);
		
	}
}
