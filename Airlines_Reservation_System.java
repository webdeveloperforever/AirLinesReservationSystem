import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Airlines_Reservation_System {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Airlines_Reservation_System window = new Airlines_Reservation_System();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Airlines_Reservation_System() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Airline_Reservation_System");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel.setBounds(128, 31, 268, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnPassenger = new JRadioButton("Passenger");
		rdbtnPassenger.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdbtnPassenger.setBounds(128, 82, 103, 21);
		frame.getContentPane().add(rdbtnPassenger);
		rdbtnPassenger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passenger1.main(new String[]{});
				frame.dispose();
 
			}
		});
		
		JRadioButton rdbtnReservation = new JRadioButton("Reservation");
		rdbtnReservation.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdbtnReservation.setBounds(128, 140, 103, 21);
		frame.getContentPane().add(rdbtnReservation);
		rdbtnReservation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reservation4.main(new String[]{});
				frame.dispose();
 
			}
		});
		
		JRadioButton rdbtnFlight = new JRadioButton("Flight");
		rdbtnFlight.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdbtnFlight.setBounds(128, 206, 103, 21);
		frame.getContentPane().add(rdbtnFlight);
		rdbtnFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flight.main(new String[]{});
				frame.dispose();
 
			}
		});
	}
}
