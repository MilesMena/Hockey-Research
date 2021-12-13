package hockey;
import java.util.ArrayList;
public class HockeyPrinter {
	public static void printStateOne(ArrayList<StateOne> stateOne) {
		for (StateOne s1: stateOne) {
			System.out.println(s1);
		}
	}
	public static void printTransition(ArrayList<StateOne> stateOne) {
		for (StateOne s1: stateOne) {
			System.out.println(s1 + " IC Value = " + s1.getInitCondValue() +"->");
			for (StateTwo s2: s1.getTransitions()) {
				System.out.println("\t"+ s2 );
			}
		}
	}
	public static void printSingleStateTransitios(StateOne state1) {
		System.out.println(state1 + "->");
		for (StateTwo s2: state1.getTransitions()) {
			System.out.println("\t" + s2);
		}
	}
	public static void printEquations(ArrayList<StateOne> state1) {
		for (StateOne s1: state1) {
			System.out.printf("%s-%s*w(%s);\n",s1.stringOfLambdaWinID(s1),s1.lambdaBeforeWinID(s1), s1.getWinID());
			System.out.println("");
		}
	}
	public static void printInitConValues(ArrayList<StateOne> state1) {
		String IC = "IC = [ ";
		for (StateOne s1: state1) {
			IC = IC + s1.getInitCondValue() + "; ";
			
		
	}
		System.out.println(IC + "]");
	}
	public static void printLegend(ArrayList<StateOne> state1) {
		for (StateOne s1: state1) {
			System.out.printf("%sw(%s,%s,%s,t)%s, ","'", s1.getGoalDiff(), s1.getHome(),s1.getAway(),"'");
		}
	}
	public static void tValues() {
		String tValues = "";
		for (int i = 0; i < 60; i++) {
			tValues = tValues  + Integer.toString(i + 60);
		}
		System.out.print(tValues);
	}
}
