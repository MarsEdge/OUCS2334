public class Name {
	private String firstName;
	
	private String lastName;
	
	/**
	 * TODO implement for extra credit
	 * @param prop
	 * @return
	 */
	public boolean isValid(String prop) {
		return true;
	}

	public String getFirstName() {
		if(isValid(firstName))
			return firstName;
		return "Invalid First Name";
	}

	public void setFirstName(String firstName) {
		if(isValid(firstName))
			this.firstName = firstName;
		else
			this.firstName = "Invalid First Name";;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
