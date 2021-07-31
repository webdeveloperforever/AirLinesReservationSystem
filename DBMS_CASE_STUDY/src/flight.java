	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.sql.Connection;
	import java.sql.PreparedStatement;

	import javax.swing.JButton;
	
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;

	public class flight {
		
		public static void main(String[] args) 
		{
			JFrame f=new JFrame("Airlines_Reservation_System");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setBounds(500,100,700,400);
			JLabel L=new JLabel("flight details:");
			L.setBounds(300, 50, 200, 30);
			JLabel L1=new JLabel("f_name:");
			L1.setBounds(50, 70, 100, 50);
		    JLabel L2=new JLabel("f_no:");
		    L2.setBounds(50, 110, 100, 50);
		    JLabel L3=new JLabel("source:");
			L3.setBounds(50, 160, 100, 50);
		    JLabel L4=new JLabel("destination:");
		    L4.setBounds(50, 200, 100, 50);
		   
		    JTextField T1=new JTextField("");
		    T1.setBounds(150, 80, 100, 30);
		    JTextField T2=new JTextField("");
		    T2.setBounds(150,120,100,30);
		    JTextField T3=new JTextField("");
		    T3.setBounds(150, 170, 100, 30);
		    JTextField T4=new JTextField("");
		    T4.setBounds(150, 210,100,30);
		    JButton B=new JButton("SUBMIT");
	        B.setBounds(300, 300, 100, 50);
	        f.add(B);
		    f.add(T1);
		    f.add(T2);
		    f.add(T3);
		    f.add(T4);
		    f.add(L);
		    f.add(L1);
			f.add(L2);
			f.add(L3);
			f.add(L4);
			f.setSize(700,500);
			f.setLayout(null);
			f.setVisible(true);
			
	        B.addActionListener(new ActionListener() {
				 public void actionPerformed(ActionEvent e)
			        {
							DB_Connection obj_DB_Connection=new DB_Connection();
							Connection connection=obj_DB_Connection.get_connection();
							PreparedStatement ps=null;
							try {
								 String l=T1.getText();
							       String i=T2.getText();
							      String j =T3.getText();
							     String k=T4.getText();
								String query="INSERT INTO flight VALUES(?,?,?,?)";
							    ps=connection.prepareStatement(query);
							    ps.setString(1,l);
							    ps.setString(2,i);
							    ps.setString(3,j);
							    ps.setString(4,k);
							    ps.execute();
							    JOptionPane.showMessageDialog(null,"Data Successfully entered");
							    flight Data=new flight();
							     Data.setVisible(true);
							      
							     // connection.close();
							   
							   } catch (Exception e1) {
							    System.out.println(e1);
							}
					 f.dispose();
			        }
				 });
		   
		}

		protected void setVisible(boolean b) {
			// TODO Auto-generated method stub
			
		}
	}