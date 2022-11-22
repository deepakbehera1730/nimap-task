package TodayTask;

class Tv {
	private int tvId;
	private String tvName;
	private int tvPrice;

	void setAllData(int tvId, String tvName, int tvPrice) {
		this.tvId = tvId;
		this.tvName = tvName;
		this.tvPrice = tvPrice;
	}

	void getAllData() {
		System.out.println("TvId:-" + tvId);
		System.out.println("TvName:-" + tvName);
		System.out.println("TvPrice:-" + tvPrice + "Rs");

	}

}

public class Encapulation {

	public static void main(String args[]) {
		Tv T1 = new Tv();
		T1.setAllData(2, "Acer", 9890);
		T1.getAllData();

	}
}
