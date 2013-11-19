import java.io.Serializable;

public class Name implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1276149200536540635L;

	/**
	 * first name
	 */
	private String nameFirst;
	
	/**
	 * last name
	 */
	private String nameLast;
	
	/**
	 * @return full name
	 */
	public String getNameFull() {
		return getNameFirst() + " " + getNameLast();
	}

	public void setName(String nameWhole) {
		if(nameWhole.contains(" ") == true)
		{
			String[] split = nameWhole.split("\\ ");
			setNameFirst(split[0]);
			setNameLast(split[split.length-1]);
			
		}
		else
			setNameFirst(nameWhole);
	}
	
	/**
	 * @return first name
	 */
	public String getNameFirst() {
		return nameFirst;
	}

	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	/**
	 * @return last name
	 */
	public String getNameLast() {
		return nameLast;
	}

	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}
	
}
