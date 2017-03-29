import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JToggleButton;

//Serial Message Sender
//I am using this JAVA program to send messages to my Arduino
//board to control it.
//Anil Emrah

public class SerialSend {

	private JFrame frmSerialteller;
	private JButton btnSend;
	private JTextField textSending;
	private JTextField textConnection;
	private static SerialPort serialPort = new SerialPort("COM3"); //Default COM3 selected, it needs a review 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerialSend window = new SerialSend();
					window.frmSerialteller.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public SerialSend() {
		String[] portNames = SerialPortList.getPortNames(); //Getting available ports and putting them to portNames[]
		
		frmSerialteller = new JFrame();
		frmSerialteller.setIconImage(Toolkit.getDefaultToolkit().getImage("C:/Users/ANL/Documents/anlgit/SerialSend/icon.png")); //Icon setted
		frmSerialteller.setTitle("SerialTeller");//Title setted
		frmSerialteller.setBounds(100, 100, 316, 421);
		frmSerialteller.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSerialteller.getContentPane().setLayout(null);
		//Button LED2 starts here
		JToggleButton btnLED2 = new JToggleButton("LED2"); //LED2 Toggle Button, When selected, LED2 on Arduino will be ON / deselected it will be OFF
		btnLED2.addActionListener(new ActionListener() {   //LED2 Action Listener is here
			   public void actionPerformed(ActionEvent e) {
				   JToggleButton btnLED2 = (JToggleButton)e.getSource();
				   if (btnLED2.isSelected()) {
					   //if Button LED2 selected send "c" and inform us
					   //if unselected send "d" and inform us
			    	  try {
							serialPort.writeString("c");
							textConnection.setText("LED2 Command Successful");
						} catch (SerialPortException e1) {
							textConnection.setText("LED2 Command Failed");
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			      } else {
			    	  try {
							serialPort.writeString("d");
							textConnection.setText("LED2 Command Successful");
						} catch (SerialPortException e1) {
							textConnection.setText("LED2 Command Failed");
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			      }
			   }
			});
		btnLED2.setBounds(180, 276, 100, 50);
		frmSerialteller.getContentPane().add(btnLED2);
		//Button LED2 finished here
		//Button LED1 starts here
		JToggleButton btnLED1 = new JToggleButton("LED1"); //LED2 Toggle Button, When selected, LED2 on Arduino will be ON / deselected it will be OFF
		btnLED1.addActionListener(new ActionListener() {   //LED2 Action Listener is here
		   public void actionPerformed(ActionEvent e) {
			   JToggleButton btnLED2 = (JToggleButton)e.getSource();
			   if (btnLED2.isSelected()) {
				   //if Button LED2 selected send "c" and inform us
				   //if unselected send "d" and inform us
		    	  try {
						serialPort.writeString("a");
						textConnection.setText("LED1 Command Successful");
					} catch (SerialPortException e1) {
						textConnection.setText("LED1 Command Failed");
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		      } else {
		    	  try {
						serialPort.writeString("b");
						textConnection.setText("LED1 Command Successful");
					} catch (SerialPortException e1) {
						textConnection.setText("LED1 Command Failed");
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		      }
		   }
		});
		btnLED1.setBounds(30, 276, 100, 50);
		frmSerialteller.getContentPane().add(btnLED1);
		//Button LED1 finished here
		//textConnection starts here
		//TextField for information, it shows us
		//if there is an error or everything
		//goes well
		textConnection = new JTextField();
		textConnection.setText("Situation Checker");
		textConnection.setHorizontalAlignment(SwingConstants.CENTER);
		textConnection.setEditable(false);
		textConnection.setForeground(Color.WHITE);
		textConnection.setBackground(Color.DARK_GRAY);
		textConnection.setBounds(30, 127, 250, 20);
		frmSerialteller.getContentPane().add(textConnection);
		textConnection.setColumns(10);
		//textConnection finished here
		//ComboBox starts here
		//ComboBox shows us available ports
		//If there is not any available port
		//It shows nothing
		JComboBox comboBox = new JComboBox(portNames);
		comboBox.setBackground(Color.GRAY);
		comboBox.setEditable(true);
		comboBox.setBounds(109, 50, 89, 32);
		frmSerialteller.getContentPane().add(comboBox);
		//ComboBox finished here
		//btnConnect starts here
		//This button is trying to open port with what we select
		//And it shows us if connection is successful or not
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBackground(new Color(255, 255, 255));
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				    serialPort.openPort();

				    serialPort.setParams(SerialPort.BAUDRATE_9600,
				                         SerialPort.DATABITS_8,
				                         SerialPort.STOPBITS_1,
				                         SerialPort.PARITY_NONE);

				    serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_RTSCTS_IN | 
				                                  SerialPort.FLOWCONTROL_RTSCTS_OUT);
				    
				    textConnection.setText("Succesfully Connected");
				
				}
				catch (SerialPortException ex) {
				    textConnection.setText("There is an error!");
				}
				
			}
		});
		btnConnect.setBounds(109, 93, 89, 23);
		frmSerialteller.getContentPane().add(btnConnect);
		//btnConnect finished here
		//btnSearch starts here
		//This is searching for available ports
		//and putting them to portNames[] and shows in combobox
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(new Color(255, 255, 255));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSearch.setSelected(true);
				SerialPortList.getPortNames();
				if(SerialPortList.getPortNames()==null){
					
					portNames[0]="1";
					comboBox.removeAllItems();
					comboBox.addItem(portNames[0]);
					
				} else {
				
					String[] portNames = SerialPortList.getPortNames();
					comboBox.removeAllItems();
					comboBox.addItem(portNames[0]);
					
				}
			}
		});
		btnSearch.setBounds(109, 11, 89, 23);
		frmSerialteller.getContentPane().add(btnSearch);
		//btnSearch finished here
		//btnSend starts here
		//It is sending what you wrote to textSending TextField
		//And informs us if we could send it or not
		btnSend = new JButton("Send");
		btnSend.setBackground(new Color(255, 255, 255));
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				    try {
						serialPort.writeString(textSending.getText());
						textConnection.setText("Successfully Sent");
					} catch (SerialPortException e1) {
						// TODO Auto-generated catch block
						textConnection.setText("Sending Failed");
						e1.printStackTrace();
					}
				}
		});
		btnSend.setBounds(109, 204, 89, 23);
		frmSerialteller.getContentPane().add(btnSend);
		//btnSend finished here
		//textSending starts here
		//It is a textField which allows us to write our message
		//and send via SerialCommunication with Send Button
		textSending = new JTextField();
		textSending.setToolTipText("");
		textSending.setHorizontalAlignment(SwingConstants.CENTER);
		textSending.setText("Write Your Text to Send");
		textSending.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textSending.setForeground(Color.WHITE);
		textSending.setBackground(Color.DARK_GRAY);
		textSending.setBounds(30, 173, 250, 20);
		frmSerialteller.getContentPane().add(textSending);
		textSending.setColumns(10);
		//textSending finished here
		//Label starts here
		//It is an easy way to set background image
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:/Users/ANL/Documents/anlgit/SerialSend/back.png"));
		lblNewLabel.setBounds(0, 0, 300, 382);
		frmSerialteller.getContentPane().add(lblNewLabel);
		frmSerialteller.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, textSending, btnSearch, btnSend}));
		//Label finished here
		//Getting serial ports list into the array
		for (int i = 0; i < portNames.length; i++){
		    System.out.println(portNames[i]);
	}
	}	
}
