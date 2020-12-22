package businesslogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusinessLogic {
	public int placeOrder(int cycleId, int quantity) throws ClassNotFoundException, SQLException {
		// fetch data from db for checking if sufficient quantity of cycles are
		// available.
		// if available , then subtract the number from available.
		// calculate the cost and return cost.
		// if not available then return -1.
		Connection con = null;
		Statement pstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cycle", "root", "root");
			String str = "select *from avail where cycleid='" + cycleId + "'";
			pstmt = con.createStatement();
			ResultSet rs = pstmt.executeQuery(str);

			if (rs.next()) {
				int num1 = rs.getInt("num");
				int price = rs.getInt("price");
				// num1=num1-num2;
				if (num1 < quantity) {
					return -1;
				}
				int remaining = num1 - quantity;
				// update query on db to update the remaining quantity
				String updateStr = "update avail set num=" + remaining + " where cycleid='" + cycleId + "'";
				Statement updatepstmt = con.createStatement();
				updatepstmt.executeUpdate(updateStr);
				return quantity * price;
			} else {
				return -1;
			}
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
