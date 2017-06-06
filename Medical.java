import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Medical extends JFrame {

	private JPanel contentPane;
	private BufferedImage myPicture=null;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		

		
		//------------------------------------
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medical frame = new Medical();
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
	public Medical() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		final Hasta hasta=new Hasta();
		final doktor doktor=new doktor();
		final Eczane eczane=new Eczane();
	
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		arkaplan();
		
		JMenu mnNewMenu = new JMenu("Hasta İşlemleri");
		mnNewMenu.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			
				hasta.setVisible(true);
				try{
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/tibbi","root","root");
					Statement myState= conn.createStatement();
					ResultSet mResult= myState.executeQuery("select * from hastalar");
					while(mResult.next()){
						System.out.println(mResult.getString("hasta_id")+","+mResult.getString("hasta_adi")+","+mResult.getString("hasta_tel"));
						
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
		menuBar.add(mnNewMenu);
		
		JMenu mnDoktorIlemleri = new JMenu("Doktor İşlemleri");
		mnDoktorIlemleri.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				doktor.setVisible(true);
				
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
		menuBar.add(mnDoktorIlemleri);
		
		JMenu mnEczaneIlemleri = new JMenu("Eczane İşlemleri");
		mnEczaneIlemleri.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			eczane.setVisible(true);
				
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
		menuBar.add(mnEczaneIlemleri);
		
		JMenu mnHakknda = new JMenu("Hakkında");
		
		menuBar.add(mnHakknda);
		
		JMenu mnk = new JMenu("Çıkış");
		mnk.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
				
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
		
		try {
			myPicture = ImageIO.read(new File("/Users/kemal/Desktop/kepler/Medical/src/resim.jpeg"));
		} catch (IOException e1) {
			
			System.out.println("noFileImage"+e1);
		}
		
		
		menuBar.add(mnk);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		//contentPane.setLayout(null);
		
		getContentPane().setLayout(new BorderLayout());
		
		JButton btnBalan = new JButton("Bağlan");
		btnBalan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnBalan.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
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
		contentPane.add(btnBalan, BorderLayout.SOUTH);
		//final JLabel back=new JLabel(myPicture);
		//getContentPane().add(back);
		//back.setLayout(new FlowLayout());
		
		
		
	}
	
	public void arkaplan(){
		JPanel panel=new JPanel();
		ImageIcon arkaplan=new ImageIcon("resim.jpg");
		JLabel orta=new JLabel(arkaplan);
		add(orta,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
	}
}
