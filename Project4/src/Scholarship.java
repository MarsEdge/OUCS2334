import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;


public class Scholarship implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6640981900226594101L;
	
	private ArrayList<Scholar> scholarList = new ArrayList<Scholar>();
	private HashMap<String, Serial> serialMap;
	private HashMap<String, Publication> pubMap;
	
	public Scholarship(){
	}
	
	public ArrayList<Scholar> getScholarList() {
		return new ArrayList<Scholar>(scholarList);
	}
	
	public HashMap<String, Serial> getSerialMap() {
		return new HashMap<String, Serial>(serialMap);
	}
	
	public HashMap<String, Publication> getPubMap() {
		return new HashMap<String, Publication>(pubMap);
	}

	public void addScholarship(Scholarship scholarship) {
		// TODO Auto-generated method stub
		
	}

	public void addScholar(Scholar scholar) {
		// TODO Auto-generated method stub
		
	}
	
	public void deleteSelectedScholar(Scholar scholar) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllScholars(Scholar scholar) {
		// TODO Auto-generated method stub
		
	}

	public void addSerial(Serial serial) {
		// TODO Auto-generated method stub
		
	}

	public void deleteSelectedSerial(Serial serial) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllSerials(Serial serial) {
		// TODO Auto-generated method stub
		
	}

	public void addPaper(Publication pub) {
		// TODO Auto-generated method stub
		
	}

	public void deleteSelectedPaper(Publication pub) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllPapers(Publication pub) {
		// TODO Auto-generated method stub
		
	}





	
	
	
}
