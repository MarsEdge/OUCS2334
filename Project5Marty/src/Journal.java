import java.io.Serializable;
import java.util.ArrayList;

public class Journal extends Serial implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6134509644200622069L;

	/** publisher name */
	private Name pubName = new Name();
	
	/** publisher location */
	private Location pubLocation = new Location();
	
	/** list of volumes in Journal */
	private ArrayList<Volume> volumes = new ArrayList<Volume>();

	public Journal(String editor, String reviewer) {
		addVolume(new Volume(editor, reviewer));
	}
	
	@Override
	public String toString() {
		return volumes.get(0).getIssues().get(0).getEditors().get(0);
	}

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