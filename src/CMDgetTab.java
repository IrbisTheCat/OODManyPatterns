
public class CMDgetTab implements CMDInterface {
	  private Aggregator agg;
	  private Orders mpr;
	  private Menu men;
	
	  public CMDgetTab(Aggregator agg){
		  this.agg=agg;
	  }
	 
	  ///TO DO write this shit
	@Override
	public Object execute() {
		System.out.println(agg.getOrders().sumIt(agg.getMenu()));
		return "";
	}
	
	
	}
