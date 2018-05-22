
public class StateTest {

	public static void main(String[] args) {
		
		String a= "a";
		String b= "b";
		String c= "c";
		
		StateMatchine stateMatchine = new StateMatchine(a, b, c);
		//checking state 1 links
		System.out.println("Checking state 1 links");
		stateMatchine.checkA(a);
		stateMatchine.checkB(b);
		stateMatchine.checkA(a);
		stateMatchine.checkC(c);
		
//		going to state2
		System.out.println("\nGoing to state 2");
		stateMatchine.checkB(b);
		stateMatchine.checkB(b);
		
//		checking state 2 links
		System.out.println("\nChecking state 2 links");
		stateMatchine.checkB(b);
		stateMatchine.checkB(b);
		stateMatchine.checkA(a);
		stateMatchine.checkB(b);
		stateMatchine.checkC(c);
		
//		going to state 4
		System.out.println("\nGoing to state 4");
		stateMatchine.checkB(b);
		stateMatchine.checkB(b);
		stateMatchine.checkB(b);
		
//		checking state 4 links
		System.out.println("\nChecking state 4 links");
		stateMatchine.checkA(a);
		stateMatchine.checkB(b);
		stateMatchine.checkB(b);
		stateMatchine.checkB(b);
		stateMatchine.checkB(b);
		
//		going to state 3
		System.out.println("\nGoing to state 3");
		stateMatchine.checkC(c);
		
//		checking state 3 links
		System.out.println("\nChecking state 3 links");
		stateMatchine.checkA(a);
		stateMatchine.checkB(b);
		stateMatchine.checkC(c);
		stateMatchine.checkC(c);
		

	}

}
