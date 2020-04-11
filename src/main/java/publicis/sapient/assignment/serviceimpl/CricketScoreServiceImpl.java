/**
 * 
 */
package publicis.sapient.assignment.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;

import publicis.sapient.assignment.mapper.ResponseMapper;
import publicis.sapient.assignment.model.WinningTeam;
import publicis.sapient.assignment.service.ICricketScoreService;

@Service
public class CricketScoreServiceImpl implements ICricketScoreService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ResponseMapper responseMapper;
	
	@Value("${apiKey}")
	private String apiKey;

	public WinningTeam getTotalScoreWinningTeam(String uniqueId) {
		String url = "http://cricapi.com/api/cricketScore?unique_id=" + uniqueId + "&apikey=" + apiKey;
		JsonNode obj = restTemplate.getForObject(url, JsonNode.class);
		
		return responseMapper.convertToWinningTeam(obj);
	}

}
