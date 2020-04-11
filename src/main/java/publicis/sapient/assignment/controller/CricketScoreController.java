package publicis.sapient.assignment.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import publicis.sapient.assignment.model.WinningTeam;
import publicis.sapient.assignment.service.ICricketScoreService;

@RestController
@RequestMapping("/api/v1")
public class CricketScoreController {
	
	@Autowired 
	private ICricketScoreService cricketScoreService;
	
	@GetMapping(value = "/cricketScore", produces = "application/json")
	public WinningTeam greeting(@RequestParam(value = "uniqueId") String uniqueId) {
		return cricketScoreService.getTotalScoreWinningTeam(uniqueId);
	}
}