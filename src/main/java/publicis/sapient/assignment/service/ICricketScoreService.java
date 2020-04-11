package publicis.sapient.assignment.service;

import publicis.sapient.assignment.model.WinningTeam;

public interface ICricketScoreService {
	public WinningTeam getTotalScoreWinningTeam(String uniqueId);
}
