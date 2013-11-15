import java.io.Serializable;

public class Location implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1455718539615193608L;

	private String city;
	
	private String state;
	
	private String country;
	
	public Location() {
		//TODO implement
	}
	
	public Location(String city, String state, String country) {
		//TODO implement
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}