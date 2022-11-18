package javacode;



public class datatype {
	public  void getdata()
	{
		int x=29;
		int y=45;
		System.out.println("this is the referecnce function");
		System.out.println("x="+x+"y="+y);
	}
	
	public static void main(String args[])
	{
		//primitive data type
		int Age=20;
		byte no=9;
		long Phoneno=8806899882L;
		float Cm=26.9f;
		double decimalpoint=2345.666;
		char name='d';
		
		System.out.println("Intger:"+Age);
		System.out.println("Long:"+Phoneno);
		System.out.println("Byte"+no);
		System.out.println("Flaot"+Cm);
			System.out.println("longer"+decimalpoint);
			// reference data type
			datatype type=new datatype();
			type.getdata();
			
			
			
			
			
			
			
			
	}
}

	 		
		
		
		

