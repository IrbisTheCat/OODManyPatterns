import java.util.NoSuchElementException;

import Exceptions.Exceptions.InsufficientSizeArrayException;

public class Menu implements Observer{

	public static final int APPETIZERS = 1;
	public static final int MAIN_DISH = 2;
	public static final int DESSERT = 3;

	public static final boolean HEART_HEALTHY = true;
	public static final boolean NOT_HEART_HEALTHY = false;
	private int idx;

	private MenuItem[] menu;
	private int current;
	MenuIterator itr;

	Menu() {
		menu = new MenuItem[100];
		current=0;
	}

	Menu(int size) {
		menu = new MenuItem[size];
	}

	/** object to append to the end of the list of menu items */
	public void add(String name, int idx, int type, boolean bool, String cal) throws InsufficientSizeArrayException{

		for (int i = 0; i < menu.length; i++) {
			if (menu[i] == null) {
				menu[i] = new MenuItem(name, idx, type, bool, cal);
				return;
			}
		}
		System.out.println("Invalid array size you fool!");
		
	}


	/** Iterates over all of the items on the menu */
	private class AllItemsIterator implements MenuIterator {

		public AllItemsIterator(int start_loc) {
			idx = start_loc;
		}

		@Override
		public boolean hasNext() {
			if (idx < menu.length & menu[idx]!=null) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public MenuItem nextItem() {

			return menu[idx++];

		}
	}

	/**
	 * Iterates over a specified item type (appetizer, main dish, or dessert)
	 */
	private class ItemIterator implements MenuIterator {
		int tp;
		private int current_index;

		public ItemIterator(int start_loc, int type) {
			current_index = start_loc;
			tp = type;
		}

		@Override
		public boolean hasNext() {

			while (current_index < menu.length & menu[current_index]!=null) {
				if (menu[current_index].getCat() == tp) {
					return true;
				} else {
					current_index++;
				}
			}
			return false;
		}

		@Override
		public MenuItem nextItem() {

			return menu[current_index++];
		}

	}

	/** Iterates over the heart healthy items on the menu */
	private class HeartHealthyIterator implements MenuIterator {

		private int current_index;
		boolean tp;

		public HeartHealthyIterator(int start_loc, boolean type) {
			current_index = start_loc;
			tp = type;
		}

		@Override
		public boolean hasNext() {
			while (current_index < menu.length && menu[current_index]!=null) {
				if (menu[current_index].getHeartStat() == tp) {
					return true;
				} else {
					current_index++;
				}
			}
			return false;
		}

		@Override
		public MenuItem nextItem() {
			return menu[current_index++];
		}

	}

	/** Iterates over the main dishes that are under a specified price */
	private class PriceIterator implements MenuIterator {
		private int current_index;
		Double tp;
		Double d;;

		public PriceIterator(int start_loc, String type) {
			current_index = start_loc;
			tp = Double.parseDouble(type);

		}

		@Override
		public boolean hasNext() {
			while (current_index < menu.length & menu[current_index]!=null) {
				if (Double.parseDouble(menu[current_index].getPrice()) < tp) {
					return true;
				} else {
					current_index++;
				}
			}
			return false;
		}

		@Override
		public MenuItem nextItem() {
			return menu[current_index++];
		}

	}

	public MenuIterator getAllItemsIterator() {
		itr = new AllItemsIterator(0);
		return itr;

	}

	public MenuIterator getHeartHealthyIterator() {
		itr = new HeartHealthyIterator(0, HEART_HEALTHY);
		return itr;

	}

	public MenuIterator getItemIterator(int type) {
		itr = new ItemIterator(0, type);
		return itr;
	}

	public MenuIterator getPriceIterator(String price) {
		itr = new PriceIterator(0, price);
		return itr;
	}


	@Override
	public void handleEvent(int i) {
		menu[i-1].setNotAvailable();
	
	}

}
