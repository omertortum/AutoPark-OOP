package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JCheckBox;

public class HomeScreen extends JFrame {

	private JPanel contentPane,panel4;
	public AutoPark park;
	public Subscription subs;
	int xx,xy;
	private JTextField text1;
	private JTextField int1;
	private JTextField search;
	private JTextField txtyelikBalang;
	private JTextField txtyelikBiti;
	private JTextField tex;
	private JTextField txtParkBalang;
	private JTextField textField_1;
	private JTextField text5;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtPlaka;
	private JTextField txtPlaka_1;
	public JTextArea textArea_1,textArea,textArea_2;
	private JTextField txtEnterPlate;
	private JTextField txtPlaka_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				HomeScreen frame = new HomeScreen();
				JPanel panel = new JPanel();
				panel.setVisible(true);
				JPanel panel2 = new JPanel();
				panel2.setVisible(false);
				frame.setUndecorated(true);
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}});
	}
	
	public HomeScreen() {
		
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 200, 729, 476);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		park = new AutoPark(10,50);
		JPanel panel7 = new JPanel();
		panel7.setVisible(false);
		JPanel panel8 = new JPanel();
		panel8.setVisible(false);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		JButton btnHadiGleGle = new JButton("Hadi Gule Gule");
		JPanel panel6 = new JPanel();
		panel6.setBackground(Color.DARK_GRAY);
		panel6.setVisible(false);
		JTextArea textArea_3 = new JTextArea("", 8, 40);
		textArea_3.setEditable(false);
		JComboBox com1 = new JComboBox();
		JComboBox com2 = new JComboBox();
		JPanel panel5 = new JPanel();
		panel5.setVisible(false);
		JComboBox day1 = new JComboBox();
		JComboBox day2 = new JComboBox();
		JComboBox month2 = new JComboBox();
		JComboBox year1 = new JComboBox();
		JComboBox year2 = new JComboBox();
		JComboBox month1 = new JComboBox();
		JTextArea textArea_1_1 = new JTextArea("", 8, 50);
		textArea_1_1.setEditable(false);
		JTextArea textArea_5 = new JTextArea("", 8, 40);
		textArea_5.setEditable(false);
		JPanel panel2_1_1 = new JPanel();
		panel2_1_1.setVisible(false);
		JTextArea textArea_4 = new JTextArea("", 8, 40);
		textArea_4.setEditable(false);
		JPanel panel4_1 = new JPanel();
		panel4_1.setVisible(false);																
		JTextArea textArea_2_1 = new JTextArea("", 8, 40);
		textArea_2_1.setEditable(false);
		JPanel panel3_1 = new JPanel();
		panel3_1.setVisible(false);
		panel3_1.setBackground(Color.DARK_GRAY);
		panel3_1.setBounds(0, 0, 761, 482);
		contentPane.add(panel3_1);
		panel3_1.setLayout(null);
		JButton btnNaber = new JButton("MAKE IT BIGGER ! ");
		btnNaber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int b=Integer.parseInt(int1.getText());
					if(b<0) {
						textArea_2_1.append("Negatif sayý giremezsin\n");
						}	
						else if(b>park.getCapacity()) {
						textArea_2_1.append("Kapasite Arttýrýldý.\nYeni Kapasite: "+b+"\n");
						park.setCapacity(b);
						}
						else if(b==park.getCapacity()) {
						textArea_2_1.append("Eski Kapasite ile Ayný\n");
						}
						else {
						textArea_2_1.append("Eski Kapasite Daha Büyük\n");
						}
					}
				});
			btnNaber.setBounds(261, 274, 175, 23);
			panel3_1.add(btnNaber);
			
			int1 = new JTextField();
			int1.setHorizontalAlignment(SwingConstants.CENTER);
			int1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			int1.setBounds(273, 189, 157, 62);
			panel3_1.add(int1);
			int1.setColumns(10);
			
			JTextArea txtrYeniBoyutKa = new JTextArea();
			txtrYeniBoyutKa.setEditable(false);
			txtrYeniBoyutKa.setFont(new Font("Monospaced", Font.PLAIN, 18));
			txtrYeniBoyutKa.setText("  Yeni Boyut Ka\u00E7 Olsun?");
			txtrYeniBoyutKa.setBounds(233, 132, 266, 46);
			panel3_1.add(txtrYeniBoyutKa);
										
										JButton button_11 = new JButton("");
										button_11.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent arg0) {
												panel.setVisible(true);
												panel2_1_1.setVisible(false);
												panel3_1.setVisible(false);
											}
										});
										button_11.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/back.png")));
										button_11.setFocusPainted(false);
										button_11.setBorder(null);
										button_11.setBackground(Color.DARK_GRAY);
										button_11.setBounds(10, 11, 78, 66);
										panel3_1.add(button_11);
										
										JScrollPane scrollPane_2 = new JScrollPane((Component) null);
										scrollPane_2.setBackground(Color.DARK_GRAY);
										scrollPane_2.setBounds(233, 308, 220, 62);
										panel3_1.add(scrollPane_2);
										
										
										textArea_2_1.setWrapStyleWord(true);
										textArea_2_1.setLineWrap(true);
										scrollPane_2.setViewportView(textArea_2_1);
										panel3_1.setVisible(false);
								panel4_1.setBounds(0, 0, 761, 482);
								contentPane.add(panel4_1);
								panel4_1.setBackground(Color.DARK_GRAY);
								panel4_1.setLayout(null);		
								search = new JTextField();
								search.setHorizontalAlignment(SwingConstants.CENTER);
								search.setFont(new Font("Tahoma", Font.PLAIN, 16));
								search.setColumns(10);
								search.setBounds(208, 105, 227, 36);
								panel4_1.add(search);													
								JButton button_12 = new JButton("SEARCH IT !");
								button_12.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
									if(park.getSizeofPark()==0) {
										textArea_4.append("Hiç araç yok\n");
									}
									else {
										String b=(search.getText());
										if(park.isParked(b)){
											textArea_4.append("Aracý buldum\n");
										}
										else {
											textArea_4.append("Aracý bulamadým\n");
										}								
									}}
								});
								button_12.setForeground(Color.WHITE);
								button_12.setFont(new Font("Tahoma", Font.BOLD, 15));
								button_12.setFocusPainted(false);
								button_12.setBorder(UIManager.getBorder("InternalFrame.border"));
								button_12.setBackground(Color.DARK_GRAY);
								button_12.setBounds(234, 165, 184, 128);
								panel4_1.add(button_12);													
								JButton button_14 = new JButton("");
								button_14.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										panel.setVisible(true);
										panel2_1_1.setVisible(false);
										panel3_1.setVisible(false);
										panel4_1.setVisible(false);
									}
								});
								button_14.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/back.png")));
								button_14.setFocusPainted(false);
								button_14.setBorder(null);
								button_14.setBackground(Color.DARK_GRAY);
								button_14.setBounds(10, 11, 78, 66);
								panel4_1.add(button_14);													
								JScrollPane scrollPane_4 = new JScrollPane((Component) null);
								scrollPane_4.setBackground(Color.DARK_GRAY);
								scrollPane_4.setBounds(193, 304, 242, 66);
								panel4_1.add(scrollPane_4);		
								textArea_4.setWrapStyleWord(true);
								textArea_4.setLineWrap(true);
								scrollPane_4.setViewportView(textArea_4);		
								txtEnterPlate = new JTextField();
								txtEnterPlate.setEditable(false);
								txtEnterPlate.setForeground(Color.CYAN);
								txtEnterPlate.setFont(new Font("Tahoma", Font.PLAIN, 18));
								txtEnterPlate.setBackground(Color.DARK_GRAY);
								txtEnterPlate.setText("Enter Plate:");
								txtEnterPlate.setBounds(93, 103, 105, 38);
								panel4_1.add(txtEnterPlate);
								txtEnterPlate.setColumns(10);
								panel2_1_1.setBounds(0, 0, 761, 482);
								contentPane.add(panel2_1_1);
								panel2_1_1.setBackground(Color.DARK_GRAY);
								panel2_1_1.setLayout(null);
								
								JButton button_8 = new JButton("Add Vehicle");
								button_8.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
								Date dt1 = new Date(31,4,2019);
								Date dt2 = new Date(31,6,2019);
								
								
								
								String b=(text1.getText());
								SubscribedVehicle a1=new SubscribedVehicle(new Subscription(dt1,dt2,b));
							

								if((year2.getSelectedIndex()+2018)<(year1.getSelectedIndex()+2018)){
									textArea_5.append("Bitiþ tarihi baþlangýç tarihinden önce olamaz\n");
									}
								else if((year2.getSelectedIndex()+2018)==(year1.getSelectedIndex()+2018) && (month2.getSelectedIndex()+1)<(month1.getSelectedIndex()+1)) {
									textArea_5.append("Bitiþ tarihi baþlangýç tarihinden önce olamaz\n");
								}
								else if((year2.getSelectedIndex()+2018)==(year1.getSelectedIndex()+2018) && (month2.getSelectedIndex()+1)==(month1.getSelectedIndex()+1) && (day2.getSelectedIndex()+1)<(day1.getSelectedIndex()+1)) {
									textArea_5.append("Bitiþ tarihi baþlangýç tarihinden önce olamaz\n");
								}
								else if((year2.getSelectedIndex()+2018)==(year1.getSelectedIndex()+2018) && (month2.getSelectedIndex()+1)==(month1.getSelectedIndex()+1) && (day2.getSelectedIndex()+1)==(day1.getSelectedIndex()+1)) {
									textArea_5.append("1 günlük üyelik yapmýyoruz.Güle güle\n");
								}
								else if(park.addVehicle(a1)) {
								
								Date bas= new Date((day1.getSelectedIndex()+1),(month1.getSelectedIndex()+1),(year1.getSelectedIndex()+2018));
								Date bit= new Date((day2.getSelectedIndex()+1),(month2.getSelectedIndex()+1),(year2.getSelectedIndex()+2018));
								subs=new Subscription(bas,bit,a1.getPlate());
								a1=new SubscribedVehicle(subs);
								textArea_5.append(a1.getPlate()+" Plakalý Araç Eklendi\n");
								textArea_5.append("Abonelik baþlangýç: "+(day1.getSelectedIndex()+1)+"."+(month1.getSelectedIndex()+1)+"."+(year1.getSelectedIndex()+2018)+"\n");
								textArea_5.append("Abonelik bitiþ    : "+(day2.getSelectedIndex()+1)+"."+(month2.getSelectedIndex()+1)+"."+(year2.getSelectedIndex()+2018)+"\n");
								textArea_1_1.append("New Size:"+park.getSizeofSubscribed()+"\n");
							}
								
							else {
								textArea_5.append(a1.getPlate()+" Plakalý Araç Zaten Var\n");
							}

						}
						});
						button_8.setForeground(Color.WHITE);
						button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
						button_8.setFocusPainted(false);
						button_8.setBorder(UIManager.getBorder("InternalFrame.border"));
						button_8.setBackground(Color.DARK_GRAY);
						button_8.setBounds(278, 251, 184, 128);
						panel2_1_1.add(button_8);
						
						text1 = new JTextField();
						text1.setHorizontalAlignment(SwingConstants.CENTER);
						text1.setFont(new Font("Tahoma", Font.PLAIN, 16));
						text1.setColumns(10);
						text1.setBounds(224, 82, 283, 36);
						panel2_1_1.add(text1);
						
						JButton button_9 = new JButton("Size");
						button_9.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								textArea_1_1.append("Size:"+park.getSizeofSubscribed()+"\n");										
							}
						});
						button_9.setBounds(472, 251, 219, 65);
						panel2_1_1.add(button_9);
						JButton back = new JButton("");
						back.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								panel.setVisible(true);
								panel2_1_1.setVisible(false);
								panel3_1.setVisible(false);
								panel4_1.setVisible(false);
								panel8.setVisible(false);
								
								
								
							}
						});
						back.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/back.png")));
						back.setFocusPainted(false);
						back.setBorder(null);
						back.setBackground(Color.DARK_GRAY);
						back.setBounds(27, 11, 78, 66);
						panel2_1_1.add(back);
						
						
						month1.setModel(new DefaultComboBoxModel(new String[] {"Ocak", "\u015Eubat", "Mart", "Nisan", "May\u0131s", "Haziran", "Temmuz", "A\u011Fustos", "Eyl\u00FCl", "Ekim", "Kas\u0131m", "Aral\u0131k"}));
						month1.setBounds(357, 133, 115, 28);
						panel2_1_1.add(month1);
						
						txtyelikBalang = new JTextField();
						txtyelikBalang.setEditable(false);
						txtyelikBalang.setFont(new Font("Tahoma", Font.PLAIN, 12));
						txtyelikBalang.setText("\u00DCyelik Ba\u015Flang\u0131\u00E7");
						txtyelikBalang.setBounds(87, 136, 123, 23);
						panel2_1_1.add(txtyelikBalang);
						txtyelikBalang.setColumns(10);
						
						txtyelikBiti = new JTextField();
						txtyelikBiti.setEditable(false);
						txtyelikBiti.setFont(new Font("Tahoma", Font.PLAIN, 12));
						txtyelikBiti.setText("\u00DCyelik Biti\u015F");
						txtyelikBiti.setColumns(10);
						txtyelikBiti.setBounds(87, 175, 123, 23);
						panel2_1_1.add(txtyelikBiti);
						

						month2.setModel(new DefaultComboBoxModel(new String[] {"Ocak", "\u015Eubat", "Mart", "Nisan", "May\u0131s", "Haziran", "Temmuz", "A\u011Fustos", "Eyl\u00FCl", "Ekim", "Kas\u0131m", "Aral\u0131k"}));
						month2.setBounds(357, 172, 115, 28);
						panel2_1_1.add(month2);
						

						day1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
						day1.setBounds(234, 133, 115, 28);
						panel2_1_1.add(day1);
						

						day2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
						day2.setBounds(232, 172, 115, 28);
						panel2_1_1.add(day2);
						

						year1.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028"}));
						year1.setBounds(482, 133, 115, 28);
						panel2_1_1.add(year1);							
						year2.setModel(new DefaultComboBoxModel(new String[] {"2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028"}));
						year2.setBounds(482, 170, 115, 28);
						panel2_1_1.add(year2);
									
						JButton btnPrint = new JButton("print Subscribed Vehicles");
						btnPrint.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if(park.subscribedVehicles.size()==0) {
								textArea_5.append("Hiç kayýtlý araç yok\n");
							}
							else
							textArea_5.append("Kayýtlý Araçlar Listesi:\n");
							for(int i=0; i<park.subscribedVehicles.size();i++) {
								textArea_5.append(i+1+"-"+park.subscribedVehicles.get(i).getPlate()+"\n");
									
						}
						}});
						textArea_5.setWrapStyleWord(true);
						textArea_5.setLineWrap(true);
						btnPrint.setBounds(278, 382, 184, 23);
						panel2_1_1.add(btnPrint);
						
						JScrollPane scrollPane = new JScrollPane((Component) null);
						scrollPane.setBackground(Color.DARK_GRAY);
						scrollPane.setBounds(10, 251, 244, 128);
						panel2_1_1.add(scrollPane);												
						scrollPane.setViewportView(textArea_5);									
						JScrollPane scrollPane_1 = new JScrollPane((Component) null);
						scrollPane_1.setBackground(Color.DARK_GRAY);
						scrollPane_1.setBounds(472, 327, 219, 51);
						panel2_1_1.add(scrollPane_1);
						textArea_1_1.setPreferredSize(new Dimension(5, 100));
						textArea_1_1.setDisabledTextColor(Color.WHITE);
						textArea_1_1.setWrapStyleWord(true);
						textArea_1_1.setLineWrap(true);
						scrollPane_1.setViewportView(textArea_1_1);
						
						txtPlaka_2 = new JTextField();
						txtPlaka_2.setEditable(false);
						txtPlaka_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
						txtPlaka_2.setHorizontalAlignment(SwingConstants.CENTER);
						txtPlaka_2.setText("Plaka Giriniz");
						txtPlaka_2.setColumns(10);
						txtPlaka_2.setBounds(87, 82, 123, 33);
						panel2_1_1.add(txtPlaka_2);
						panel5.setBackground(Color.DARK_GRAY);
						panel5.setBounds(0, 0, 761, 482);
						contentPane.add(panel5);
						panel5.setLayout(null);
						JCheckBox check = new JCheckBox("official?");
						JButton button_13 = new JButton("");
						button_13.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panel.setVisible(true);
							panel2_1_1.setVisible(false);
							panel3_1.setVisible(false);
							panel4_1.setVisible(false);
							panel5.setVisible(false);
						}
						});
						button_13.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/back.png")));
						button_13.setFocusPainted(false);
						button_13.setBorder(null);
						button_13.setBackground(Color.DARK_GRAY);
						button_13.setBounds(10, 11, 78, 66);
						panel5.add(button_13);
						
						tex = new JTextField();
						tex.setHorizontalAlignment(SwingConstants.CENTER);
						tex.setFont(new Font("Tahoma", Font.PLAIN, 16));
						tex.setColumns(10);
						tex.setBounds(202, 116, 266, 36);
						panel5.add(tex);
						
						txtParkBalang = new JTextField();
						txtParkBalang.setEditable(false);
						txtParkBalang.setFont(new Font("Tahoma", Font.PLAIN, 16));
						txtParkBalang.setText("Park Ba\u015Flang\u0131\u00E7");
						txtParkBalang.setColumns(10);
						txtParkBalang.setBounds(71, 157, 123, 36);
						panel5.add(txtParkBalang);
						com1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
						com1.setBounds(218, 163, 115, 28);
						panel5.add(com1);
						com2.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
						com2.setBounds(353, 163, 115, 28);
						panel5.add(com2);
						
						JButton button_15 = new JButton("Park");
						button_15.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String a;
							a=(tex.getText());
							int x = com1.getSelectedIndex();
							int y = com2.getSelectedIndex();			
							Time h =new Time(x,y);
							
							if(park.isParked(a)) {			
								textArea_3.append("Bu plakalý araç zaten park edilmiþ\n");
							}
							else if(park.searchVehicle(a)!=null) {
								ParkRecord record=new ParkRecord(h,park.searchVehicle(a));	
								park.parkRecords.add(record);
								textArea_3.append("Üye araç park edilmiþtir\n");
							}
							else if(check.isSelected()) {
								OfficialVehicle ovehicle=new OfficialVehicle(a);
								ParkRecord record=new ParkRecord(h,ovehicle);
								park.parkRecords.add(record);
								textArea_3.append("Official araç park edilmiþtir\n");
							}
							else {
								RegularVehicle rvehicle=new RegularVehicle(a);
								ParkRecord record=new ParkRecord(h,rvehicle);
								park.parkRecords.add(record);
								textArea_3.append("Regular araç park edilmiþtir\n");
							}
							
								
								}
						});
						button_15.setForeground(Color.GREEN);
						button_15.setFont(new Font("Tahoma", Font.BOLD, 15));
						button_15.setFocusPainted(false);
						button_15.setBorder(UIManager.getBorder("InternalFrame.border"));
						button_15.setBackground(Color.DARK_GRAY);
						button_15.setBounds(261, 251, 184, 128);
						panel5.add(button_15);
						
						textField_1 = new JTextField();
						textField_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
						textField_1.setText(":");
						textField_1.setColumns(10);
						textField_1.setBounds(338, 166, 10, 23);
						panel5.add(textField_1);
						
						txtPlaka_1 = new JTextField();
						txtPlaka_1.setEditable(false);
						txtPlaka_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
						txtPlaka_1.setHorizontalAlignment(SwingConstants.CENTER);
						txtPlaka_1.setText("Plaka");
						txtPlaka_1.setColumns(10);
						txtPlaka_1.setBounds(71, 116, 123, 33);
						panel5.add(txtPlaka_1);		
						JScrollPane scrollPane_3 = new JScrollPane((Component) null);
						scrollPane_3.setBackground(Color.DARK_GRAY);
						scrollPane_3.setBounds(10, 251, 244, 128);
						panel5.add(scrollPane_3);
						textArea_3.setWrapStyleWord(true);
						textArea_3.setLineWrap(true);
						scrollPane_3.setViewportView(textArea_3);					
						check.setFont(new Font("Tahoma", Font.PLAIN, 18));
						check.setBounds(486, 116, 97, 36);
						panel5.add(check);
						panel6.setBounds(0, 0, 761, 482);
						contentPane.add(panel6);
						panel6.setLayout(null);				
						JButton button_16 = new JButton("");
						button_16.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/back.png")));
						button_16.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								panel.setVisible(true);
								panel2_1_1.setVisible(false);
								panel3_1.setVisible(false);
								panel4_1.setVisible(false);
								panel5.setVisible(false);
								panel6.setVisible(false);
							}
						});
					button_16.setFocusPainted(false);
					button_16.setBorder(null);
					button_16.setBackground(Color.DARK_GRAY);
					button_16.setBounds(10, 11, 78, 66);
					panel6.add(button_16);
					
					text5 = new JTextField();
					text5.setHorizontalAlignment(SwingConstants.CENTER);
					text5.setFont(new Font("Tahoma", Font.PLAIN, 16));
					text5.setColumns(10);
					text5.setBounds(211, 107, 255, 36);
					panel6.add(text5);
					panel6.add(btnHadiGleGle);
					
					JComboBox com1_1 = new JComboBox();
					com1_1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
					com1_1.setBounds(216, 154, 115, 28);
					panel6.add(com1_1);
					
					JComboBox com2_1 = new JComboBox();
					com2_1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
					com2_1.setBounds(351, 154, 115, 28);
					panel6.add(com2_1);
					
					textField_4 = new JTextField();
					textField_4.setText(":");
					textField_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
					textField_4.setColumns(10);
					textField_4.setBounds(336, 157, 10, 23);
					panel6.add(textField_4);
					
					textField_5 = new JTextField();
					textField_5.setEditable(false);
					textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
					textField_5.setHorizontalAlignment(SwingConstants.CENTER);
					textField_5.setText("Park Biti\u015F");
					textField_5.setColumns(10);
					textField_5.setBounds(79, 154, 123, 28);
					panel6.add(textField_5);
					
					txtPlaka = new JTextField();
					txtPlaka.setEditable(false);
					txtPlaka.setHorizontalAlignment(SwingConstants.CENTER);
					txtPlaka.setFont(new Font("Tahoma", Font.PLAIN, 18));
					txtPlaka.setText("Plaka");
					txtPlaka.setColumns(10);
					txtPlaka.setBounds(79, 107, 123, 36);
					panel6.add(txtPlaka);				
					btnHadiGleGle.setForeground(Color.RED);
					btnHadiGleGle.setFont(new Font("Tahoma", Font.BOLD, 15));
					btnHadiGleGle.setFocusPainted(false);
					btnHadiGleGle.setBorder(UIManager.getBorder("InternalFrame.border"));
					btnHadiGleGle.setBackground(Color.DARK_GRAY);
					btnHadiGleGle.setBounds(261, 251, 184, 128);
					
					JScrollPane scrollPane_5 = new JScrollPane((Component) null);
					scrollPane_5.setBackground(Color.DARK_GRAY);
					scrollPane_5.setBounds(10, 251, 244, 128);
					panel6.add(scrollPane_5);							
					JTextArea textArea_6 = new JTextArea("", 8, 40);
					textArea_6.setEditable(false);
					textArea_6.setWrapStyleWord(true);
					textArea_6.setLineWrap(true);
					scrollPane_5.setViewportView(textArea_6);
					btnHadiGleGle.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
					String a=text5.getText();
					if(park.isParked(a)){
					int x = com1_1.getSelectedIndex();
					int y = com2_1.getSelectedIndex();
					Time h =new Time(x,y);
					int w=com1_1.getSelectedIndex()-com1.getSelectedIndex();
					int z=com2_1.getSelectedIndex()-com2.getSelectedIndex();
					textArea_6.append("Park süresi: "+w+" saat "+z+" dakika\n");
					for(int i=0;i<park.parkRecords.size();i++) {
						
						if(park.parkRecords.get(i).getVehicle().getPlate().contentEquals(a)) {
							if(park.parkRecords.get(i).getVehicle().isSpecial()) {
								textArea_6.append("Memur Bey Ödeme yok\n");
								park.parkRecords.remove(i);
							}
						else if(park.searchVehicle(a)!=null) {
							if(park.parkRecords.get(i).getVehicle().getSubscription().isValid()) {
								textArea_6.append("Uyeliginiz devam ediyor.Odeme yok\n");
								
							}
							
							else {
								textArea_6.append("Burada");
								park.parkRecords.get(i).setExitTime(h);
								textArea_6.append("Paraný öde lan it\n");
								park.setIncomeDaily(park.getIncomeDaily()+park.parkRecords.get(i).getParkingDuration()*park.getHourlyFee());
								park.parkRecords.remove(i);							
							}}
							else {
								park.parkRecords.remove(i);
								park.setIncomeDaily(park.getIncomeDaily()+(w*park.getHourlyFee()));
								textArea_6.append("Ödenecek miktar:"+(w*park.getHourlyFee())+"\n");
						}}}

						}
						else {
							textArea_6.append("Böyle bir araç hiç olmadý...\n");
						}	
					}
				});
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 761, 482);
		contentPane.add(panel);
		
		JButton button = new JButton("Enlarge Park");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel3_1.setVisible(true);
				panel.setVisible(false);
				panel2_1_1.setVisible(false);
			}
		});
		button.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/resize.png")));
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setFocusPainted(false);
		button.setBorder(UIManager.getBorder("InternalFrame.border"));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(260, 23, 184, 128);
		panel.add(button);
		
		JButton button_1 = new JButton("Parked Size");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Blank lframe = new  Blank();
				lframe.setUndecorated(true);
		        JOptionPane.showMessageDialog(lframe,"Number of cars parked: "+park.getSizeofPark()); 
		        
			}
		});
		button_1.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/car-icon.png")));
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setFocusPainted(false);
		button_1.setBorder(UIManager.getBorder("InternalFrame.border"));
		button_1.setBackground(Color.DARK_GRAY);
		button_1.setBounds(478, 23, 184, 128);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Free Spots");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Blank lframe = new  Blank();
				lframe.setUndecorated(true);
		        JOptionPane.showMessageDialog(lframe,"Free parking lots: "+ (park.getCapacity()-park.getSizeofPark())); 
				
				
			}
		});
		button_2.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/checked.png")));
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setFocusPainted(false);
		button_2.setBorder(UIManager.getBorder("InternalFrame.border"));
		button_2.setBackground(Color.DARK_GRAY);
		button_2.setBounds(45, 162, 183, 128);
		panel.add(button_2);
		JButton button_3 = new JButton("is Parked");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel2_1_1.setVisible(false);
				panel3_1.setVisible(false);
				panel4_1.setVisible(true);
			}
			});
		button_3.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/question.png")));
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setFocusPainted(false);
		button_3.setBorder(UIManager.getBorder("InternalFrame.border"));
		button_3.setBackground(Color.DARK_GRAY);
		button_3.setBounds(260, 162, 184, 128);
		panel.add(button_3);
		
		JButton button_4 = new JButton("Income");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {

			}
		});
								
	button_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		Blank lframe = new  Blank();
		JOptionPane.showMessageDialog(lframe,"Total Income: "+park.getIncomeDaily());
		JOptionPane optionPane = new JOptionPane("Hello world", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);
		}
	});
	button_4.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/Money-icon.png")));
	button_4.setForeground(Color.WHITE);
	button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
	button_4.setFocusPainted(false);
	button_4.setBorder(UIManager.getBorder("InternalFrame.border"));
	button_4.setBackground(Color.DARK_GRAY);
	button_4.setBounds(479, 162, 180, 128);
	panel.add(button_4);
	
	JButton btnNewButton = new JButton("Add Vehicle");
	btnNewButton.addMouseListener(new MouseAdapter() {
		
		
		public void mouseClicked(MouseEvent arg0) {

		}
	});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel2_1_1.setVisible(true);
				panel8.setVisible(false);
					}
				});
				btnNewButton.setBounds(45, 23, 183, 128);
				panel.add(btnNewButton);
				btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
				btnNewButton.setForeground(Color.WHITE);
				btnNewButton.setFocusPainted(false);
				btnNewButton.setBorder(UIManager.getBorder("InternalFrame.border"));
				btnNewButton.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/car.png")));
				btnNewButton.setBackground(Color.DARK_GRAY);
				
				JButton button_5 = new JButton("Vehicle Enter");
				button_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panel.setVisible(false);
						panel2_1_1.setVisible(false);
						panel3_1.setVisible(false);
						panel4_1.setVisible(false);
						panel5.setVisible(true);
						
					}
				});
		button_5.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/parking.png")));
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setFocusPainted(false);
		button_5.setBorder(UIManager.getBorder("InternalFrame.border"));
		button_5.setBackground(Color.DARK_GRAY);
		button_5.setBounds(45, 301, 183, 128);
		panel.add(button_5);
		
		
		JButton button_6 = new JButton("Vehicle Exit");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel2_1_1.setVisible(false);
				panel3_1.setVisible(false);
				panel4_1.setVisible(false);
				panel5.setVisible(false);
				panel6.setVisible(true);
			}
		});
		button_6.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/exit.png")));
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setFocusPainted(false);
		button_6.setBorder(UIManager.getBorder("InternalFrame.border"));
		button_6.setBackground(Color.DARK_GRAY);
		button_6.setBounds(260, 301, 184, 128);
		panel.add(button_6);
									
									JButton button_7 = new JButton("About Us");
									button_7.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											
											panel.setVisible(false);
											panel2_1_1.setVisible(false);
											panel3_1.setVisible(false);
											panel4_1.setVisible(false);
											panel5.setVisible(false);
											panel7.setVisible(true);
										}
									});
									button_7.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/learning.png")));
									button_7.setForeground(Color.WHITE);
									button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
									button_7.setFocusPainted(false);
									button_7.setBorder(UIManager.getBorder("InternalFrame.border"));
									button_7.setBackground(Color.DARK_GRAY);
									button_7.setBounds(478, 301, 184, 128);
									panel.add(button_7);
									
									JLabel label_10 = new JLabel("X");
									label_10.addMouseListener(new MouseAdapter() {
										@Override
										public void mouseClicked(MouseEvent arg0) {
											
											System.exit(0);
										}
									});
									label_10.setHorizontalAlignment(SwingConstants.CENTER);
									label_10.setForeground(new Color(241, 57, 83));
									label_10.setFont(new Font("Sitka Subheading", Font.PLAIN, 36));
									label_10.setBounds(672, 11, 46, 32);
									panel.add(label_10);
									
									JLabel lblGo = new JLabel("GO");
									lblGo.setHorizontalAlignment(SwingConstants.CENTER);
									lblGo.setForeground(new Color(241, 57, 83));
									lblGo.setFont(new Font("Sitka Subheading", Font.PLAIN, 30));
									lblGo.setBounds(672, 54, 46, 32);
									panel.add(lblGo);
									lblGo.addMouseListener(new MouseAdapter() {
										@Override
										public void mousePressed(MouseEvent e) {
											
											 xx = e.getX();
										     xy = e.getY();
										}
									});
									lblGo.addMouseMotionListener(new MouseMotionAdapter() {
										@Override
										public void mouseDragged(MouseEvent arg0) {
											
											int x = arg0.getXOnScreen();
		            int y = arg0.getYOnScreen();
		            HomeScreen.this.setLocation(x - xx, y - xy);  
										}
									});
									lblGo.setBounds(0, 0, 1500, 1200);
									lblGo.setVerticalAlignment(SwingConstants.TOP);
			panel8.setBounds(482, 171, 174, 110);
			contentPane.add(panel8);
			panel8.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("New label");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(0, 0, 174, 110);
			panel8.add(lblNewLabel_1);
			
	//		JPanel panel7 = new JPanel();
			panel7.setBackground(Color.DARK_GRAY);
			panel7.setBounds(0, 0, 761, 482);
			contentPane.add(panel7);
			panel7.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/ves2.jpg")));
			lblNewLabel.setBounds(475, 98, 62, 85);
			panel7.add(lblNewLabel);
			
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/vesikal\u0131k.png")));
			label.setBounds(403, 98, 62, 85);
			panel7.add(label);
			
			JLabel label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/vesikal\u0131k.png")));
			label_1.setBounds(331, 98, 62, 85);
			panel7.add(label_1);
			
			JLabel label_2 = new JLabel("");
			label_2.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/ves2.jpg")));
			label_2.setBounds(246, 98, 62, 85);
			panel7.add(label_2);
			
			JLabel label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/vesikal\u0131k.png")));
			label_3.setBounds(367, 11, 62, 85);
			panel7.add(label_3);
			
			JLabel label_4 = new JLabel("");
			label_4.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/vesikal\u0131k.png")));
			label_4.setBounds(341, 187, 62, 85);
			panel7.add(label_4);
			
			JLabel label_5 = new JLabel("");
			label_5.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/vesikal\u0131k.png")));
			label_5.setBounds(413, 187, 62, 85);
			panel7.add(label_5);
			
			JLabel label_6 = new JLabel("");
			label_6.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/ves2.jpg")));
			label_6.setBounds(246, 276, 62, 85);
			panel7.add(label_6);
			
			JLabel label_7 = new JLabel("");
			label_7.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/vesikal\u0131k.png")));
			label_7.setBounds(367, 276, 62, 85);
			panel7.add(label_7);
			
			JLabel label_8 = new JLabel("");
			label_8.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/ves2.jpg")));
			label_8.setBounds(482, 276, 62, 85);
			panel7.add(label_8);
			
			JLabel label_9 = new JLabel("");
			label_9.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/ves2.jpg")));
			label_9.setBounds(367, 363, 62, 85);
			panel7.add(label_9);
			
			JButton button_17 = new JButton("");
			button_17.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel.setVisible(true);
					panel2_1_1.setVisible(false);
					panel3_1.setVisible(false);
					panel4_1.setVisible(false);
					panel5.setVisible(false);
					panel7.setVisible(false);
					panel8.setVisible(false);
					
				}
			});
			button_17.setIcon(new ImageIcon(HomeScreen.class.getResource("/project/pics/back.png")));
			button_17.setFocusPainted(false);
			button_17.setBorder(null);
			button_17.setBackground(Color.DARK_GRAY);
			button_17.setBounds(10, 11, 78, 66);
			panel7.add(button_17);
		
		JLabel lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				System.exit(0);
			}
		});
		lbl_close.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_close.setForeground(new Color(241, 57, 83));
		lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_close.setBounds(691, 0, 37, 27);
		contentPane.add(lbl_close);
	}
}