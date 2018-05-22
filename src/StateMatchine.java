
public class StateMatchine {
	State state1;
	State state2;
	State state3;
	State state4;
	State endState;
	
	State state;
	
	String a= "a";
	String b= "b";
	String c= "c";
	
	public StateMatchine (String a, String b, String c) {
		
		state1 = new State1(this);
		state2 = new State2(this);
		state3 = new State3(this);
		state4 = new State4(this);
		endState = new EndState(this);
		
		state = state1;
	}
	
	void setState (State state) {
		this.state = state;	
	}
	
	public void checkA(String a) {
		state.checkA(a);
	}

	public void checkB(String b) {
		state.checkB(b);
	}
	
	public void checkC(String c) {
		state.checkC(c);
	}
	
	public State getState() {return state;}
	public State get1() {return state1;}
	public State get2() {return state2;}
	public State get3() {return state3;}
	public State get4() {return state4;}
	public State getEnd() {return endState;}
	
	

}
