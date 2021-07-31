import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSplitPane;

public class passenger_details {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passenger_details window = new passenger_details();
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
	public passenger_details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("new passenger entry");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(rdbtnNewRadioButton, BorderLayout.WEST);
		
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("passenger details");
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		splitPane.setRightComponent(rdbtnNewRadioButton_1);
	}

}
