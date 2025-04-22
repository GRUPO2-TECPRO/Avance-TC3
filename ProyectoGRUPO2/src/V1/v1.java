package V1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import V2.v2;
import V3_promo.v3_promo;
import V4_guarni.v4_guarni;
import V5_bebidas.v5_bebidas;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class v1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenu mnNewMenu_2;
	private JLabel lblNewLabel;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v1 frame = new v1();
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
	public v1() {
		setTitle("Polleria-Pepito");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		{
			menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			{
				mnNewMenu = new JMenu("Carta");
				menuBar.add(mnNewMenu);
				{
					mntmNewMenuItem = new JMenuItem("Pollo a la Brasa");
					mntmNewMenuItem.addActionListener(this);
					mnNewMenu.add(mntmNewMenuItem);
				}
				{
					mntmNewMenuItem_1 = new JMenuItem("Bebidas");
					mntmNewMenuItem_1.addActionListener(this);
					mnNewMenu.add(mntmNewMenuItem_1);
				}
			}
			{
				mnNewMenu_1 = new JMenu("Extras");
				menuBar.add(mnNewMenu_1);
				{
					mntmNewMenuItem_3 = new JMenuItem("Promociones");
					mntmNewMenuItem_3.addActionListener(this);
					mnNewMenu_1.add(mntmNewMenuItem_3);
				}
				{
					mntmNewMenuItem_2 = new JMenuItem("Guarniciones");
					mntmNewMenuItem_2.addActionListener(this);
					mnNewMenu_1.add(mntmNewMenuItem_2);
				}
			}
			{
				{
					mnNewMenu_2 = new JMenu("Ubícanos");
					menuBar.add(mnNewMenu_2);
					{
						lblNewLabel = new JLabel("Tlf.: (01)716-6332 ");
						mnNewMenu_2.add(lblNewLabel);
					}
				}
			}
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmNewMenuItem_1) {
			do_mntmNewMenuItem_1_actionPerformed(e);
		}
		if (e.getSource() == mntmNewMenuItem_2) {
			do_mntmNewMenuItem_2_actionPerformed(e);
		}
		if (e.getSource() == mntmNewMenuItem_3) {
			do_mntmNewMenuItem_3_actionPerformed(e);
		}
		if (e.getSource() == mntmNewMenuItem) {
			do_mntmNewMenuItem_actionPerformed(e);
		}
	}
	protected void do_mntmNewMenuItem_actionPerformed(ActionEvent e) {
		
	  v2 car = new v2();
	  car.setVisible(true);	 
	}
	protected void do_mntmNewMenuItem_3_actionPerformed(ActionEvent e) {
		v3_promo pro = new v3_promo();
		pro.setVisible(true);
	}
	protected void do_mntmNewMenuItem_2_actionPerformed(ActionEvent e) {
		v4_guarni gua = new v4_guarni();
		gua.setVisible(true);
	}
	protected void do_mntmNewMenuItem_1_actionPerformed(ActionEvent e) {
		v5_bebidas bebi = new v5_bebidas();
		bebi.setVisible(true);
	}
}
