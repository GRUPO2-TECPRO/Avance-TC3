package V2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class v2 extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblNewLabel;
	private JButton btn1;
	private JButton btn2;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			v2 dialog = new v2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public v2() {
		setTitle("Menú");
		setBounds(100, 100, 604, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			lblNewLabel = new JLabel("MENÚ-POLLO A LA BRASA");
			lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 29));
			lblNewLabel.setBounds(118, 11, 382, 58);
			contentPanel.add(lblNewLabel);
		}
		{
			btn1 = new JButton("1/4 pollo clásico");
			btn1.addActionListener(this);
			btn1.setBounds(31, 80, 130, 23);
			contentPanel.add(btn1);
		}
		{
			btn2 = new JButton("1/2 pollo ");
			btn2.setBounds(234, 80, 89, 23);
			contentPanel.add(btn2);
		}
		{
			btnNewButton = new JButton("Pollo entero");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(400, 80, 89, 23);
			contentPanel.add(btnNewButton);
		}
		{
			lblNewLabel_1 = new JLabel("1/4 pollo + papas fritas\r\n");
			lblNewLabel_1.setBounds(43, 103, 224, 14);
			contentPanel.add(lblNewLabel_1);
		}	
		{
			lblNewLabel_2 = new JLabel(" + ensalada");
			lblNewLabel_2.setBounds(42, 114, 81, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("1/2 pollo + papas fritas ");
			lblNewLabel_3.setBounds(234, 103, 145, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel(" + ensalada");
			lblNewLabel_4.setBounds(234, 114, 89, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(31, 159, 499, 79);
			contentPanel.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
				
			lblNewLabel_5 = new JLabel("1 Pollo + papas fritas ");
			lblNewLabel_5.setBounds(392, 103, 138, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			lblNewLabel_6 = new JLabel(" + ensalada");
			lblNewLabel_6.setBounds(389, 114, 89, 14);
			contentPanel.add(lblNewLabel_6);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btn1) {
			do_btn1_actionPerformed(e);
		}
	}
	protected void do_btn1_actionPerformed(ActionEvent e) {
		
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	}
}
