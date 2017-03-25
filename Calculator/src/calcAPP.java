import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calcAPP {

	private JFrame frmCalculatorapp;
	private JTextField textField;
	double sayi1;
	double sayi2;
	String sonuc;
	String islem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcAPP window = new calcAPP();
					window.frmCalculatorapp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calcAPP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatorapp = new JFrame();
		frmCalculatorapp.setTitle("CalculatorAPP");
		frmCalculatorapp.setBounds(100, 100, 250, 392);
		frmCalculatorapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculatorapp.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 10, 214, 30);
		frmCalculatorapp.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton buton7 = new JButton("7");
		buton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String x = textField.getText() + buton7.getText();
				textField.setText(x);
				
			}
		});
		buton7.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buton7.setBounds(10, 51, 50, 50);
		frmCalculatorapp.getContentPane().add(buton7);
		
		JButton buton8 = new JButton("8");
		buton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String x = textField.getText() + buton8.getText();
				textField.setText(x);
				
			}
		});
		buton8.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buton8.setBounds(65, 51, 50, 50);
		frmCalculatorapp.getContentPane().add(buton8);
		
		JButton buton9 = new JButton("9");
		buton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String x = textField.getText() + buton9.getText();
				textField.setText(x);
				
			}
		});
		buton9.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buton9.setBounds(120, 51, 50, 50);
		frmCalculatorapp.getContentPane().add(buton9);
		
		JButton butonbolu = new JButton("/");
		butonbolu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				islem = "/";
				sayi1=Double.parseDouble(textField.getText());
				textField.setText("");
				
			}
		});
		
		butonbolu.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		butonbolu.setBounds(175, 51, 50, 50);
		frmCalculatorapp.getContentPane().add(butonbolu);
		
		JButton buton4 = new JButton("4");
		buton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String x = textField.getText() + buton4.getText();
				textField.setText(x);
				
			}
		});
		buton4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buton4.setBounds(10, 112, 50, 50);
		frmCalculatorapp.getContentPane().add(buton4);
		
		JButton buton5 = new JButton("5");
		buton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String x = textField.getText() + buton5.getText();
				textField.setText(x);
				
			}
		});
		buton5.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buton5.setBounds(65, 112, 50, 50);
		frmCalculatorapp.getContentPane().add(buton5);
		
		JButton buton6 = new JButton("6");
		buton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String x = textField.getText() + buton6.getText();
				textField.setText(x);
				
			}
		});
		buton6.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buton6.setBounds(120, 112, 50, 50);
		frmCalculatorapp.getContentPane().add(buton6);
		
		JButton butonx = new JButton("x");
		butonx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				islem ="x";
				sayi1=Double.parseDouble(textField.getText());
				textField.setText("");
				
			}
		});
		butonx.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		butonx.setBounds(175, 112, 50, 50);
		frmCalculatorapp.getContentPane().add(butonx);
		
		JButton buton1 = new JButton("1");
		buton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String x = textField.getText() + buton1.getText();
				textField.setText(x);
				
			}
		});
		buton1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buton1.setBounds(10, 173, 50, 50);
		frmCalculatorapp.getContentPane().add(buton1);
		
		JButton buton2 = new JButton("2");
		buton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String x = textField.getText() + buton2.getText();
				textField.setText(x);
				
			}
		});
		buton2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buton2.setBounds(65, 173, 50, 50);
		frmCalculatorapp.getContentPane().add(buton2);
		
		JButton buton3 = new JButton("3");
		buton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String x = textField.getText() + buton3.getText();
				textField.setText(x);
				
			}
		});
		buton3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buton3.setBounds(120, 173, 50, 50);
		frmCalculatorapp.getContentPane().add(buton3);
		
		JButton butoneksi = new JButton("-");
		butoneksi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				islem = "-";
				sayi1=Double.parseDouble(textField.getText());
				textField.setText("");
				
			}
		});
		butoneksi.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		butoneksi.setBounds(175, 173, 50, 50);
		frmCalculatorapp.getContentPane().add(butoneksi);
		
		JButton buton0 = new JButton("0");
		buton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String x = textField.getText() + buton0.getText();
				textField.setText(x);
				
			}
		});
		buton0.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buton0.setBounds(9, 234, 106, 50);
		frmCalculatorapp.getContentPane().add(buton0);
		
		JButton butonnokta = new JButton(".");
		butonnokta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String x = textField.getText() + butonnokta.getText();
				textField.setText(x);
				
			}
		});
		butonnokta.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		butonnokta.setBounds(119, 234, 50, 50);
		frmCalculatorapp.getContentPane().add(butonnokta);
		
		JButton butonarti = new JButton("+");
		butonarti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				islem = "+";
				sayi1=Double.parseDouble(textField.getText());
				textField.setText("");
				
			}
		});
		butonarti.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		butonarti.setBounds(174, 234, 50, 50);
		frmCalculatorapp.getContentPane().add(butonarti);
		
		JButton butonesit = new JButton("=");
		
		
		butonesit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(islem=="x"){

				sayi2=Double.parseDouble(textField.getText());
				sonuc=String.format("%.2f",sayi1*sayi2);
				textField.setText(sonuc);
				}
				else if(islem=="-"){

					sayi2=Double.parseDouble(textField.getText());
					sonuc=String.format("%.2f",sayi1-sayi2);
					textField.setText(sonuc);
					}
				else if(islem=="+"){

					sayi2=Double.parseDouble(textField.getText());
					sonuc=String.format("%.2f",sayi1+sayi2);
					textField.setText(sonuc);
					}
				else if(islem=="/"){

					sayi2=Double.parseDouble(textField.getText());
					sonuc=String.format("%.2f",sayi1/sayi2);
					textField.setText(sonuc);
					}
			}
		});
		
		
		
		butonesit.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		butonesit.setBounds(10, 292, 105, 50);
		frmCalculatorapp.getContentPane().add(butonesit);
		
		JButton butonC = new JButton("C");
		butonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				textField.setText(null);
				
			}
		});
		butonC.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		butonC.setBounds(119, 292, 105, 50);
		frmCalculatorapp.getContentPane().add(butonC);
	}
}
