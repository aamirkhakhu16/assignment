package publicis.sapient.assignment.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WinningTeam {

	private final String team1;
	private final String team2;
	private final String winningTeamScore;
	private final String roundRotation;
	
	public WinningTeam(String team1, String team2, String winningTeamScore, String roundRotation) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.winningTeamScore = winningTeamScore;
		this.roundRotation = roundRotation;
	}

	@JsonProperty("Team-1")
	public String getTeam1() {
		return team1;
	}

	@JsonProperty("Team-2")
	public String getTeam2() {
		return team2;
	}

	public String getWinningTeamScore() {
		return winningTeamScore;
	}

	public String getRoundRotation() {
		return roundRotation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roundRotation == null) ? 0 : roundRotation.hashCode());
		result = prime * result + ((team1 == null) ? 0 : team1.hashCode());
		result = prime * result + ((team2 == null) ? 0 : team2.hashCode());
		result = prime * result + ((winningTeamScore == null) ? 0 : winningTeamScore.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WinningTeam other = (WinningTeam) obj;
		if (roundRotation == null) {
			if (other.roundRotation != null)
				return false;
		} else if (!roundRotation.equals(other.roundRotation))
			return false;
		if (team1 == null) {
			if (other.team1 != null)
				return false;
		} else if (!team1.equals(other.team1))
			return false;
		if (team2 == null) {
			if (other.team2 != null)
				return false;
		} else if (!team2.equals(other.team2))
			return false;
		if (winningTeamScore == null) {
			if (other.winningTeamScore != null)
				return false;
		} else if (!winningTeamScore.equals(other.winningTeamScore))
			return false;
		return true;
	}
	
	

}