public class Magazine {
	/**
	 * name of magazine 
	 */
	private String name;
	
	/**
	 * name of magazine publisher
	 */
	private String publisher;
	
	/**
	 * # of magazine issues per year
	 */
	private String issues_annual;
	
	/**
	 * year magazine was first made
	 */
	private String year_init;
	
	/**
	 * year magazine was last made
	 */
	private String year_final;
	
	/**
	 * constructs a new magazine with all properties
	 */
	Magazine(String name, String publisher, String issues_annual, String year_init, String year_final){
		setName(name); 
		setPublisher(publisher);
		setIssuesAnnual(issues_annual);
		setYearInit(year_init);
		setYearFinal(year_final);
	}
	
	public String toString() {
		String out="";
		
		out+="Name = " + getName();
		
		out+=", Publisher = " + getPublisher();
		
		out+=", Issues Annually = " + getIssuesAnnual();
		
		out+=", First Year = " + getYearInit();
		
		out+= ", Final Year = " + getYearFinal();
		
		return out;
	}
	
	/**
	 * checks if entered property is valid
	 * 
	 * @return true if valid, false if not
	 */
	public boolean isValidProp(String prop) {
		if(prop != null && prop.length() > 0)
			return true;
		else
			return false;
	}
	
	/**
	 * @return magazine name
	 */
	public String getName() {
		if(isValidProp(name))
			return name;
		else
			return "Invalid Name";
	}
	
	/**
	 * sets magazine name
	 * 
	 * @param name name to apply
	 * @return true if successful, false if not
	 */
	public boolean setName( String name ) {
		if(isValidProp(name)) {
			this.name=name;
			return true;
		}
		else {
			this.name="Invalid Name";
			return false;
		}
	}
	
	/**
	 * @return publisher name
	 */
	public String getPublisher() {
		if(isValidProp(publisher))
			return publisher;
		else
			return "Invalid Publisher";
	}
	
	/**
	 * sets publisher name
	 * 
	 * @param publisher publisher name
	 * @return true if successful, false if not
	 */
	public boolean setPublisher( String publisher ) {
		if(isValidProp(publisher)) {
			this.publisher=publisher;
			return true;
		}
		else {
			this.publisher="Invalid Publisher";
			return false;
		}
	}
	
	public String getIssuesAnnual() {
		if(isValidProp(issues_annual))
			return issues_annual;
		else
			return "Invalid Annual Issues";
	}
	
	/**
	 * sets # of annual issues
	 * 
	 * @param issues_annual number to apply
	 * @return true if successful, false if not
	 */
	public boolean setIssuesAnnual( String issues_annual ) {
		if(isValidProp(issues_annual)) {
			this.issues_annual=issues_annual;
			return true;
		}
		else {
			this.issues_annual="Invalid Annual Issues";
			return false;
		}
	}
	
	/**
	 * @return year magazine was first made
	 */
	public String getYearInit() {
		if( isValidProp(year_init) )
			return year_init;
		else
			return "Invalid Initial Year";
	}
	
	/**
	 * sets magazine initial year
	 * 
	 * @param year_init the year to apply
	 * @return true if successful, false if not
	 */
	public boolean setYearInit( String year_init ) {
		if(isValidProp(year_init)) {
			this.year_init=year_init;
			return true;
		}
		else {
			this.year_init="Invalid Initial Year";
			return false;
		}
	}

	/**
	 * @return year magazine was last made
	 */
	public String getYearFinal() {
		if( isValidProp(year_final) )
			return year_final;
		else
			return "Invalid Final Year";
	}
	
	/**
	 * sets magazine final year
	 * 
	 * @param year_final year to apply
	 * @return true if successful, false if not
	 */
	public boolean setYearFinal( String year_final ) {
		if(isValidProp(year_final)) {
			this.year_final=year_final;
			return true;
		}
		else {
			this.year_final="Invalid Final Year";
			return false;
		}
	}
}