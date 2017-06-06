import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Hasta extends JFrame {

	private String [] cinsiyet={"erkek"};
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblHastaSoyad;
	private JTextField textField_3;
	private JLabel lblCinsiyet;
	private JComboBox comboBox;
	private JLabel lblNewLabel_2;
	private JTextField textField_4;
	private JLabel lblNewLabel_3;
	private JTextField textField_5;
	private JButton btnKaydet;
	private JLabel lblHastaKaytFormu;
	private JButton btnTemizle;
	private JLabel lblSakncalIlalar;
	private JTextField textField_6;
	private JLabel lblHastalk;
	private JTextField textField_7;
	private JLabel lblAlerjenOlduuDurumlar;
	private JTextField textField_8;
	private JLabel lblTahliller;
	private JTextField textField_9;
	private JButton btnHastaTablosunuGster;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hasta frame = new Hasta();
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
	public Hasta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		
		btnHastaTablosunuGster = new JButton("Hasta Tablosunu Göster");
		btnHastaTablosunuGster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnHastaTablosunuGster.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
				
				ArrayList<hastam> hastamListe=new ArrayList<hastam>();
				
			
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		contentPane.add(btnHastaTablosunuGster, "2, 2");
		
		lblHastaKaytFormu = new JLabel("HASTA KAYIT FORMU");
		contentPane.add(lblHastaKaytFormu, "4, 2, center, default");
		
		JLabel lblNewLabel = new JLabel("Hasta Prtokol Numarası:");
		contentPane.add(lblNewLabel, "2, 4, center, default");
		
		textField = new JTextField();
		contentPane.add(textField, "4, 4, fill, default");
		textField.setColumns(10);
		
		JLabel lblHastaTcNo = new JLabel("Hasta TC No:");
		contentPane.add(lblHastaTcNo, "2, 8, center, default");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		contentPane.add(textField_1, "4, 8, fill, default");
		
		JLabel lblNewLabel_1 = new JLabel("Hasta Adı:");
		contentPane.add(lblNewLabel_1, "2, 12, center, default");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		contentPane.add(textField_2, "4, 12, fill, default");
		
		lblHastaSoyad = new JLabel("Hasta Soyadı:");
		contentPane.add(lblHastaSoyad, "2, 16, center, default");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "4, 16, fill, default");
		textField_3.setColumns(10);
		
		lblCinsiyet = new JLabel("Cinsiyet:");
		contentPane.add(lblCinsiyet, "2, 20, center, default");
		
		comboBox = new JComboBox();
		
		contentPane.add(comboBox, "4, 20, fill, default");
		
		lblNewLabel_2 = new JLabel("Telefon:");
		contentPane.add(lblNewLabel_2, "2, 22, center, default");
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "4, 22, fill, default");
		textField_4.setColumns(10);
		
		lblTahliller = new JLabel("Tahliller:");
		contentPane.add(lblTahliller, "2, 24, center, default");
		
		textField_9 = new JTextField();
		contentPane.add(textField_9, "4, 24, 1, 3, fill, default");
		textField_9.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Adres:");
		contentPane.add(lblNewLabel_3, "2, 28, center, default");
		
		textField_5 = new JTextField();
		contentPane.add(textField_5, "4, 28, 1, 3, fill, default");
		textField_5.setColumns(10);
		
		lblSakncalIlalar = new JLabel("Sakıncalı ilaçlar");
		contentPane.add(lblSakncalIlalar, "2, 32, center, default");
		
		textField_6 = new JTextField();
		contentPane.add(textField_6, "4, 32, fill, default");
		textField_6.setColumns(10);
		
		lblAlerjenOlduuDurumlar = new JLabel("Alerjen Olduğu Durumlar");
		contentPane.add(lblAlerjenOlduuDurumlar, "2, 34, right, default");
		
		textField_8 = new JTextField();
		contentPane.add(textField_8, "4, 34, fill, default");
		textField_8.setColumns(10);
		
		lblHastalk = new JLabel("Hastalık");
		contentPane.add(lblHastalk, "2, 36, center, default");
		
		textField_7 = new JTextField();
		contentPane.add(textField_7, "4, 36, fill, default");
		textField_7.setColumns(10);
		
		btnTemizle = new JButton("Temizle");
		btnTemizle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnTemizle.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				textField.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				textField_5.setText(" ");
				textField_6.setText(" ");
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		contentPane.add(btnTemizle, "2, 38");
		
		btnKaydet = new JButton("Kaydet:");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnKaydet.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				/*try{
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/tibbi","root","root");
					Statement myState= conn.createStatement();
					ResultSet mResult= myState.executeQuery("insert into hastalar(hasta_adi) values (hasta_adi) ");
					while(mResult.next()){
						System.out.println(mResult.getString("hasta_id")+","+mResult.getString("hasta_adi")+","+mResult.getString("hasta_tel"));
						
					}
				}catch(Exception e1){
					e1.printStackTrace();
				}*/
				try{
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/tibbi","root","root");
					Statement myState= conn.createStatement();
					ResultSet mResult= myState.executeQuery("insert into hastalar(hasta_id,hasta_ad");
					while(mResult.next()){
						
						//System.out.println(mResult.getString("hasta_id")+","+mResult.getString("hasta_adi")+","+mResult.getString("hasta_tel"));
						
					}
				}catch(Exception e1){
					e1.printStackTrace();
				}
				
				
				JOptionPane.showOptionDialog(null, "Hasta Veri tabanına Kaydedildi.",
						null, JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
						null, null, null);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		contentPane.add(btnKaydet, "4, 38");
	}

}
