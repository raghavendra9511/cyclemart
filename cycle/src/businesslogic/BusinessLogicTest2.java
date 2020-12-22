package businesslogic;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BusinessLogicTest2 {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Connection con = null;
        Statement pstmt = null;
		try
		{Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cycle","root","root");
		String str="REPLACE INTO avail (price, cycleid, num) VALUES (4,2,11)";
		pstmt=con.createStatement();
		pstmt.execute(str);
		}
		catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		setUpBeforeClass();
	}

	@Test
	public void testPlaceOrderValidInputs() throws ClassNotFoundException, SQLException {
		//fail("Not yet implemented");
		BusinessLogic b = new BusinessLogic();
		int result = b.placeOrder(2, 11);
		assertEquals(44,result);
	}
	
	@Test
	public void testPlaceOrderInvalidInputs() throws ClassNotFoundException, SQLException {
		//fail("Not yet implemented");
		BusinessLogic b = new BusinessLogic();
		int result = b.placeOrder(2, 12);
		assertEquals(-1,result);
	}

}