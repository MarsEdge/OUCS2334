import java.util.ArrayList;

public class Journal extends Serial {
	
	/** publisher name */
	private Name pubName;
	
	/** publisher location */
	private Location pubLocation;
	
	/** list of volumes in Journal */
	private ArrayList<Volume> volumes;

	public Name getPubName() {
		return pubName;
	}

	public void setPubName(Name pubName) {
		this.pubName = pubName;
	}

	public Location getPubLocation() {
		return pubLocation;
	}

	public void setPubLocation(Location pubLocation) {
		this.pubLocation = pubLocation;
	}

	public ArrayList<Volume> getVolumes() {
		return volumes;
	}

	public void setVolumes(ArrayList<Volume> volumes) {
		this.volumes = volumes;
	}
	
	public void addVolume(Volume volume) {
		this.volumes.add(volume);
	}
	
	public void removeResearchArea(Volume volume) {
		this.volumes.remove(volume);
	}
	
}