package MovieRS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Window;

import javax.swing.JTabbedPane;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

public class AboutUs extends JFrame {


	
	private JPanel contentPane;
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
					AboutUs frame = new AboutUs();
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
	public AboutUs() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel designteam = new JLabel("Desigh Team");
		designteam.setFont(new Font("Tahoma", Font.PLAIN, 30));
		designteam.setHorizontalAlignment(SwingConstants.CENTER);
		designteam.setBounds(30, 12, 243, 63);
		contentPane.add(designteam);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setFont(new Font("Bradley Hand ITC", Font.BOLD, 16));
		tabbedPane.setBounds(10, 87, 657, 445);
		contentPane.add(tabbedPane);
		
		
		JPanel xinpan = new JPanel();
		tabbedPane.addTab("Xin Pan", null, xinpan, null);
		xinpan.setLayout(null);
		
		BufferedImage resizePX = new BufferedImage(261, 355, BufferedImage.TYPE_INT_ARGB);
		Graphics2D gPX = resizePX.createGraphics();
		gPX.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		gPX.drawImage(new ImageIcon(this.getClass().getResource("/panxin.jpg")).getImage(), 0, 0, 261, 355, null);
		gPX.dispose();
		
		JLabel pxPic = new JLabel("New label");
		pxPic.setBounds(38, 12, 261, 355);
		xinpan.add(pxPic);
		pxPic.setIcon(new ImageIcon(resizePX));
			
		JLabel pxText = new JLabel("<html>Name: Xin Pan<br>WorkLoad: Front-End part<br>public class of members<br>"
				+ "Facebook: www.facebook.com/xin.pan.75457<br>LinkedIn: www.linkedin.com/in/xin-pan-149183111</html>");
		pxText.setFont(new Font("Dialog", Font.PLAIN, 20));
		pxText.setHorizontalAlignment(SwingConstants.CENTER);
		pxText.setBounds(320, 12, 335, 349);
		xinpan.add(pxText);
		
		JPanel xiaopeng = new JPanel();
		tabbedPane.addTab("Xiaopeng Ji", null, xiaopeng, null);
		xiaopeng.setLayout(null);
		
		BufferedImage resizeJi = new BufferedImage(261, 355, BufferedImage.TYPE_INT_ARGB);
		Graphics2D gJi = resizeJi.createGraphics();
		gJi.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		gJi.drawImage(new ImageIcon(this.getClass().getResource("/xiaopeng.jpg")).getImage(), 0, 0, 261, 355, null);
		gJi.dispose();
		
		JLabel jiPic = new JLabel("New label");
		jiPic.setBounds(38, 12, 261, 355);
		xiaopeng.add(jiPic);
		jiPic.setIcon(new ImageIcon(resizeJi));
		
		JLabel jiText = new JLabel("<html>Name: Xiaopeng Ji<br>WorkLoad: Back-End part<br>implement content-based algorithm<br>"
				+ "Facebook: www.facebook.com/tim.ji.507<br>LinkedIn: www.linkedin.com/in/xiaopeng-ji-7847</html>");
		jiText.setFont(new Font("Dialog", Font.PLAIN, 20));
		jiText.setHorizontalAlignment(SwingConstants.CENTER);
		jiText.setBounds(320, 12, 335, 349);
		xiaopeng.add(jiText);
		
		
		
		JButton Back = new JButton("Back");
		Back.setFont(new Font("Tahoma", Font.BOLD, 22));
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				App window = new App();
				window.frame.setVisible(true);
				
			}
		});
		Back.setBounds(415, 24, 175, 51);
		contentPane.add(Back);
	}
}
