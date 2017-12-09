
public class Aggregator {
	private Menu men;
	private Orders or;
	
	public Aggregator(Menu m, Orders o){
		men=m;
		or=o;
	}
	public Menu getMenu(){
		return men;
	}

	public Orders getOrders(){
		return or;
	}
	
}
