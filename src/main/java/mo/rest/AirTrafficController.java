package mo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mo.models.AirTrafficEvent;
import mo.service.FlightStatusService;

@CrossOrigin(origins = "http://127.0.0.1:8082", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/v1")
public class AirTrafficController {

	@Autowired
	private FlightStatusService flightStatusService;
	
	@GetMapping(path = "/flight-statuses")
	public ResponseEntity<List<AirTrafficEvent>> getFlightStatuses()
	{
		return ResponseEntity.ok(flightStatusService.getFlightStatuses());
	}
	
//	@GetMapping(path = "/getPosts/{customerId}")
//	public ResponseEntity<List<AirTrafficEvent>> getPosts(@PathVariable Long customerId)
//	{
//		//return ResponseEntity.ok(postService.getFlightStatuses(customerId));
//		
//		return null;
//	}
	
}