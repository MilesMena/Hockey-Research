package hockey;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
public class FileReader {
	public static ArrayList<StateOne> readDataFromFile(String fname){
		try {
			ArrayList<StateOne> s1 = new ArrayList<StateOne>();
			ArrayList<String> uniqueHeaders = new ArrayList<String>();
			Scanner fsc = new Scanner(new File(fname));
			String line, goalDiffS1, homeS1, awayS1, goalDiffS2, homeS2, awayS2,  transition, headerS1, headerS2;
			double lambda;
			int winID;
			String[] parts, transParts, s1Parts, s2Parts;
			StateOne stateUno = null;
			StateTwo stateDos = null;
			winID = 1;
			while (fsc.hasNextLine()) {
	
				line = fsc.nextLine().trim();
				//
				parts = line.split("\t");
				transition = parts[0];
				lambda = Double.parseDouble(parts[1]);
				// 
				transParts = transition.split(">");
				headerS1 = transParts[0];
				headerS2 = transParts[1];
				//
				s1Parts = headerS1.split(",");
				goalDiffS1 = s1Parts[0];
				homeS1 = s1Parts[1];
				awayS1 = s1Parts[2];
				if (uniqueHeaders.contains(headerS1)) {
					
				} else {
					uniqueHeaders.add(headerS1);
					stateUno = new StateOne(goalDiffS1, homeS1, awayS1, String.valueOf(winID));
					s1.add(stateUno);
					winID = winID + 1;
				}
			
				//
				s2Parts = headerS2.split(",");
				goalDiffS2 = s2Parts[0];
				homeS2 = s2Parts[1];
				awayS2 = s2Parts[2];
				stateDos = new StateTwo(goalDiffS2,homeS2,awayS2, lambda);
				stateUno.setTransition(stateDos);
				
				
			}
			
			return s1;
		} catch (Exception ex) {
			return null;
		}
		
		
	}

}
