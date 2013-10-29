public class Date {
	
	private String month;
	
	private String year;
	
	public Date() {
		setMonth("No Month Entered");
		setYear("No Year Entered");
	}
	
	public Date(String month, String year) {
		setMonth(month);
		setYear(year);
	}
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
}
