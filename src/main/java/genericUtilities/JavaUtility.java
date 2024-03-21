package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtility {
	public Date getDate() {

	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy hh:mm:ss");
	String formatDate=sdf.format(date);
	return date;

}
}
