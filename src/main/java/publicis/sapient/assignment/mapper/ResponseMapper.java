package publicis.sapient.assignment.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;

import publicis.sapient.assignment.model.WinningTeam;

@Component
public class ResponseMapper {
	
	public WinningTeam convertToWinningTeam(JsonNode jsonNode) {
		
		String winningTeamScore = "";
		String roundRotation = "";
		
		String score = jsonNode.get("score").toString();
		
		String[] teams = score.split("v");
		
		String team1 = teams[0].trim();
		if (!team1.contains("*")) {
			team1 = team1.substring(0,team1.lastIndexOf(" "));
		} else {
			team1 = team1.replace("*", "").trim();
			String[] splitString = team1.split(" ");
			winningTeamScore = splitString[splitString.length - 1];
			team1 = team1.substring(0,team1.lastIndexOf(" ")) + "(winner)";
		}

		String team2 = teams[0].trim();
		if (!team2.contains("*")) {
			team2 = team2.substring(0,team2.lastIndexOf(" "));
		} else {
			team2 = team2.replace("*", "").trim();
			String[] splitString = team2.split(" ");
			winningTeamScore = splitString[splitString.length - 1];
			team2 = team2.substring(0,team2.lastIndexOf(" ")) + "(winner)";
		}
		
		return new WinningTeam(team1, team2, winningTeamScore, roundRotation);
	}

}
