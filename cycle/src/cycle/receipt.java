package cycle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import businesslogic.BusinessLogic;


public class receipt extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JLabel lab;
	static JButton btnNewButton;
	 receipt(Integer st,Integer id,Integer num2) throws ClassNotFoundException, SQLException
	   {
		 BusinessLogic bl = new BusinessLogic();
			int cost = bl.placeOrder(id, num2);
			String msg = "";
			if (cost == -1) {
				msg = "Sorry!quantity unavailable!.";
			} else {
				msg = "Your Bill is : "+cost;
			}
			
		     getContentPane().setLayout(null);
		     setDefaultCloseOperation(javax.swing. WindowConstants.DISPOSE_ON_CLOSE);
		     setTitle("Welcome");
		      lab=new JLabel(msg);
		     lab.setBounds(10,10,500,20);
		     getContentPane().add(lab);
		      
	      btnNewButton = new JButton("Okay");
	     btnNewButton.setBounds(75, 98, 117, 25);
	     getContentPane().add(btnNewButton);
	     setSize(311, 163);
	     btnNewButton.addActionListener(this);
	      }
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnNewButton)
		{
			
			
			
		}
		
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		
		
	}

	

}
