package ar.edu.untref.ia;

public class Situation {

	private int playerPoints;
	private int croupierPoints;
	private Action action;

	public Situation(int player, int dealer, Action action) {
		this.playerPoints = player;
		this.croupierPoints = dealer;
		this.action = action;
	}

	public int getPlayerPoints() {
		return playerPoints;
	}

	public int getCroupierPoints() {
		return croupierPoints;
	}

	public Action getAction() {
		return action;
	}
	
	public void setPlayerPoints(int playerPoints) {
		this.playerPoints = playerPoints;	
	}
	
	public void setCroupierPoints(int croupierPoints) {
		this.croupierPoints = croupierPoints;
	}

	@Override
	public boolean equals(Object anotherObject) {
		boolean equals = false;
		if (anotherObject == null || !(anotherObject instanceof Situation)) {
			equals = false;
		}
		if (anotherObject == this) {
			equals = true;
		}
		Situation anotherSituation = (Situation) anotherObject;
		if (anotherSituation.getPlayerPoints() == this.playerPoints &&
				anotherSituation.getCroupierPoints() == this.croupierPoints &&
				anotherSituation.getAction() == this.action) {
			equals = true;
		}
		return equals;
	}

	@Override
	public int hashCode() {
		int hashCode = 17;
		hashCode = 31 * hashCode + this.playerPoints;
		hashCode = 31 * hashCode + this.croupierPoints;
		hashCode = 31 * hashCode + this.action.hashCode();
		return hashCode;
	}
	
}