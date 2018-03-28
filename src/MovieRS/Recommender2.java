package MovieRS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.CardLayout;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;

public class Recommender2 extends JFrame {
	// 1628 movies in total!
	private MovieIdTitle movieIDtitle = new MovieIdTitle();
	
	private UserRating userrating2;
	 private String userid;

	//The recommendation lists
	private JList rankingList1; 



	//all the panels
	private JPanel contentPane;		
	private JPanel moviePanel;
	private JPanel firstMovie;
	private JPanel secondMovie;
	private JPanel ListPanel;
	private JTextField rating1;
	private JTextField rating2;
	private JTextField rating3;
	private JTextField rating4;
	//all the ratings

	private JLabel image1;
	private JLabel image2;
	private JLabel image3;
	private JLabel image4;


	private int movieID1  ;
	private int movieID2;
	private int movieID3;
	private int movieID4;
	private int movieID5  ;
	private int movieID6;
	private int movieID7;
	private int movieID8;
	private JLabel lblPleaseRateThe;
	private JLabel movie5;
	private JLabel movie6;
	private JLabel movie7;
	private JLabel movie8;
	private JLabel image5;
	private JLabel image6;
	private JLabel image7;
	private JLabel image8;
	private JTextField rating5;
	private JTextField rating6;
	private JTextField rating7;
	private JTextField rating8;
	private JLabel lblRecommendationForYou;


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
					Recommender2 frame = new Recommender2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Recommender2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 956, 591);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		moviePanel = new JPanel();
		contentPane.add(moviePanel, "name_353341056946930");
		moviePanel.setLayout(null);
		moviePanel.setVisible(true);

		//Generate the random movieID

		RandomRange randomGenerator = new RandomRange();
		movieID1 = randomGenerator.showRandomInteger(1, 1628);
		movieID2 = randomGenerator.showRandomInteger(1, 1628);
		movieID3 = randomGenerator.showRandomInteger(1, 1628);
		movieID4 = randomGenerator.showRandomInteger(1, 1628);
		String s1 = movieIDtitle.getTitle(movieID1);
		String s2 = movieIDtitle.getTitle(movieID2);
		String s3 = movieIDtitle.getTitle(movieID3);
		String s4 = movieIDtitle.getTitle(movieID4);
		movieID5 = randomGenerator.showRandomInteger(1, 1628);
		movieID6 = randomGenerator.showRandomInteger(1, 1628);
		movieID7 = randomGenerator.showRandomInteger(1, 1628);
		movieID8 = randomGenerator.showRandomInteger(1, 1628);
		String s5 = movieIDtitle.getTitle(movieID5);
		String s6 = movieIDtitle.getTitle(movieID6);
		String s7 = movieIDtitle.getTitle(movieID7);
		String s8 = movieIDtitle.getTitle(movieID8);
		
		BufferedImage resizeImg1 = new BufferedImage(190, 250, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g1 = resizeImg1.createGraphics();
		g1.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g1.drawImage(new ImageIcon(this.getClass().getResource("/img1.jpg")).getImage(), 0, 0, 190, 250, null);
		g1.dispose();
		
		BufferedImage resizedImg2 = new BufferedImage(190, 250, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = resizedImg2.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(new ImageIcon(this.getClass().getResource("/img2.jpg")).getImage(), 0, 0, 190, 250, null);
		g2.dispose();
		
		BufferedImage resizeImg3 = new BufferedImage(190, 250, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g3 = resizeImg3.createGraphics();
		g3.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g3.drawImage(new ImageIcon(this.getClass().getResource("/img3.jpg")).getImage(), 0, 0, 190, 250, null);
		g3.dispose();

		BufferedImage resizeImg4 = new BufferedImage(190, 250, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g4 = resizeImg4.createGraphics();
		g4.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g4.drawImage(new ImageIcon(this.getClass().getResource("/img4.jpg")).getImage(), 0, 0, 190, 250, null);
		g4.dispose();

		BufferedImage resizeImg5 = new BufferedImage(190, 250, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g5 = resizeImg5.createGraphics();
		g5.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g5.drawImage(new ImageIcon(this.getClass().getResource("/img5.jpg")).getImage(), 0, 0, 190, 250, null);
		g5.dispose();

		BufferedImage resizeImg6 = new BufferedImage(190, 250, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g6 = resizeImg6.createGraphics();

		g6.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g6.drawImage(new ImageIcon(this.getClass().getResource("/img6.jpg")).getImage(), 0, 0, 190, 250, null);
		g6.dispose();

		BufferedImage resizeImg7 = new BufferedImage(190, 250, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g7 = resizeImg7.createGraphics();

		g7.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g7.drawImage(new ImageIcon(this.getClass().getResource("/img7.jpg")).getImage(), 0, 0, 190, 250, null);
		g7.dispose();

		BufferedImage resizeImg8 = new BufferedImage(190, 250, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g8 = resizeImg8.createGraphics();

		g8.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g8.drawImage(new ImageIcon(this.getClass().getResource("/img8.jpg")).getImage(), 0, 0, 190, 250, null);
		g8.dispose();



		JButton btnNewButton = new JButton("More Movies");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstMovie.setVisible(false);
				secondMovie.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton.setBounds(171, 472, 184, 55);
		moviePanel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Recommend");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moviePanel.setVisible(false);
				ListPanel.setVisible(true);
				
				App app = new App();

		        userid = app.getUserId();     
		        userrating2 = new UserRating();
		        userrating2.addUser(userid);
		 
				//get the userrating from the App2 class and add the userratings.
		        userrating2.addUserIDRating(userid,movieID8,Double.parseDouble(rating8.getText()));
		        userrating2.addUserIDRating(userid,movieID7,Double.parseDouble(rating7.getText()));
		        userrating2.addUserIDRating(userid,movieID6,Double.parseDouble(rating6.getText()));
		        userrating2.addUserIDRating(userid,movieID5,Double.parseDouble(rating5.getText()));
		        userrating2.addUserIDRating(userid,movieID4,Double.parseDouble(rating4.getText()));
		        userrating2.addUserIDRating(userid,movieID3,Double.parseDouble(rating3.getText()));
		        userrating2.addUserIDRating(userid,movieID2,Double.parseDouble(rating2.getText()));
		        userrating2.addUserIDRating(userid,movieID1,Double.parseDouble(rating1.getText()));
		        RankingList1();
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_1.setBounds(565, 472, 216, 55);
		moviePanel.add(btnNewButton_1);

		lblPleaseRateThe = new JLabel("Please rate the fowing movies, click more movies to get more");
		lblPleaseRateThe.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblPleaseRateThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseRateThe.setBounds(0, 0, 921, 76);
		moviePanel.add(lblPleaseRateThe);

		secondMovie = new JPanel();
		secondMovie.setBounds(0, 78, 921, 393);
		moviePanel.add(secondMovie);
		secondMovie.setLayout(null);

		movie5 = new JLabel("New label");
		movie5.setFont(new Font("Dialog", Font.PLAIN, 18));
		movie5.setBounds(12, 0, 202, 76);
		secondMovie.add(movie5);
		movie5.setText("<HTML>" + s5 + "</HTML>");


		movie6 = new JLabel("New label");
		movie6.setFont(new Font("Dialog", Font.PLAIN, 18));
		movie6.setBounds(226, 0, 194, 76);
		secondMovie.add(movie6);
		movie6.setText("<HTML>" + s6 + "</HTML>");


		movie7 = new JLabel("New label");
		movie7.setFont(new Font("Dialog", Font.PLAIN, 18));
		movie7.setBounds(442, 0, 209, 76);
		secondMovie.add(movie7);
		movie7.setText("<HTML>" + s7 + "</HTML>");


		movie8 = new JLabel("New label");
		movie8.setFont(new Font("Dialog", Font.PLAIN, 18));
		movie8.setBounds(676, 0, 209, 76);
		secondMovie.add(movie8);
		movie8.setText("<HTML>" + s8 + "</HTML>");


		image5 = new JLabel("New label");
		image5.setIcon(new ImageIcon(resizeImg5));

		image5.setBounds(12, 80, 194, 249);
		secondMovie.add(image5);

		image6 = new JLabel("New label");
		image6.setIcon(new ImageIcon(resizeImg6));

		image6.setBounds(226, 81, 194, 248);
		secondMovie.add(image6);

		image7 = new JLabel("New label");	
		image7.setIcon(new ImageIcon(resizeImg7));
		image7.setBounds(442, 86, 209, 236);
		secondMovie.add(image7);

		image8 = new JLabel("New label");
		image8.setIcon(new ImageIcon(resizeImg8));
		image8.setBounds(676, 76, 209, 257);
		secondMovie.add(image8);

		rating5 = new JTextField();
		rating5.setBounds(54, 346, 89, 35);
		secondMovie.add(rating5);
		rating5.setColumns(10);

		rating6 = new JTextField();
		rating6.setBounds(276, 346, 101, 35);
		secondMovie.add(rating6);
		rating6.setColumns(10);

		rating7 = new JTextField();
		rating7.setBounds(513, 346, 89, 35);
		secondMovie.add(rating7);
		rating7.setColumns(10);

		rating8 = new JTextField();
		rating8.setBounds(754, 345, 89, 36);
		secondMovie.add(rating8);
		rating8.setColumns(10);


		firstMovie = new JPanel();
		firstMovie.setBounds(0, 78, 921, 393);
		moviePanel.add(firstMovie);
		firstMovie.setLayout(null);
		firstMovie.setVisible(true);

		rating1 = new JTextField();
		rating1.setBounds(38, 350, 88, 31);
		firstMovie.add(rating1);
		rating1.setColumns(10);

		rating2 = new JTextField();
		rating2.setBounds(269, 350, 96, 31);
		firstMovie.add(rating2);
		rating2.setColumns(10);

		rating3 = new JTextField();
		rating3.setBounds(525, 351, 88, 29);
		firstMovie.add(rating3);
		rating3.setColumns(10);

		rating4 = new JTextField();
		rating4.setBounds(761, 351, 88, 29);
		firstMovie.add(rating4);
		rating4.setColumns(10);

		JLabel movie1 = new JLabel("New label");
		movie1.setFont(new Font("Dialog", Font.PLAIN, 18));
		movie1.setHorizontalAlignment(SwingConstants.CENTER);
		movie1.setBounds(10, 0, 190, 75);
		firstMovie.add(movie1);
		movie1.setText("<HTML>" + s1 + "</HTML>");


		JLabel movie2 = new JLabel("New label");
		movie2.setFont(new Font("Dialog", Font.PLAIN, 18));
		movie2.setHorizontalAlignment(SwingConstants.CENTER);
		movie2.setBounds(237, 0, 198, 75);
		firstMovie.add(movie2);
		movie2.setText("<HTML>" + s2 + "</HTML>");


		JLabel movie3 = new JLabel("New label");
		movie3.setFont(new Font("Dialog", Font.PLAIN, 18));
		movie3.setHorizontalAlignment(SwingConstants.CENTER);
		movie3.setBounds(473, 0, 198, 75);
		firstMovie.add(movie3);
		movie3.setText("<HTML>" + s3 + "</HTML>");


		JLabel movie4 = new JLabel("New label");
		movie4.setFont(new Font("Dialog", Font.PLAIN, 18));
		movie4.setHorizontalAlignment(SwingConstants.CENTER);
		movie4.setBounds(691, -1, 202, 76);
		firstMovie.add(movie4);
		movie4.setText("<HTML>" + s4 + "</HTML>");


		image1 = new JLabel();
		image1.setIcon(new ImageIcon(resizeImg1));

		image1.setHorizontalAlignment(SwingConstants.TRAILING);
		image1.setBounds(10, 87, 190, 261);
		firstMovie.add(image1);



		image2 = new JLabel();
		image2.setIcon(new ImageIcon(resizedImg2));
		image2.setBounds(473, 87, 190, 256);
		firstMovie.add(image2);

		image3 = new JLabel();
		image3.setIcon(new ImageIcon(resizeImg3));
		image3.setBounds(237, 87, 198, 256);
		firstMovie.add(image3);

		image4 = new JLabel();
		image4.setIcon(new ImageIcon(resizeImg4));
		image4.setBounds(691, 89, 202, 250);
		firstMovie.add(image4);
		secondMovie.setVisible(false);

		ListPanel = new JPanel();
		contentPane.add(ListPanel, "name_353371340875879");
		ListPanel.setLayout(null);

		lblRecommendationForYou = new JLabel("Recommendation for you");
		lblRecommendationForYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecommendationForYou.setFont(new Font("Cambria Math", Font.PLAIN, 45));
		lblRecommendationForYou.setBounds(12, 12, 550, 95);
		ListPanel.add(lblRecommendationForYou);

		rankingList1 = new JList();
		rankingList1.setFont(new Font("Dialog", Font.PLAIN, 20));
		rankingList1.setBounds(12, 194, 487, 306);
		ListPanel.add(rankingList1);
	
		JLabel List1 = new JLabel("Content based");
		List1.setHorizontalAlignment(SwingConstants.CENTER);
		List1.setFont(new Font("Dialog", Font.PLAIN, 25));
		List1.setBounds(12, 113, 426, 69);
		ListPanel.add(List1);
		
		JButton Exit = new JButton("Exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(JFrame.EXIT_ON_CLOSE);
			}
		});
		Exit.setFont(new Font("Dialog", Font.PLAIN, 25));
		Exit.setBounds(695, 385, 133, 47);
		ListPanel.add(Exit);
		ListPanel.setVisible(false);
      
		
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void RankingList1(){
		DefaultListModel dlm = new DefaultListModel();
		CRank contentBR = new CRank(this.userrating2);
		ArrayList<String> movie = contentBR.getContentRank().get(this.userid);
		for(String movietitle: movie ){
			dlm.addElement(movietitle);
		}
		rankingList1.setModel(dlm);
	}


}
