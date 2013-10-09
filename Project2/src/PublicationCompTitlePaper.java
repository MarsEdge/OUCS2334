import java.util.Comparator;


public class PublicationCompTitlePaper implements Comparator<Publication> {

	@Override
	public int compare(Publication o1, Publication o2) {
		// TODO Auto-generated method stub
		int com = o1.getTitlePaper().compareTo(o2.getTitlePaper());

		return com;
	}

}
