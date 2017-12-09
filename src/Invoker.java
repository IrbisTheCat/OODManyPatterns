
public class Invoker {
		private Aggregator agg;
	    
	    public Invoker(Menu men, Orders or){
	        agg = new Aggregator(men, or);
	    }
	    
	    public Object displayMenu(){
	    	return new CMDDisplayMenu(agg).execute();
	    	
	    }
	    
	    public Object addItem(int idx){
	    	return new CMDSubmitOrder(agg, new OrderItem(idx)).execute();
	    	
	    }
	    
	    public Object displayTab(){
	    	return new CMDgetTab(agg).execute();
	    }
	    
	    public Object displayHealthy(){
	    	return new CMDDisplayHealthy(agg).execute();
	    }
	    
	    public Object displayMainDishes(){
	    	return new CMDDisplayMainDishes(agg).execute();
	    }
}
