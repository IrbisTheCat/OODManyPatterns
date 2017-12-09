
public class CMDDisplayMainDishes implements CMDInterface {
	  private Aggregator agg;
		
	  public CMDDisplayMainDishes(Aggregator agg){
		  this.agg=agg;
		 
	  }
	  
	@Override
	public Object execute() {
			MenuItem item;
			MenuIterator itr = agg.getMenu().getAllItemsIterator();
			System.out.println("ALL MENU ITEMS");
			while (itr.hasNext()) {
				item = itr.nextItem();
				if(item.getAvailable()==true && item.getCat()==2){
				System.out.println(item.getMenuNum()+" "+item.getName() + " $" + item.getPrice());
				}
			}	
		
		return null;
	
	}
}
