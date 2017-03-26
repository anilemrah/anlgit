import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

//Java example Anil Emrah
//Basic Calculator

public class calcAPP {

	private JFrame calculatorapp;
	private JTextField textField;
	double num1;
	double num2;
	String result;
	String operation;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcAPP window = new calcAPP();
					window.calculatorapp.setVisible(true);
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
		calculatorapp = new JFrame();
		calculatorapp.setTitle("CalcAPP");
		calculatorapp.setBounds(100, 100, 250, 392);
		calculatorapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculatorapp.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 10, 214, 30);
		calculatorapp.getContentPane().add(textField);
		textField.setColumns(10);
		//Button 7 starts here
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				String x = textField.getText() + button7.getText(); //it tooks what textfield already has and adds what you clicked
				textField.setText(x); //shows what you have finally
				
			}
		});
		button7.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		button7.setBounds(10, 51, 50, 50);
		calculatorapp.getContentPane().add(button7);
		//Button 7 finished here
		//Button 9 starts here
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				String x = textField.getText() + button8.getText();
				textField.setText(x);
				
			}
		});
		button8.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		button8.setBounds(65, 51, 50, 50);
		calculatorapp.getContentPane().add(button8);
		//Button8 finished here
		//Button9 starts here
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				String x = textField.getText() + button9.getText();
				textField.setText(x);
				
			}
		});
		button9.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		button9.setBounds(120, 51, 50, 50);
		calculatorapp.getContentPane().add(button9);
		//Button9 finished here
		//Buttondivide starts here
		JButton buttondivide = new JButton("/");
		buttondivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				operation = "/";
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				
			}
		});
		
		buttondivide.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buttondivide.setBounds(175, 51, 50, 50);
		calculatorapp.getContentPane().add(buttondivide);
		//Buttondivide finished here
		//Button4 starts here
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				String x = textField.getText() + button4.getText();
				textField.setText(x);
				
			}
		});
		button4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		button4.setBounds(10, 112, 50, 50);
		calculatorapp.getContentPane().add(button4);
		//Button4 finished here
		//Button5 starts here
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				String x = textField.getText() + button5.getText();
				textField.setText(x);
				
			}
		});
		button5.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		button5.setBounds(65, 112, 50, 50);
		calculatorapp.getContentPane().add(button5);
		//Button5 finished here
		//Button6 starts here
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				String x = textField.getText() + button6.getText();
				textField.setText(x);
				
			}
		});
		button6.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		button6.setBounds(120, 112, 50, 50);
		calculatorapp.getContentPane().add(button6);
		//Button6 finished here
		//Buttonx starts here
		JButton buttonx = new JButton("x");
		buttonx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				operation ="x";
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				
			}
		});
		buttonx.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buttonx.setBounds(175, 112, 50, 50);
		calculatorapp.getContentPane().add(buttonx);
		//Buttonx finished here
		//Button1 starts here
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				String x = textField.getText() + button1.getText();
				textField.setText(x);
				
			}
		});
		button1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		button1.setBounds(10, 173, 50, 50);
		calculatorapp.getContentPane().add(button1);
		//Button1 finished here
		//Button2 starts here
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				String x = textField.getText() + button2.getText();
				textField.setText(x);
				
			}
		});
		button2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		button2.setBounds(65, 173, 50, 50);
		calculatorapp.getContentPane().add(button2);
		//Button2 finished here
		//Button3 starts here
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				String x = textField.getText() + button3.getText();
				textField.setText(x);
				
			}
		});
		button3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		button3.setBounds(120, 173, 50, 50);
		calculatorapp.getContentPane().add(button3);
		//Button3 finished here
		//Buttonminus starts here
		JButton buttonminus = new JButton("-");
		buttonminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				operation = "-";
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				
			}
		});
		buttonminus.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buttonminus.setBounds(175, 173, 50, 50);
		calculatorapp.getContentPane().add(buttonminus);
		//Buttonminus finished here
		//Button0 starts here
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				String x = textField.getText() + button0.getText();
				textField.setText(x);
				
			}
		});
		button0.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		button0.setBounds(9, 234, 106, 50);
		calculatorapp.getContentPane().add(button0);
		//Button0 finished here
		//Buttondot starts here
		JButton buttondot = new JButton(".");
		buttondot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String x = textField.getText() + buttondot.getText();
				textField.setText(x);
				
			}
		});
		buttondot.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buttondot.setBounds(119, 234, 50, 50);
		calculatorapp.getContentPane().add(buttondot);
		//Buttondot finished here
		//Buttonplus starts here
		JButton buttonplus = new JButton("+");
		buttonplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operation = "+";
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				
			}
		});
		buttonplus.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buttonplus.setBounds(174, 234, 50, 50);
		calculatorapp.getContentPane().add(buttonplus);
		//Buttonplus finished here
		//Buttonequal starts here
		JButton buttonequal = new JButton("=");
		buttonequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				//Checks what operation you are doing
				if(operation=="x"){

				num2=Double.parseDouble(textField.getText());
				result=String.format("%.2f",num1*num2);
				textField.setText(result);
				
				}
				else if(operation=="-"){

					num2=Double.parseDouble(textField.getText());
					result=String.format("%.2f",num1-num2);
					textField.setText(result);
					
					}
				else if(operation=="+"){

					num2=Double.parseDouble(textField.getText());
					result=String.format("%.2f",num1+num2);
					textField.setText(result);
					
					}
				else if(operation=="/"){

					num2=Double.parseDouble(textField.getText());
					result=String.format("%.2f",num1/num2);
					textField.setText(result);
					
					}
			}
		});
		
		buttonequal.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buttonequal.setBounds(10, 292, 105, 50);
		calculatorapp.getContentPane().add(buttonequal);
		//Buttonequal finished here
		//ButtonC starts here
		JButton buttonC = new JButton("C");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//What you want to do when this button clicked
				textField.setText(null);
				
			}
		});
		buttonC.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		buttonC.setBounds(119, 292, 105, 50);
		calculatorapp.getContentPane().add(buttonC);
		//ButtonC finished here
	}
}
