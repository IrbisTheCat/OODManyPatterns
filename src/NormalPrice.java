
public class NormalPrice implements State {

	@Override
	public void  doAction(Context cont) {
		cont.setState(this);
		
	}

}
