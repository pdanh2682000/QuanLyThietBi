package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.*;
import java.awt.event.ActionEvent;

public class SuaChuaView extends JFrame {

	private JPanel contentPane;
	private JTextField textGiaSC;
	private JTextField textNgaySC;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SuaChuaView frame = new SuaChuaView("");
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public SuaChuaView(String maScTb) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelGiaSC = new JLabel("Giá SC");
		labelGiaSC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelGiaSC.setBounds(22, 28, 64, 20);
		contentPane.add(labelGiaSC);

		JLabel labelNgaySC = new JLabel("Ngày SC (yyyy-mm-dd)");
		labelNgaySC.setFont(new Font("Tahoma", Font.PLAIN, 13));
<<<<<<< HEAD
		labelNgaySC.setBounds(10, 183, 154, 20);
=======
		labelNgaySC.setBounds(22, 81, 154, 20);
>>>>>>> 547a481de5eff5d7188db4a019beee4d1024834f
		contentPane.add(labelNgaySC);

		JLabel labelChitiet = new JLabel("Chi tiết");
		labelChitiet.setFont(new Font("Tahoma", Font.PLAIN, 13));
<<<<<<< HEAD
		labelChitiet.setBounds(22, 81, 64, 20);
=======
		labelChitiet.setBounds(22, 140, 64, 20);
>>>>>>> 547a481de5eff5d7188db4a019beee4d1024834f
		contentPane.add(labelChitiet);

		textGiaSC = new JTextField();
		textGiaSC.setColumns(10);
		textGiaSC.setBounds(82, 27, 145, 25);
		contentPane.add(textGiaSC);

		textNgaySC = new JTextField();
		textNgaySC.setColumns(10);
<<<<<<< HEAD
		textNgaySC.setBounds(174, 182, 145, 25);
=======
		textNgaySC.setBounds(186, 80, 145, 25);
>>>>>>> 547a481de5eff5d7188db4a019beee4d1024834f
		contentPane.add(textNgaySC);

		JTextArea areaChitiet = new JTextArea();
		areaChitiet.setLineWrap(true);
<<<<<<< HEAD
		areaChitiet.setBounds(82, 80, 296, 81);
		contentPane.add(areaChitiet);

		JButton btnOk = new JButton("OK");
		getRootPane().setDefaultButton(btnOk);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double giaSC = Double.parseDouble(textGiaSC.getText());
					Date ngaySC = Date.valueOf(textNgaySC.getText());
					String chitiet = areaChitiet.getText();

					String DB_URL = "jdbc:postgresql://192.168.1.10:5432/QLTB?LoggerLevel=OFF";
					String USER = "postgres";
					String PASS = "123";

=======
		areaChitiet.setBounds(82, 139, 296, 81);
		contentPane.add(areaChitiet);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double giaSC = Double.parseDouble(textGiaSC.getText());
				Date ngaySC = Date.valueOf(textNgaySC.getText());
				String chitiet = areaChitiet.getText();

				String DB_URL = "jdbc:postgresql://192.168.1.10:5432/QLTB?LoggerLevel=OFF";
				String USER = "postgres";
				String PASS = "123";
				try {
>>>>>>> 547a481de5eff5d7188db4a019beee4d1024834f
					Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					if (conn != null)
						System.out.println("connect success");
					String sql = "insert into public.suachua(matb,chitiet, giasc, ngaysc) values (?,?,?,?)";
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setString(1, maScTb);
					ps.setString(2, chitiet);
					ps.setDouble(3, giaSC);
					ps.setDate(4, ngaySC);
					int status = ps.executeUpdate();
					if (status > 0) {
<<<<<<< HEAD
						// System.out.println("Thêm sửa chữa thành công!");
						showMessage("Thêm sửa chữa thành công!");
						hideFrame();
					} else {
						// System.out.println("Thêm sửa chữa thất bại!");
=======
						//System.out.println("Thêm sửa chữa thành công!");
						showMessage("Thêm sửa chữa thành công!");
						hideFrame();
					} else {
						//System.out.println("Thêm sửa chữa thất bại!");
>>>>>>> 547a481de5eff5d7188db4a019beee4d1024834f
						showMessage("Thêm sửa chữa thất bại!");
					}

				} catch (Exception ex) {
<<<<<<< HEAD
					showMessage("Thêm sửa chữa thất bại!");
=======
>>>>>>> 547a481de5eff5d7188db4a019beee4d1024834f
					ex.printStackTrace();
				}
			}
		});
		btnOk.setBounds(183, 231, 89, 23);
		contentPane.add(btnOk);
	}

	public void hideFrame() {
		this.setVisible(false);
	}
<<<<<<< HEAD

=======
	
>>>>>>> 547a481de5eff5d7188db4a019beee4d1024834f
	public void showMessage(String str) {
		JOptionPane.showMessageDialog(this, str);
	}
}
