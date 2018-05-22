
public class State1 implements State {
	
	StateMatchine stateMatchine;
	
	public State1(StateMatchine stateMatchine) {
		this.stateMatchine = stateMatchine;
	}

	@Override
	public void checkA(String aChange) {
		if (aChange == "a") {
			System.out.println("Return to state 1");
			stateMatchine.setState(stateMatchine.get1());
		}
		
	}

	@Override
	public void checkB(String bChange) {
		if (bChange == "b") {
			System.out.println("Change to state 2");
			stateMatchine.setState(stateMatchine.get2());
		}
		
	}

	@Override
	public void checkC(String cChange) {
		if (cChange == "c") {
			System.out.println("Change to state 3");
			stateMatchine.setState(stateMatchine.get3());
		}
		
	}



}
