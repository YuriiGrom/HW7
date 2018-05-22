
public class State2 implements State {
	
StateMatchine stateMatchine;
	
	public State2(StateMatchine stateMatchine) {
		this.stateMatchine = stateMatchine;
	}

	@Override
	public void checkA(String aChange) {
		if (aChange == "a") {
			System.out.println("Change to state 1");
			stateMatchine.setState(stateMatchine.get1());
		}

	}

	@Override
	public void checkB(String bChange) {
		if (bChange == "b") {
			System.out.println("Change to state 4");
			stateMatchine.setState(stateMatchine.get4());
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
