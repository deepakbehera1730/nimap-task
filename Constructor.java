package javacode;

public class Constructor {
   int i,k;
   
    Constructor()
    {
	i=45;
	k=23;
	System.out.println("Constructor "+i+" k value "+k);
		
	}
    public static void main(String args[])
    {
    	Constructor C= new Constructor();
    }
}
