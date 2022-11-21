package javacode;

public class EncapulationTv {
 private int tvSize;
 private String tvName;
 private int tvPrice;
public int getTvSize() {
	return tvSize;
}
public void setTvSize(int tvSize) {
	this.tvSize = tvSize;
}
public String getTvName() {
	return tvName;
}
public void setTvName(String tvName) {
	this.tvName = tvName;
}
public int getTvPrice() {
	return tvPrice;
}
public void setTvPrice(int tvPrice) {
	this.tvPrice = tvPrice;
}
public static void main(String args[])
{
	EncapulationTv Tv1=new EncapulationTv();
	Tv1.setTvSize(23);
	Tv1.getTvSize();
	System.out.println("Tv size is:"+Tv1.tvSize);
	Tv1.setTvName("Acer");
	Tv1.getTvName();
	System.out.println("Tv name is:"+Tv1.tvName);
	Tv1.setTvPrice(14000);
	Tv1.getTvPrice();
	System.out.println("Tv price is:"+Tv1.tvPrice);
	
}
 
}
