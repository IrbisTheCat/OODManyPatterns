import java.awt.DisplayMode;
import java.util.Scanner;

import Exceptions.Exceptions.InsufficientSizeArrayException;

public class ClientCode {
	static Menu eatAtJoesMenu = new Menu();
	static SystemInterface in=new SystemInterface();
	
	
	static Scanner scan;
	public static void main(String[] args) throws NumberFormatException, InsufficientSizeArrayException {
		setUp();
		in.init(eatAtJoesMenu);
		in.runner();

	
	
	}
	
	
	public static void setUp() throws InsufficientSizeArrayException {
		eatAtJoesMenu.add("Lobster Dinner",1, Menu.MAIN_DISH, Menu.NOT_HEART_HEALTHY, "24.99");
		eatAtJoesMenu.add("Rice Pudding",2, Menu.DESSERT, Menu.NOT_HEART_HEALTHY, "3.50");
		eatAtJoesMenu.add("Borsh",3, Menu.MAIN_DISH, Menu.HEART_HEALTHY, "22.50");
		eatAtJoesMenu.add("Pickles",4, Menu.APPETIZERS, Menu.HEART_HEALTHY, "5.00");
		eatAtJoesMenu.add("Ice Cream",5, Menu.DESSERT, Menu.NOT_HEART_HEALTHY, "4.00");
		eatAtJoesMenu.add("Salad",6, Menu.APPETIZERS, Menu.HEART_HEALTHY, "12.00");
		eatAtJoesMenu.add("Solyanka",7, Menu.MAIN_DISH, Menu.HEART_HEALTHY, "20.00");
		eatAtJoesMenu.add("Holodets",8, Menu.APPETIZERS, Menu.NOT_HEART_HEALTHY, "7.00");
		eatAtJoesMenu.add("Shrimps",9, Menu.MAIN_DISH, Menu.NOT_HEART_HEALTHY, "24.99");
		eatAtJoesMenu.add("Halva",10, Menu.DESSERT, Menu.NOT_HEART_HEALTHY, "3.50");

	}
}
