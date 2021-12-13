package hockey;
import java.util.Scanner;
import java.util.ArrayList;
public class HockeyMain {
	public static int countMatrix(String matrix) {
		int semicolons = 0;
		String [] parts = matrix.split(";");
		semicolons = parts.length;
		return semicolons;
	}

	public static void main(String[] args) {
		
		ArrayList<StateOne> stateOne = null;
		String file = "copyTransitionsLambdas.txt";
		stateOne = FileReader.readDataFromFile(file);
		StateOne.setState2WinID(stateOne);
		//HockeyPrinter.printSingleStateTransitios(stateOne.get(1));
		//HockeyPrinter.printStateOne(stateOne);
		//HockeyPrinter.printTransition(stateOne);
		//HockeyPrinter.printEquations(stateOne);
		//HockeyPrinter.printInitConValues(stateOne);
		//System.out.println((countMatrix(StateOne.getMatrix1())));
		//System.out.println((countMatrix(StateOne.getMatrix2())));
		//HockeyPrinter.tValues();
		HockeyPrinter.printLegend(stateOne);
		
		
	}
	

}
