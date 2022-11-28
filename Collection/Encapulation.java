package Collection;

import java.util.*;

class Tv {
	private int tvId;
	private String tvName;
	private int tvPrice;

	public int getTvId() {
		return tvId;
	}

	public void setTvId(int tvId) {
		this.tvId = tvId;
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

}

public class Encapulation {

	public static void main(String args[]) {
		Tv T1 = new Tv();
		T1.setTvId(23);
		T1.setTvName("Acer");
		T1.setTvPrice(23000);
		ArrayList<Tv> list = new ArrayList<>();
		list.add(T1);
		Tv T2 = new Tv();
		T2.setTvId(13);
		T2.setTvName("Sansul");
		T2.setTvPrice(2300);
		list.add(T2);
		Tv c;
		Iterator c1 = list.iterator();
		while (c1.hasNext()) {
			c = (Tv) c1.next();
			System.out.println(c.getTvId() + "\n" + c.getTvName() + "\n" + c.getTvPrice());

		}

	}
}
