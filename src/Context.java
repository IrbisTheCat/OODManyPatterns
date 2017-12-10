
public class Context {
	
	private static final Context CONS=new Context(){};
	
	private static State state=null;
	
	public static Context getInstance(){
		return CONS;
	}

	 public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
}
