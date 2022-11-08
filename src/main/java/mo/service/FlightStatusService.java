package mo.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import mo.models.AirTrafficEvent;

@Service
public class FlightStatusService {

	public List<AirTrafficEvent> getFlightStatuses() {
			return List.of(new AirTrafficEvent(UUID.randomUUID().toString(), "Emirates","Landed",new Date(),"777",true),
					new AirTrafficEvent(UUID.randomUUID().toString(), "Thai","Took Off",new Date(),"350",true),
					new AirTrafficEvent(UUID.randomUUID().toString(), "Qatar","Landed",new Date(),"787",true),
					new AirTrafficEvent(UUID.randomUUID().toString(), "ANA","Delayed",new Date(),"330",true));

	}
	
}
