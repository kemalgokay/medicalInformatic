import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class doktor extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doktor frame = new doktor();
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
	public doktor() {
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
				FormFactory.DEFAULT_ROWSPEC,}));
		
		JLabel lblDoktorKaytFormu = new JLabel("DOKTOR KAYIT FORMU");
		contentPane.add(lblDoktorKaytFormu, "4, 2, center, default");
		
		JLabel lblDoktorProtokolNumaras = new JLabel("Doktor Protokol Numarası");
		contentPane.add(lblDoktorProtokolNumaras, "2, 4, right, default");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "4, 4, fill, default");
		textField_1.setColumns(10);
		
		JLabel lblDoktorAd = new JLabel("Doktor Adı");
		contentPane.add(lblDoktorAd, "2, 6, right, default");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "4, 6, fill, default");
		textField_2.setColumns(10);
		
		JLabel lblDoktorSoyad = new JLabel("Doktor Soyadı");
		contentPane.add(lblDoktorSoyad, "2, 8, right, default");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "4, 8, fill, default");
		textField_3.setColumns(10);
		
		JLabel lblUzmanlk = new JLabel("Uzmanlık");
		contentPane.add(lblUzmanlk, "2, 10, right, default");
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "4, 10, fill, default");
		textField_4.setColumns(10);
		
		JLabel lblHastane = new JLabel("Hastane");
		contentPane.add(lblHastane, "2, 12, right, default");
		
		textField_5 = new JTextField();
		contentPane.add(textField_5, "4, 12, fill, default");
		textField_5.setColumns(10);
		
		JLabel lblBolum = new JLabel("Bolum");
		contentPane.add(lblBolum, "2, 14, right, default");
		
		textField_6 = new JTextField();
		contentPane.add(textField_6, "4, 14, fill, default");
		textField_6.setColumns(10);
		
		JLabel lblHastaTc = new JLabel("Hasta Tc");
		contentPane.add(lblHastaTc, "2, 16, right, default");
		
		textField_7 = new JTextField();
		contentPane.add(textField_7, "4, 16, fill, default");
		textField_7.setColumns(10);
		
		JLabel lblHastannSalkDurumu = new JLabel("Hastanın Sağlık Durumu");
		contentPane.add(lblHastannSalkDurumu, "2, 18, right, default");
		
		textField_11 = new JTextField();
		contentPane.add(textField_11, "4, 18, fill, default");
		textField_11.setColumns(10);
		
		JLabel lblIlalar = new JLabel("İlaçlar");
		contentPane.add(lblIlalar, "2, 20, right, default");
		
		textField_8 = new JTextField();
		contentPane.add(textField_8, "4, 20, fill, default");
		textField_8.setColumns(10);
		
		JLabel lblYasaklananIlalar = new JLabel("Yasaklanan İlaçlar");
		contentPane.add(lblYasaklananIlalar, "2, 22, right, default");
		
		textField_9 = new JTextField();
		contentPane.add(textField_9, "4, 22, fill, default");
		textField_9.setColumns(10);
		
		JLabel lblIlaKullanm = new JLabel("İlaç Kullanım");
		contentPane.add(lblIlaKullanm, "2, 24, right, default");
		
		textField_10 = new JTextField();
		contentPane.add(textField_10, "4, 24, 1, 3, fill, default");
		textField_10.setColumns(10);
		
		JLabel lblAlerjenOlduuDurumlar = new JLabel("Alerjen Olduğu Durumlar");
		contentPane.add(lblAlerjenOlduuDurumlar, "2, 28, right, default");
		
		textField_12 = new JTextField();
		contentPane.add(textField_12, "4, 28, fill, default");
		textField_12.setColumns(10);
		
		JLabel lblTahliller = new JLabel("Tahliller");
		contentPane.add(lblTahliller, "2, 32, right, default");
		
		textField = new JTextField();
		contentPane.add(textField, "4, 32, 1, 4, fill, default");
		textField.setColumns(10);
		
		JButton btnTemizle = new JButton("Yeni Hasta");
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
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				textField_5.setText(" ");
				textField_6.setText(" ");
				textField_7.setText(" ");
				textField_11.setText(" ");
				
				
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
		
		JButton btnKaydet = new JButton("Kaydet");
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
				
				try{
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/tibbi","root","root");
					Statement myState= conn.createStatement();
					ResultSet mResult= myState.executeQuery("select * from hastalar");
					while(mResult.next()){
						
						//System.out.println(mResult.getString("hasta_id")+","+mResult.getString("hasta_adi")+","+mResult.getString("hasta_tel"));
						System.out.println(mResult.getString("hasta_id")+","+mResult.getString("hasta_adi")+","+mResult.getString("hasta_tel")+","+mResult.getString("hasta_soyad"));
						//System.out.println(mResult.getString("hasta_id")+","+mResult.getString("hasta_adi")+","+mResult.getString("hasta_tel")+","+mResult.getString("hasta_soyad")+","+mResult.getString("hasta_protokol_no")+","+mResult.getString("hasta_cinsiyet")+","+mResult.getString("hasta_dogum_tarihi")+","+mResult.getString("hasta_medeni_hal"));
					}
				}catch(Exception e1){
					e1.printStackTrace();
				}
				
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
		
		btnKaydet.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showOptionDialog(null, "Doktor Veri tabanına Kaydedildi.",
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
