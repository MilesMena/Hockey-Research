package hockey;
/**
 * cotains all the data that StateTwo needs
 * @author menam
 *
 */
public class StateTwo {
	// int var
	private String goalDiff, home, away, winIDS2, initCond;
	double lambda;
	// getters an setters
	public String getGoalDiff() {
		return goalDiff;
	}
	public void setGoalDiff(String goalDiff) {
		this.goalDiff = goalDiff;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getAway() {
		return away;
	}
	public void setAway(String away) {
		this.away = away;
	}
	public double getLambda() {
		return lambda;
	}
	public void setLambda(double lambda) {
		this.lambda = lambda;
	}
	public String getWinIDS2(){
		return winIDS2;
	}
	public void setWinIDS2(String winIDS2) {
		this.winIDS2 = winIDS2;
	}
	public void setInitCond(String goalDiff) {
		if (Integer.parseInt(goalDiff) > 0) {
			initCond = "1";
		} else if (Integer.parseInt(goalDiff) == 0) {
			initCond = ".5";
		} else if (Integer.parseInt(goalDiff) < 0) {
			initCond = "0";
		}
		
	}
	public String getInitCond() {
		return initCond;
	}
	
	// constructors
	public StateTwo() {
		goalDiff = "";
		home = "";
		away = "";
		lambda = 0;
		winIDS2 = "";
		initCond = "";
		
	}
	public StateTwo(String goalDiff,String home,String away,double lambda) {
		setGoalDiff(goalDiff);
		setHome(home);
		setAway(away);
		setLambda(lambda);
		winIDS2 = "";
		setInitCond(goalDiff);
	}
	@Override
	public String toString() {
		return String.format("(%s,%s,%s), lambda = %.20f, w(%s)", goalDiff, home, away, lambda, winIDS2);
	}
	
	

}
