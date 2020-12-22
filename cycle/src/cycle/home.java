package cycle;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.Image;
import java.awt.event.ActionEvent;
//import java.awt.image;
public class home extends JFrame implements ActionListener {
	static JButton btnNewButton,Button, btnNewButton_1, btnNewButton_2, btnNewButton_3,btnNewButton_5;
	static JFrame f;
	
	 static JSpinner spinner,spinner_1,spinner_2,spinner_3;
	public home()
	{
        JFrame f=new JFrame();
		
		//f.getContentPane().setLayout(null);
		
		JLabel lblCycle = new JLabel("CYCLE");
		lblCycle.setBounds(197, 22, 70, 15);
		f.getContentPane().add(lblCycle);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/cycle1.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		
		lblNewLabel.setBounds(34, 82, 113, 94);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/cycle2.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(297, 71, 103, 120);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/cycle3.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(34, 348, 103, 82);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/cycle4.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img));
		lblNewLabel_3.setBounds(304, 348, 111, 82);
		f.getContentPane().add(lblNewLabel_3);

		  f.setSize(500,600);
		  f.getContentPane().setLayout(null);
		  
		  JTextPane txtpnRacingCycle = new JTextPane();
		  txtpnRacingCycle.setText("Racing Cycle\n8 Rs/hr");
		  txtpnRacingCycle.setBounds(32, 188, 121, 30);
		  f.getContentPane().add(txtpnRacingCycle);
		  
		  JTextPane txtpnFoldingBicycle = new JTextPane();
		  txtpnFoldingBicycle.setText("Folding  Bicycle\n4 Rs/hr");
		  txtpnFoldingBicycle.setBounds(297, 203, 131, 39);
		  f.getContentPane().add(txtpnFoldingBicycle);
		  
		  JTextPane txtpnRoadBicycle = new JTextPane();
		  txtpnRoadBicycle.setText("Road Bicycle\n5 Rs/hr");
		  txtpnRoadBicycle.setBounds(44, 442, 109, 30);
		  f.getContentPane().add(txtpnRoadBicycle);
		  
		  JTextPane txtpnCyclocrossBicycle = new JTextPane();
		  txtpnCyclocrossBicycle.setText("Cyclo-cross Bicycle\n6 Rs/hr");
		  txtpnCyclocrossBicycle.setBounds(314, 442, 131, 30);
		  f.getContentPane().add(txtpnCyclocrossBicycle);
		  
		   btnNewButton = new JButton("BOOK");
		 
		  btnNewButton.setBounds(34, 272, 117, 26);
		  f.getContentPane().add(btnNewButton);
		  btnNewButton.addActionListener(this);
		  
		   btnNewButton_1 = new JButton("BOOK");
		  
		  btnNewButton_1.setBounds(297, 272, 117, 30);
		  f.getContentPane().add(btnNewButton_1);
		  btnNewButton_1.addActionListener(this);
		  
		  btnNewButton_2 = new JButton("BOOK");
		  btnNewButton_2.setBounds(36, 503, 117, 30);
		  f.getContentPane().add(btnNewButton_2);
		  btnNewButton_2.addActionListener(this);
		  
		   btnNewButton_3 = new JButton("BOOK");
		  btnNewButton_3.setBounds(319, 506, 117, 25);
		  f.getContentPane().add(btnNewButton_3);
		  btnNewButton_3.addActionListener(this);
		  
		 
		  
		  spinner = new JSpinner();
		  spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		  spinner.setBounds(42, 230, 38, 30);
		  f.getContentPane().add(spinner);
		  
		  
		   spinner_1 = new JSpinner();
		  spinner_1.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		  spinner_1.setBounds(296, 254, 46, 22);
		  f.getContentPane().add(spinner_1);
		  
		   spinner_2 = new JSpinner();
		  spinner_2.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		  spinner_2.setBounds(34, 479, 39, 20);
		  f.getContentPane().add(spinner_2);
		 
		  spinner_3 = new JSpinner();
		  spinner_3.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		  spinner_3.setBounds(324, 484, 38, 20);
		  f.getContentPane().add(spinner_3);
		  
		 
		  
		 /* JButton btnNewButton_4 = new JButton("SUBMIT");
		  btnNewButton_4.setBounds(30, 310, 117, 25);
		  f.getContentPane().add(btnNewButton_4);
		  
		  JButton btnNewButton_5 = new JButton("SUBMIT");
		  btnNewButton_5.setBounds(311, 310, 117, 25);
		  f.getContentPane().add(btnNewButton_5);
		  
		  JButton btnNewButton_6 = new JButton("SUBMIT");
		  btnNewButton_6.setBounds(46, 535, 117, 25);
		  f.getContentPane().add(btnNewButton_6);
		  
		  JButton btnNewButton_7 = new JButton("SUBMIT");
		  btnNewButton_7.setBounds(329, 535, 117, 25);
		  f.getContentPane().add(btnNewButton_7);
		  
		 */
		  
		
		  f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Order placed");
		if(e.getSource() == btnNewButton)
		{
			int value = (Integer) spinner.getValue();
			
			receipt page;
			try {
				page = new receipt(value*8,1,value);
				   page.setVisible(true);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
         
			
			
		}
		else if(e.getSource() == btnNewButton_1)
		{
			int value = (Integer) spinner_1.getValue();
			
			receipt page;
			try {
				page = new receipt(value*4,2,value);
				 page.setVisible(true);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
           
			
			
		}
		else if(e.getSource() == btnNewButton_2)
		{
			int value = (Integer) spinner_2.getValue();
			
			receipt page;
			try {
				page = new receipt(value*5,3,value);
				 page.setVisible(true);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
           
			
			
		}
		else if(e.getSource() == btnNewButton_3)
		{
			int value = (Integer) spinner_3.getValue();
			
			receipt page;
			try {
				page = new receipt(value*6,4,value);
				  page.setVisible(true);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
          
			
			
		}
		else
		{
			
		}
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) throws SQLException {
		home obj = new home();
	   	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}