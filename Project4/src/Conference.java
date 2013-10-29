import java.util.ArrayList;

public class Conference {
	
	private Name sponsor;
	
	private ArrayList<Meeting> meetings;

	public Name getSponsor() {
		return sponsor;
	}

	public void setSponsor(Name sponsor) {
		this.sponsor = sponsor;
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
