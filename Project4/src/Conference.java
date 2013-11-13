import java.util.ArrayList;

public class Conference extends Serial {
	
	/** Conference sponsor */
	private Name sponsor = new Name();
	
	/** list of all meetings at conference */
	private ArrayList<Meeting> meetings = new ArrayList<Meeting>();

	public Conference(String chairs, String members) {
		addMeeting(new Meeting(chairs, members));
	}
	
	@Override
	public String toString() {
		return meetings.get(0).getChairs().get(0) + "'s Conference";
	}

	public Name getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor.setName(sponsor);
	}

	public ArrayList<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(ArrayList<Meeting> meetings) {
		this.meetings = meetings;
	}
	
	public void addMeeting(Meeting meeting) {
		this.meetings.add(meeting);
	}
	
	public void removeMeeting(Meeting meeting) {
		this.meetings.remove(meeting);
	}
}