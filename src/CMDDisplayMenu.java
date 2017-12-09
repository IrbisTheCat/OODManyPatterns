
public class CMDDisplayMenu implements CMDInterface {
	  private Aggregator agg;
	
	  public CMDDisplayMenu(Aggregator agg){
		  this.agg=agg;
		 
	  }
	  
	@Override
	public Object execute() {
			MenuItem item;
			MenuIterator itr = agg.getMenu().getAllItemsIterator();
			System.out.println("ALL MENU ITEMS");
			while (itr.hasNext()) {
				item = itr.nextItem();
				if(item.getAvailable()==true){
				System.out.println(item.getMenuNum()+" "+item.getName() + " $" + item.getPrice());
				}
			}	
		
		return null;
	
	}

}
