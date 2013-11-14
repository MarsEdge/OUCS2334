import java.util.ArrayList;
import java.util.HashMap;

public class Meeting {
	
	/** meeting date */
	private Date date;
	
	/** meeting location */
	private Location location; 
	
	/** meeting committee chairs */
	private ArrayList<String> chairs = new ArrayList<String>();
	
	/** meeting committee members */
	private ArrayList<String> committeeMembers = new ArrayList<String>();
	
	/** meeting publications */
	private ArrayList<String> publications = new ArrayList<String>();
	
	/**
	 * default constructor
	 */
	public Meeting(String chairs, String members) {
		addChair(chairs);
		addCommitteeMembers(members);
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
	public Meeting(Date date, Location location, ArrayList<Scholar> chairs, ArrayList<Scholar> committeeMembers) {
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

	public ArrayList<String> getChairs() {
		return chairs;
	}

	public void setChairs(ArrayList<String> chairs) {
		this.chairs = chairs;
	}
	
	public void addChair(String key) {
		this.chairs.add(key);
	}
	
	public void removeChair(String key) {
		this.chairs.remove(key);
	}

	public ArrayList<String> getCommitteeMembers() {
		return committeeMembers;
	}

	public void setCommitteeMembers(ArrayList<String> committeeMembers) {
		this.committeeMembers = committeeMembers;
	}
	
	public void addCommitteeMembers(String key) {
		this.committeeMembers.add(key);
	}
	
	public void removeCommitteeMembers(String key) {
		this.committeeMembers.remove(key);
	}

	public ArrayList<String> getPublications() {
		return publications;
	}

	public void setPublications(ArrayList<String> publications) {
		this.publications = publications;
	}
	
	public void addPublication(String key) {
		this.publications.add(key);
	}
	
	public void removePublication(String key) {
		this.publications.remove(key);
	}
	
}
