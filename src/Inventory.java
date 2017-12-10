import java.util.ArrayList;
import java.util.List;

public class Inventory implements Observable{
	private int [] amounts= {5,3,10,1,20,5,1,9,7,23};
	
		
	
	
	ArrayList <Observer> observers;
	
	private static final Inventory INS= new Inventory();
	
	public static Inventory getInstance(){
		return INS;
	}
	
	
	private Inventory(){
		observers=new ArrayList <Observer> ();
	}
	
	
	public void decrement(int i){
		amounts[i]=amounts[i]-1;
		if (amounts[i]==0){
			notifyObservers(i+1);
		}
	}
	
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);	
	}
	
	@Override
	public void notifyObservers(int i) {
		// TODO Auto-generated method stub
		for(Observer o: observers){
			o.handleEvent(i);
		}
		
		
	}

}
