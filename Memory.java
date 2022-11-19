package javacode;

public class Memory {
	
int a,b;
public void Students()
{
	int id=23;
	String Studentname="Sarvesh";
	System.out.println("Student id is "+id);
	System.out.println("Student name is"+Studentname);
	
	
}
public void Teacher()
{
	int id=34;
	String Teachername="sherylin";
	System.out.println("Teacher id is"+ id);
	System.out.println("teacher name is"+Teachername);
	
	
}
public static void main(String args[])
{
	Memory M= new Memory();
	Memory n=M;
	System.out.println(M.hashCode());
	System.out.println(n.hashCode());
	M.Students();
	M.Teacher();
	
}
}
