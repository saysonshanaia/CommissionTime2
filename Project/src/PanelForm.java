import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollBar;

public class PanelForm extends JPanel {
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public PanelForm() {
		setBackground(new Color(255, 228, 225));
		setBounds(0, 0, 760, 439);
		setLayout(null);
		
		JLabel lblDigitalArtCommission = new JLabel("Digital Art Commission Form\r\n");
		lblDigitalArtCommission.setForeground(new Color(205, 92, 92));
		lblDigitalArtCommission.setFont(new Font("Catline", Font.PLAIN, 25));
		lblDigitalArtCommission.setBounds(43, 23, 337, 39);
		add(lblDigitalArtCommission);
		
		JLabel lblInOrderTo = new JLabel("In order to provide you with an accurate costing for an original artwork, please ");
		lblInOrderTo.setForeground(Color.BLACK);
		lblInOrderTo.setFont(new Font("Objective", Font.PLAIN, 13));
		lblInOrderTo.setBounds(43, 43, 527, 39);
		add(lblInOrderTo);
		
		JLabel lblCompleteThisForm = new JLabel("complete this form with as much information as possible. Thank you! ❤");
		lblCompleteThisForm.setForeground(Color.BLACK);
		lblCompleteThisForm.setFont(new Font("Objective", Font.PLAIN, 13));
		lblCompleteThisForm.setBounds(43, 63, 527, 39);
		add(lblCompleteThisForm);
		
		textField1 = new JTextField();
		textField1.setBackground(new Color(245, 245, 245));
		textField1.setBounds(191, 113, 199, 20);
		add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBackground(new Color(245, 245, 245));
		textField2.setColumns(10);
		textField2.setBounds(400, 113, 199, 20);
		add(textField2);
		
		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setFont(new Font("Objective Medium", Font.PLAIN, 12));
		lblNewLabel.setBounds(43, 116, 108, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Objective", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(191, 136, 72, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setFont(new Font("Objective", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(400, 136, 72, 14);
		add(lblNewLabel_1_1);
		
		JLabel lblNameOfOrganization = new JLabel("Name of Organization ");
		lblNameOfOrganization.setFont(new Font("Objective Medium", Font.PLAIN, 12));
		lblNameOfOrganization.setBounds(43, 160, 179, 14);
		add(lblNameOfOrganization);
		
		JLabel lblNewLabel_1_2 = new JLabel("(if applicable)");
		lblNewLabel_1_2.setFont(new Font("Objective", Font.PLAIN, 11));
		lblNewLabel_1_2.setBounds(43, 174, 108, 14);
		add(lblNewLabel_1_2);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBackground(new Color(245, 245, 245));
		textField3.setBounds(191, 156, 281, 20);
		add(textField3);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Objective Medium", Font.PLAIN, 12));
		lblEmail.setBounds(43, 203, 179, 14);
		add(lblEmail);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBackground(new Color(245, 245, 245));
		textField4.setBounds(191, 199, 281, 20);
		add(textField4);
		
		JLabel lblContactNumber = new JLabel("Contact number");
		lblContactNumber.setFont(new Font("Objective Medium", Font.PLAIN, 12));
		lblContactNumber.setBounds(43, 241, 179, 14);
		add(lblContactNumber);
		
		textField5 = new JTextField();
		textField5.setColumns(10);
		textField5.setBackground(new Color(245, 245, 245));
		textField5.setBounds(191, 237, 199, 20);
		add(textField5);
		
		JLabel lblTypeOfArtwork = new JLabel("Type of artwork");
		lblTypeOfArtwork.setFont(new Font("Objective Medium", Font.PLAIN, 12));
		lblTypeOfArtwork.setBounds(43, 282, 179, 14);
		add(lblTypeOfArtwork);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(245, 245, 245));
		textField_1.setBounds(191, 278, 199, 20);
		add(textField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBackground(new Color(245, 245, 245));
		textField.setBounds(400, 278, 199, 20);
		add(textField);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Commission details");
		lblNewLabel_1_1_1.setFont(new Font("Objective", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(400, 301, 158, 14);
		add(lblNewLabel_1_1_1);
		
		JLabel lblAdditionalDetalsrefecrences = new JLabel("Additional detals/refecrences");
		lblAdditionalDetalsrefecrences.setFont(new Font("Objective Medium", Font.PLAIN, 12));
		lblAdditionalDetalsrefecrences.setBounds(43, 324, 199, 14);
		add(lblAdditionalDetalsrefecrences);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(245, 245, 245));
		textField_2.setBounds(239, 320, 360, 108);
		add(textField_2);


	}
}