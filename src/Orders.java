import Exceptions.Exceptions.InsufficientSizeArrayException;

public class Orders {
	private OrderItem [] orders;
	private int current;
	
		


public Orders(){
	orders=new OrderItem[100];
	current=0;
	

}

public void add(OrderItem or) throws InsufficientSizeArrayException{
	int i=0;  

	while(i < orders.length)
      {
          if(orders[i] == null){
             orders[i]=or;
             Inventory.getInstance().decrement(orders[i].getItem()-1);
              return;
          }            
          else
              i= i+ 1;
      }
      
      System.out.println("Invalid array size you fool");
	
}


public String sumIt(Menu men){
	MenuItem item;	
	int i=0;  
	String str="";
	double total=0;
	while(i < orders.length && orders[i] != null)
      {
		item=getPric(orders[i].getItem(), men);
		str=str+item.getName()+"........"+item.getPrice()+"\n";
		total=total+Double.parseDouble(item.getPrice());
		i++;
		
      }
	return (str+"Your total is:........$"+total);	
}

public MenuItem getPric(int idx, Menu men){
	MenuIterator itr = men.getAllItemsIterator();
	MenuItem item;
	while (itr.hasNext()) {
		item = itr.nextItem();	
		if(item.getMenuNum()==idx){
			return item;
			
		}
	}
	return null;
	
}


public void delete(){
	
}

}
