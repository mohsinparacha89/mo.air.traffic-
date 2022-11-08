package mo.models;

import java.util.Date;

public class AirTrafficEvent {

	private String id;
	
	private String airline;
	
	private String event;
	
	private Date date;
	
	private String aircraftType;
	
	private boolean isInternational;
	
	

	public AirTrafficEvent(String id, String airline, String event, Date date, String aircraftType,
			boolean isInternational) {
		super();
		this.id = id;
		this.airline = airline;
		this.event = event;
		this.date = date;
		this.aircraftType = aircraftType;
		this.isInternational = isInternational;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public boolean isInternational() {
		return isInternational;
	}

	public void setInternational(boolean isInternational) {
		this.isInternational = isInternational;
	}

	
	
}
