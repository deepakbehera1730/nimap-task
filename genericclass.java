package javacode;
class mybook<T>{
	
	T i;
	public void set(T k) {
		i=k;
	}
	public T get() {
		return(i);
	}
}

public class genericclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mybook<Integer>m1=new mybook<Integer>();
		mybook<String>m2=new mybook<String>();
		m1.set(23);
		m2.set("rahul");
		System.out.println("mybook id "+m1.get()+" mybbok name "+m2.get());

	}

}
