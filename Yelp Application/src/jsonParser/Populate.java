package jsonParser;

import java.sql.SQLException;

public class Populate {

	public static void main(String[] args) throws SQLException {

		ReadYelpUserJSON a = new ReadYelpUserJSON();
		System.out.println("POPULATING USER NOW!!!");
		a.run_user();
		ReadBusinessJSON b = new ReadBusinessJSON();
		System.out.println("POPULATING BUSINESS NOW!!!");
		b.run_business();
		ReadCheckinJSON c = new ReadCheckinJSON();
		System.out.println("POPULATING CHECKIN NOW!!!");
		c.run_checkin();
		ReadReviewJSON d = new ReadReviewJSON();
		System.out.println("POPULATING REVIEW NOW!!!");
		d.run_review();

	}

}
