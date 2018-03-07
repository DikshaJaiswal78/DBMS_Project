import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class MainJframe extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			private MainJframe mainFrame;
			private JPanel businessPanel;
			private JPanel categoryPanel;
			private JPanel subCategoryPanel;
			private JPanel checkinPanel;
			private JPanel reviewPanel;
			private JPanel resultPanel;
			private JPanel usersPanel;
			private JPanel queryPanel;
			private JButton executeQueryButton;
			private JLabel fromLabel;
			private JLabel toLabel;
			private JLabel valueLabel;
			private JLabel businessLabel;
			private JLabel categoryLabel;
			private JLabel subCategoryLabel;
			private JLabel checkinLabel;
			private JLabel reviewLabel;
			private JLabel resultLabel;
			private JLabel usersLabel;
			private JLabel numOfCheckinsLabel;
			private JLabel starLabel;
			private JLabel votesLabel;
			private JLabel memberSinceLabel;
			private JLabel reviewCountLabel;
			private JLabel numOfFriendsLabel;
			private JLabel avgStarsLabel;
			private JLabel selectLabel;
			private JComboBox fromDayCheckinComboBox;
			private JComboBox toDayCheckinComboBox;
			private JComboBox equalityCheckinComboBox;
			private JComboBox equalityStarReviewComboBox;
			private JComboBox equalityVotesReviewComboBox;
			private JComboBox equalityReviewCountUsersComboBox;
			private JComboBox equalityNumOfFrndsUsersComboBox;
			private JComboBox equalityAvgStarsUsersComboBox;
			private JComboBox andOrUsersComboBox;

			private String[] days = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
					"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
			private String[] equalitySigns = { "=", "<", ">" };
			private String[] andOr = { "AND", "OR" };
			private JTextField hourFromCheckinTextField;
			private JTextField hourToCheckinTextField;
			private JTextField valueCheckinTextField;
			private JTextField valueStarReviewTextField;
			private JTextField valueVotesReviewTextField;
			private JDatePanelImpl fromReviewDatePanel;
			private JDatePickerImpl fromReviewDatePicker;
			private JDatePanelImpl toReviewDatePanel;
			private JDatePickerImpl toReviewDatePicker;
			private JDatePanelImpl memberSinceUsersDatePanel;
			private JDatePickerImpl memberSinceUsersDatePicker;

			public void run() {
				try {
					initializeComponents();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			private void initializeComponents() {
				// TODO Auto-generated method stub

				mainFrame = new MainJframe();

				// panels
				businessPanel = new JPanel();
				categoryPanel = new JPanel(new GridLayout(0, 1));
				subCategoryPanel = new JPanel(new GridLayout(0, 1));
				checkinPanel = new JPanel();
				reviewPanel = new JPanel();
				resultPanel = new JPanel();
				usersPanel = new JPanel();
				queryPanel = new JPanel();

				// buttons
				executeQueryButton = new JButton("Execute Query");

				// labels
				// common labels
				fromLabel = new JLabel("from");
				toLabel = new JLabel("to");
				valueLabel = new JLabel("value");
				// panel title labels
				businessLabel = new JLabel("Business");
				categoryLabel = new JLabel("Category");
				subCategoryLabel = new JLabel("Sub-Category");
				checkinLabel = new JLabel("Checkin");
				reviewLabel = new JLabel("Review");
				resultLabel = new JLabel("Result");
				usersLabel = new JLabel("Users");
				// check-in labels
				numOfCheckinsLabel = new JLabel("Num. of Checkins:");
				// review labels
				starLabel = new JLabel("star:");
				votesLabel = new JLabel("votes:");
				// users labels
				memberSinceLabel = new JLabel("Member since:");
				reviewCountLabel = new JLabel("Review Count:");
				numOfFriendsLabel = new JLabel("Num. of Friends:");
				avgStarsLabel = new JLabel("Avg. Stars:");
				selectLabel = new JLabel("Select:");

				// combo boxes
				fromDayCheckinComboBox = new JComboBox<>(days);
				toDayCheckinComboBox = new JComboBox<>(days);
				equalityCheckinComboBox = new JComboBox<>(equalitySigns);
				equalityStarReviewComboBox = new JComboBox<>(equalitySigns);
				equalityVotesReviewComboBox = new JComboBox<>(equalitySigns);
				equalityReviewCountUsersComboBox = new JComboBox<>(equalitySigns);
				equalityNumOfFrndsUsersComboBox = new JComboBox<>(equalitySigns);
				equalityAvgStarsUsersComboBox = new JComboBox<>(equalitySigns);
				andOrUsersComboBox = new JComboBox<>(andOr);

				// text fields
				hourFromCheckinTextField = new JTextField("hour");
				hourToCheckinTextField = new JTextField("hour");
				valueCheckinTextField = new JTextField();
				valueStarReviewTextField = new JTextField();
				valueVotesReviewTextField = new JTextField();

				// date picker
				UtilDateModel model = new UtilDateModel();
				// model.setDate(20,04,2014);
				// Need this...
				Properties p = new Properties();
				p.put("text.today", "Today");
				p.put("text.month", "Month");
				p.put("text.year", "Year");

				JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
				// Don't know about the formatter, but there it is...
				// JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new
				// DateLabelFormatter());

				fromReviewDatePanel = new JDatePanelImpl(model, p);
				fromReviewDatePicker = new JDatePickerImpl(fromReviewDatePanel, null);
				toReviewDatePanel = new JDatePanelImpl(model, p);
				toReviewDatePicker = new JDatePickerImpl(toReviewDatePanel, null);
				memberSinceUsersDatePanel = new JDatePanelImpl(model, p);
				memberSinceUsersDatePicker = new JDatePickerImpl(memberSinceUsersDatePanel, null);

				// add all panels to frame
				mainFrame.add(businessPanel);
				// mainFrame.add(usersPanel);
				// mainFrame.add(queryPanel);
				// mainFrame.add(executeQueryButton);
				// mainFrame.add(resultPanel);

				// add all panels/components to business panel
				businessPanel.add(businessLabel);
				businessPanel.add(categoryPanel);
				businessPanel.add(subCategoryPanel);
				businessPanel.add(checkinPanel);
				businessPanel.add(reviewPanel);
				// add all components to category panel
				categoryPanel.add(categoryLabel);
				populateCategory();
				// add all components to sub-category panel
				subCategoryPanel.add(subCategoryLabel);
				populateSubCategory();
				// add all components to check-in panel
				subCategoryPanel.add(checkinLabel);
				// add all components to review panel
				subCategoryPanel.add(reviewLabel);

				// add all components to users panel
				usersPanel.add(usersLabel);

				// add all components to query panel
				// queryPanel.add();

				// add all components to result panel
				resultPanel.add(resultLabel);

				// make main frame visible
				mainFrame.setVisible(true);
			}

			private void populateCategory() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 9; i++) {
					JCheckBox categoryCheckBox = new JCheckBox("Category" + (i + 1));
					categoryPanel.add(categoryCheckBox);
				}
			}

			private void populateSubCategory() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 9; i++) {
					JCheckBox subCategoryCheckBox = new JCheckBox("Sub-Category" + (i + 1));
					subCategoryPanel.add(subCategoryCheckBox);
				}
			}

		});
	}

	private JPanel mainPanel;

	/**
	 * Create the frame.
	 */
	public MainJframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(mainPanel);
	}

}
