
public class MenuItem {
	private String name;
	private int idx;
	private int category;
	private boolean heartHealthy;
	private String price;
	private boolean available;
	
	MenuItem(String n, int idx, int cat, boolean healthy, String p){
		this.idx=idx;
		name=n;
		category=cat;
		heartHealthy=healthy;
		price=p;
		available=true;
	}

	public int getMenuNum(){
		return idx;
	}
	public String getName() {
		return name;
	}

	public String getPrice() {
		return price;
	}
	public int getCat(){
		return category;
	}
	public boolean getHeartStat(){
		return heartHealthy;
	}
	public void setNotAvailable(){
		available=false;
	}
	public void setAvailable(){
		available=true;
	}
	public boolean getAvailable(){
		return available;
	}
	
}
