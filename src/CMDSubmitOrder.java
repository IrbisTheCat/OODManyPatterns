import Exceptions.Exceptions.InsufficientSizeArrayException;

public class CMDSubmitOrder implements CMDInterface {
	  private Aggregator agg;
	  private OrderItem mpr;
	
	  public CMDSubmitOrder(Aggregator agg, OrderItem mpr){
		  this.agg=agg;
		  this.mpr=mpr;
	  }
	  
	@Override
	public Object execute() {
		try {
			agg.getOrders().add(mpr);
		} catch (InsufficientSizeArrayException e) {
			System.out.println("Wrong array size you fool!");
		}
		return null;
	
	}
}
