package V4_guarni;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class v4_guarni extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			v4_guarni dialog = new v4_guarni();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public v4_guarni() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Guardiciones");
			lblNewLabel.setBounds(162, 22, 126, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JButton btnNewButton = new JButton("Arroz Chaufa");
			btnNewButton.setBounds(47, 71, 115, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("Ensalada ");
			btnNewButton_1.setBounds(47, 145, 115, 23);
			contentPanel.add(btnNewButton_1);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Porción de ensalada");
			lblNewLabel_1.setBounds(57, 170, 116, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Porción de Chaufa");
			lblNewLabel_1.setBounds(57, 96, 116, 14);
			contentPanel.add(lblNewLabel_1);
		}
	}

}
