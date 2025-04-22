package V3_promo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class v3_promo extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			v3_promo dialog = new v3_promo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public v3_promo() {
		setTitle("Promociones");
		setBounds(100, 100, 519, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Promociones");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 28));
			lblNewLabel.setBounds(168, 11, 175, 48);
			contentPanel.add(lblNewLabel);
		}
		{
			btnNewButton = new JButton("Combo 1");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(41, 76, 110, 23);
			contentPanel.add(btnNewButton);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("1/4 Pollo + papas + ensalada +");
			lblNewLabel_1.setBounds(21, 101, 167, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("gaseosa de 500ml");
			lblNewLabel_2.setBounds(51, 120, 100, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JButton btnNewButton_1 = new JButton("New button");
			btnNewButton_1.setBounds(207, 76, 100, 23);
			contentPanel.add(btnNewButton_1);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	}
}
