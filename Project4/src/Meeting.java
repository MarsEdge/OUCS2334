import java.util.HashMap;

public class Meeting {
	
	/** meeting date */
	private Date date;
	
	/** meeting location */
	private Location location; 
	
	/** meeting committee chairs */
	private HashMap<String, Scholar> chairs;
	
	/** meeting committee members */
	private HashMap<String, Scholar> committeeMembers;
	
	/** meeting publications */
	private HashMap<String, Publication> publications;
	
	/**
	 * default constructor
	 */
	public Meeting() {
		//TODO implement
	}
	
	/**
	 * constructor with all fields
	 * 
	 * @param date meeting date
	 * @param location meeting location
	 * @param chairs meeting committee chairs
	 * @param committeeMembers meeting committee members
	 * @param publications meeting publications
	 */
	public Meeting(Date date, Location location, HashMap<String, Scholar> chairs, 
			HashMap<String, Scholar> committeeMembers, 
			HashMap<String, Publication> publications) {
		//TODO implement
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public HashMap<String, Scholar> getChairs() {
		return chairs;
	}

	public void setChairs(HashMap<String, Scholar> chairs) {
		this.chairs = chairs;
	}
	
	public void addChair(String key, Scholar value) {
		this.chairs.put(key, value);
	}
	
	public void removeChair(String key) {
		this.chairs.remove(key);
	}

	public HashMap<String, Scholar> getCommitteeMembers() {
		return committeeMembers;
	}

	public void setCommitteeMembers(HashMap<String, Scholar> committeeMembers) {
		this.committeeMembers = committeeMembers;
	}
	
	public void addCommitteeMembers(String key, Scholar value) {
		this.committeeMembers.put(key, value);
	}
	
	public void removeCommitteeMembers(String key) {
		this.committeeMembers.remove(key);
	}

	public HashMap<String, Publication> getPublications() {
		return publications;
	}

	public void setPublications(HashMap<String, Publication> publications) {
		this.publications = publications;
	}
	
	public void addPublication(String key, Publication value) {
		this.publications.put(key, value);
	}
	
	public void removePublication(String key) {
		this.publications.remove(key);
	}
	
}
