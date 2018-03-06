import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainJframe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			private JPanel controlPanel;
			private GridLayout layout;
			private AbstractButton panel;
			private MainJframe mainFrame;

			public void run() {
				try {
					mainFrame = new MainJframe();

					controlPanel = new JPanel();
					controlPanel.setLayout(new FlowLayout());
					layout = new GridLayout(0, 3);
					layout.setHgap(10);
					layout.setVgap(10);

					JPanel panel = new JPanel();
					// panel.setBackground(Color.darkGray);
					// panel.setSize(300, 300);
					panel.setLayout(layout);

					JPanel jpanel1 = new JPanel();

					jpanel1.setBackground(Color.BLACK);
					panel.add(jpanel1);

					jpanel1.setBackground(Color.YELLOW);
					panel.add(jpanel1);

					jpanel1.setBackground(Color.BLUE);
					panel.add(jpanel1);

					jpanel1.setBackground(Color.GREEN);
					panel.add(jpanel1);

					jpanel1.setBackground(Color.ORANGE);
					panel.add(jpanel1);

					controlPanel.add(panel);

					mainFrame.add(controlPanel);

					mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void createJPanes() {
		// TODO Auto-generated method stub

	}

	/**
	 * Create the frame.
	 */
	public MainJframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
