import java.util.Scanner;

import Exceptions.Exceptions.InsufficientSizeArrayException;

public class SystemInterface {
	  private static Invoker invoker;
	  private static Menu men;
	 
	    
	    public static void init(){
	    	
	        invoker = new Invoker(new Menu(), new Orders());
	    }
	    public static void init(Menu it ){
	    	men=it;
	    	Inventory.getInstance().registerObserver(it);
	    	invoker=new Invoker(it, new Orders());
	    }
	    
	    
	    public static void runner(){
	    	Scanner scan = new Scanner(System.in);
			System.out.println("Welcome!");
			while (true){
				System.out.println("Press 1 to  display all menu items");
				System.out.println("Press 2 to submit order");
				System.out.println("Press 3 to go print tab");
				System.out.println("Press 4 to  display helathy items");
				System.out.println("Press 5 to  display main dishes only");
				
				String input = scan.nextLine();
				
				if (input.equals("1")){
					invoker.displayMenu();
					input = scan.nextLine();
				}
				if (input.equals("2")){
					invoker.displayMenu();
					System.out.println("Pick one!");
					input = scan.nextLine();
					invoker.addItem(Integer.parseInt(input));
					System.out.println("All done!");
					
				}
				if (input.equals("3")){
					invoker.displayTab();
					input = scan.nextLine();
				}
				if (input.equals("4")){
					invoker.displayHealthy();
					input = scan.nextLine();
				}
				if (input.equals("5")){
					invoker.displayMainDishes();
					input = scan.nextLine();
				}
			}
	    	   	
	    	
	    }
	   
	  

}
