package MovieRS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class App {

	JFrame frame;
	private JTextField userID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 718, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMovieRecommendationSystem = new JLabel("Movie Recommendation System");
		lblMovieRecommendationSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovieRecommendationSystem.setFont(new Font("Dialog", Font.PLAIN, 47));
		lblMovieRecommendationSystem.setBounds(12, 12, 678, 191);
		frame.getContentPane().add(lblMovieRecommendationSystem);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setIcon(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//new a userrating!
							
				frame.dispose();
				Recommender2 recom = new Recommender2();
				recom.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 22));
		btnNewButton.setBounds(453, 232, 155, 54);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("About Us");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AboutUs group = new AboutUs();
				group.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 22));
		btnNewButton_1.setBounds(453, 319, 155, 55);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblUserId.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserId.setBounds(37, 232, 124, 54);
		frame.getContentPane().add(lblUserId);
		
		userID = new JTextField();
		userID.setBounds(160, 236, 147, 54);
		frame.getContentPane().add(userID);
		userID.setColumns(10);
	}

	public String getUserId(){
		return userID.getText();
	}
}
