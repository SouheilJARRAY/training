package CheckSameNumbers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class checkSameNumbers extends JFrame {
	
	int counter = 0;
	int winCounter = 0;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,start,end;
	JLabel lINIT,lNT,lNT1,lNRC,lNRC1,lT,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
	
	public checkSameNumbers( ) {

		b1= new JButton();
		b1.setBounds(50,50,50,50);
		b1.addActionListener(new check1());
		
		b2= new JButton();
		b2.setBounds(110,50,50,50);
		b2.addActionListener(new check2());
		
		b3= new JButton();
		b3.setBounds(170,50,50,50);
		b3.addActionListener(new check3());
		
		b4= new JButton();
		b4.setBounds(230,50,50,50);
		b4.addActionListener(new check4());
		
		b5= new JButton();
		b5.setBounds(290,50,50,50);
		b5.addActionListener(new check5());
		
		b6= new JButton();
		b6.setBounds(50,110,50,50);
		b6.addActionListener(new check6());
		
		b7= new JButton();
		b7.setBounds(110,110,50,50);
		b7.addActionListener(new check7());
		
		b8= new JButton();
		b8.setBounds(170,110,50,50);
		b8.addActionListener(new check8());
		
		b9= new JButton();
		b9.setBounds(230,110,50,50);
		b9.addActionListener(new check9());
		
		b10= new JButton();
		b10.setBounds(290,110,50,50);
		b10.addActionListener(new check10());
		
		b11= new JButton();
		b11.setBounds(50,170,50,50);
		b11.addActionListener(new check11());
		
		b12= new JButton();
		b12.setBounds(110,170,50,50);
		b12.addActionListener(new check12());
		
		b13= new JButton();
		b13.setBounds(170,170,50,50);
		b13.addActionListener(new check13());
		
		b14= new JButton();
		b14.setBounds(230,170,50,50);
		b14.addActionListener(new check14());
		
		b15= new JButton();
		b15.setBounds(290,170,50,50);
		b15.addActionListener(new check15());
		
		b16= new JButton();
		b16.setBounds(50,230,50,50);
		b16.addActionListener(new check16());
		
		b17= new JButton();
		b17.setBounds(110,230,50,50);
		b17.addActionListener(new check17());
		
		b18= new JButton();
		b18.setBounds(170,230,50,50);
		b18.addActionListener(new check18());
		
		b19= new JButton();
		b19.setBounds(230,230,50,50);
		b19.addActionListener(new check19());
		
		b20= new JButton();
		b20.setBounds(290,230,50,50);
		b20.addActionListener(new check20());
		
		start= new JButton();
		start.setBounds(80,290,110,50);
		start.addActionListener(new start());
		start.setText("start");
		
		end= new JButton("end");
		end.setBounds(200,290,100,50);
		end.addActionListener(new end());
		
		lNT= new JLabel("number of tries:");
		lNT.setBounds(370,50,100,100);
		
		lNT1= new JLabel();
		lNT1.setBounds(400,80,100,100);
		lNT1.setText("0");
		
		lNRC= new JLabel("number of right checks:");
		lNRC.setBounds(370,170,150,100);
		
		lNRC1= new JLabel();
		lNRC1.setBounds(400,200,100,100);
		lNRC1.setText("0");
		
		lT= new JLabel();
		lT.setBounds(80,290,110,50);
		
		lINIT= new JLabel();
		lINIT.setBounds(110,290,70,50);
		
		l1= new JLabel();
		l1.setBounds(370,50,100,100);
		
		l1= new JLabel();
		l1.setBounds(50,50,50,50);
		
		l2= new JLabel();
		l2.setBounds(110,50,50,50);
		
		l3= new JLabel();
		l3.setBounds(170,50,50,50);

		l4= new JLabel();
		l4.setBounds(230,50,50,50);
		
		l5= new JLabel();
		l5.setBounds(290,50,50,50);
		
		l6= new JLabel();
		l6.setBounds(50,110,50,50);
		
		l7= new JLabel();
		l7.setBounds(110,110,50,50);
		
		l8= new JLabel();
		l8.setBounds(170,110,50,50);
		
		l9= new JLabel();
		l9.setBounds(230,110,50,50);
		
		l10= new JLabel();
		l10.setBounds(290,110,50,50);
		
		l11= new JLabel();
		l11.setBounds(50,170,50,50);
		
		l12= new JLabel();
		l12.setBounds(110,170,50,50);
		
		l13= new JLabel();
		l13.setBounds(170,170,50,50);
		
		l14= new JLabel();
		l14.setBounds(230,170,50,50);
		
		l15= new JLabel();
		l15.setBounds(290,170,50,50);
		
		l16= new JLabel();
		l16.setBounds(50,230,50,50);
		
		l17= new JLabel();
		l17.setBounds(110,230,50,50);
		
		l18= new JLabel();
		l18.setBounds(170,230,50,50);
		
		l19= new JLabel();
		l19.setBounds(230,230,50,50);
		
		l20= new JLabel();
		l20.setBounds(290,230,50,50);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		add(b18);
		add(b19);
		add(b20);
		add(start);
		add(end);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		add(l13);
		add(l14);
		add(l15);
		add(l16);
		add(l17);
		add(l18);
		add(l19);
		add(l20);
		add(lNT);
		add(lNT1);
		add(lNRC);
		add(lNRC1);
		add(lT);
		
		setSize(600,500);
		setLayout(null);
		setTitle("check same numbers");
		setVisible(true);
	}
	
	public static void main (String[] args) {
		new checkSameNumbers();
	}
	
	public class check1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b1.getText() == "") {
				counter ++;
				b1.setText(l1.getText());
				if(counter % 2 != 0) {
					lT.setText(b1.getText());
				}
				
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b1.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b1.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}

	public class check2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b2.getText() == "") {
				counter ++;
				b2.setText(l2.getText());
				if(counter % 2 != 0) {
					lT.setText(b2.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b2.getText() == lT.getText()) {
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b2.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
		
	}
	
	public class check3 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b3.getText() == "") {
				counter ++;
				b3.setText(l3.getText());
				if(counter % 2 != 0) {
					lT.setText(b3.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b3.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b3.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check4 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b4.getText() == "") {
				counter ++;
				b4.setText(l4.getText());
				if(counter % 2 != 0) {
					lT.setText(b4.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b4.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b4.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check5 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b5.getText() == "") {
				counter ++;
				b5.setText(l5.getText());
				if(counter % 2 != 0) {
					lT.setText(b5.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b5.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b5.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check6 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b6.getText() == "") {
				counter ++;
				b6.setText(l6.getText());
				if(counter % 2 != 0) {
					lT.setText(b6.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b6.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b6.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check7 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b7.getText() == "") {
				counter ++;
				b7.setText(l7.getText());
				if(counter % 2 != 0) {
					lT.setText(b7.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b7.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b7.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check8 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b8.getText() == "") {
				counter ++;
				b8.setText(l8.getText());
				if(counter % 2 != 0) {
					lT.setText(b8.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b8.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b8.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check9 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b9.getText() == "") {
				counter ++;
				b9.setText(l9.getText());
				if(counter % 2 != 0) {
					lT.setText(b9.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b9.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b9.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (62 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check10 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b10.getText() == "") {
				counter ++;
				b10.setText(l10.getText());
				if(counter % 2 != 0) {
					lT.setText(b10.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b10.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b10.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}	
	}
	
	public class check11 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {		
			if ( b11.getText() == "") {
				counter ++;
				b11.setText(l11.getText());
				if(counter % 2 != 0) {
					lT.setText(b11.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b11.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b11.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check12 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b12.getText() == "") {
				counter ++;
				b12.setText(l12.getText());
				if(counter % 2 != 0) {
					lT.setText(b12.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b12.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b12.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check13 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b13.getText() == "") {
				counter ++;
				b13.setText(l13.getText());
				if(counter % 2 != 0) {
					lT.setText(b13.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b13.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b13.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check14 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b14.getText() == "") {
				counter ++;
				b14.setText(l14.getText());
				if(counter % 2 != 0) {
					lT.setText(b14.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b14.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b14.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check15 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b15.getText() == "") {
				counter ++;
				b15.setText(l15.getText());
				if(counter % 2 != 0) {
					lT.setText(b15.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b15.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b15.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check16 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b16.getText() == "") {
				counter ++;
				b16.setText(l16.getText());
				if(counter % 2 != 0) {
					lT.setText(b16.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b16.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b16.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check17 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b17.getText() == "") {
				counter ++;
				b17.setText(l17.getText());
				if(counter % 2 != 0) {
					lT.setText(b17.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b17.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b17.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}	
	}
	
	public class check18 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b18.getText() == "") {
				counter ++;
				b18.setText(l18.getText());
				if(counter % 2 != 0) {
					lT.setText(b18.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b18.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b18.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
						            (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
		}
	}
	
	public class check19 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b19.getText() == "") {
				counter ++;
				b19.setText(l19.getText());
				if(counter % 2 != 0) {
					lT.setText(b19.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b19.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							if (b20.getText() != "") {
								b20.setVisible(false);
							}
							winCounter ++;
							b19.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
			if (lNRC1.getText() == "10") {
				System.out.println("---------------------------------");

				start.setText("try again");
			}
		}
	}
	
	public class check20 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(lINIT.getText() != "") {
			if ( b20.getText() == "") {
				counter ++;
				b20.setText(l20.getText());
				if(counter % 2 != 0) {
					lT.setText(b20.getText());
				}
				if(counter % 2 == 0) {
						lNT1.setText(Integer.toString(counter/2));
						if(b20.getText() == lT.getText()) {
							if (b2.getText() != "") {
								b2.setVisible(false);
							}
							if (b3.getText() != "") {
								b3.setVisible(false);
							}
							if (b4.getText() != "") {
								b4.setVisible(false);
							}
							if (b5.getText() != "") {
								b5.setVisible(false);
							}
							if (b6.getText() != "") {
								b6.setVisible(false);
							}
							if (b7.getText() != "") {
								b7.setVisible(false);
							}
							if (b8.getText() != "") {
								b8.setVisible(false);
							}
							if (b9.getText() != "") {
								b9.setVisible(false);
							}
							if (b10.getText() != "") {
								b10.setVisible(false);
							}
							if (b11.getText() != "") {
								b11.setVisible(false);
							}
							if (b12.getText() != "") {
								b12.setVisible(false);
							}
							if (b13.getText() != "") {
								b13.setVisible(false);
							}
							if (b14.getText() != "") {
								b14.setVisible(false);
							}
							if (b15.getText() != "") {
								b15.setVisible(false);
							}
							if (b16.getText() != "") {
								b16.setVisible(false);
							}
							if (b17.getText() != "") {
								b17.setVisible(false);
							}
							if (b18.getText() != "") {
								b18.setVisible(false);
							}
							if (b19.getText() != "") {
								b19.setVisible(false);
							}
							if (b1.getText() != "") {
								b1.setVisible(false);
							}
							winCounter ++;
							b20.setVisible(false);
							lNRC1.setText(Integer.toString(winCounter));
							if (winCounter == 10) {
								start.setText("try again");
								counter = Integer.parseInt(lNT1.getText());
								switch ((1 <= counter && counter <= 20 ) ? 0 :
					                (21 <= counter && counter <= 25) ? 1 : 
					                (26 <= counter && counter <= 30) ? 2 : 3) {
								case 0 :{
									lNRC1.setText("winner: perfect");
									break;
								}
								case 1:{
									lNRC1.setText("winner: good enough");
									break;
								}
								case 2:{
									lNRC1.setText("winner: not bad");
									break;
								}
								case 3:{
									lNRC1.setText("winner: very bad");
									break;
								}
								}
								
							}
						}
						b1.setText("");
						b2.setText("");
						b3.setText("");
						b4.setText("");
						b5.setText("");
						b6.setText("");
						b7.setText("");
						b8.setText("");
						b9.setText("");
						b10.setText("");
						b11.setText("");
						b12.setText("");
						b13.setText("");
						b14.setText("");
						b15.setText("");
						b16.setText("");
						b17.setText("");
						b18.setText("");
						b19.setText("");
						b20.setText("");
				}
			}
		}
			if (lNRC1.getText() == "10") {
				System.out.println("---------------------------------");

				start.setText("try again");
			}
		}
	}

	public class start implements ActionListener  {

		@Override
		public void actionPerformed(ActionEvent arg0)  {
			// TODO Auto-generated method stub
			start.setText("restart");
			lNT1.setText("0");
			lNRC1.setText("0");
			b1.setVisible(true);
			b2.setVisible(true);
			b3.setVisible(true);
			b4.setVisible(true);
			b5.setVisible(true);
			b6.setVisible(true);
			b7.setVisible(true);
			b8.setVisible(true);
			b9.setVisible(true);
			b10.setVisible(true);
			b11.setVisible(true);
			b12.setVisible(true);
			b13.setVisible(true);
			b14.setVisible(true);
			b15.setVisible(true);
			b16.setVisible(true);
			b17.setVisible(true);
			b18.setVisible(true);
			b19.setVisible(true);
			b20.setVisible(true);
			
			ArrayList<String> list = new ArrayList<String>();
			
			lINIT.setText("1");
			list.add("0");
			list.add("1");
			list.add("2");
			list.add("3");
			list.add("4");
			list.add("5");
			list.add("6");
			list.add("7");
			list.add("8");
			list.add("9");
			list.add("0");
			list.add("1");
			list.add("2");
			list.add("3");
			list.add("4");
			list.add("5");
			list.add("6");
			list.add("7");
			list.add("8");
			list.add("9");
			
			Collections.shuffle(list);
			
			l1.setText(list.get(0));
			l2.setText(list.get(1));
			l3.setText(list.get(2));
			l4.setText(list.get(3));
			l5.setText(list.get(4));
			l6.setText(list.get(5));
			l7.setText(list.get(6));
			l8.setText(list.get(7));
			l9.setText(list.get(8));
			l10.setText(list.get(9));
			l11.setText(list.get(10));
			l12.setText(list.get(11));
			l13.setText(list.get(12));
			l14.setText(list.get(13));
			l15.setText(list.get(14));
			l16.setText(list.get(15));
			l17.setText(list.get(16));
			l18.setText(list.get(17));
			l19.setText(list.get(18));
			l20.setText(list.get(19));
		}
	}
	
	public class end implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			start.setText("start");
			lNT1.setText("0");
			lNRC1.setText("0");
			lINIT.setText("");
			b1.setText("");
			b2.setText("");
			b3.setText("");
			b4.setText("");
			b5.setText("");
			b6.setText("");
			b7.setText("");
			b8.setText("");
			b9.setText("");
			b10.setText("");
			b11.setText("");
			b12.setText("");
			b13.setText("");
			b14.setText("");
			b15.setText("");
			b16.setText("");
			b17.setText("");
			b18.setText("");
			b19.setText("");
			b20.setText("");
			
			b1.setVisible(true);
			b2.setVisible(true);
			b3.setVisible(true);
			b4.setVisible(true);
			b5.setVisible(true);
			b6.setVisible(true);
			b7.setVisible(true);
			b8.setVisible(true);
			b9.setVisible(true);
			b10.setVisible(true);
			b11.setVisible(true);
			b12.setVisible(true);
			b13.setVisible(true);
			b14.setVisible(true);
			b15.setVisible(true);
			b16.setVisible(true);
			b17.setVisible(true);
			b18.setVisible(true);
			b19.setVisible(true);
			b20.setVisible(true);

		}
		
	}

}
