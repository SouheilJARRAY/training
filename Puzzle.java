package SwingInterface;

import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Puzzle extends JFrame {
	
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, start_next, end; 
	
	Puzzle(){
		b1= new JButton();
		b1.setBounds(50,50,50,50);
		b1.addActionListener(new move1());
		
		b2= new JButton();
		b2.setBounds(110,50,50,50);
		b2.addActionListener(new move2());
		
		b3= new JButton();
		b3.setBounds(170,50,50,50);
		b3.addActionListener(new move3());
		
		b4= new JButton();
		b4.setBounds(50,110,50,50);
		b4.addActionListener(new move4());
		
		b5= new JButton();
		b5.setBounds(110,110,50,50);
		b5.addActionListener(new move5());
		
		b6= new JButton();
		b6.setBounds(170,110,50,50);
		b6.addActionListener(new move6());
		
		b7= new JButton();
		b7.setBounds(50,170,50,50);
		b7.addActionListener(new move7());
		
		b8= new JButton();
		b8.setBounds(110,170,50,50);
		b8.addActionListener(new move8());
		
		b9= new JButton();
		b9.setBounds(170,170,50,50);
		b9.addActionListener(new move9());
		
		start_next= new JButton("start");
		start_next.setBounds(50,230,70,50);
		start_next.addActionListener(new randomize());
		
		end= new JButton("end");
		end.setBounds(150,230,70,50);
		end.addActionListener(new end());
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(start_next);
		add(end);
		
		setSize(300,400);
		setLayout(null);
		setTitle("PUZZLE");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Puzzle();
	}
	
	public class move1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if (b1.getText() != "") {
				if (b2.getText() == "") {
					b2.setText(b1.getText());
					b1.setText("");
				}
			
				if (b4.getText() == "") {
					b4.setText(b1.getText());
					b1.setText("");
				}
			}
			//b5.setVisible(false);
		}		
	}
	
	public class move2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if (b2.getText() != "") {
				if (b1.getText() == "") {
					b1.setText(b2.getText());
					b2.setText("");
				}
			
				if (b3.getText() == "") {
					b3.setText(b2.getText());
					b2.setText("");
				}
			
				if (b5.getText() == "") {
					b5.setText(b2.getText());
					b2.setText("");
				}
			}
		}		
	}
	
	public class move3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if (b3.getText() != "") {
				if (b2.getText() == "") {
					b2.setText(b3.getText());
					b3.setText("");
				}
			
				if (b6.getText() == "") {
					b6.setText(b3.getText());
					b3.setText("");
				}
			}
		}		
	}
	
	public class move4 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if (b4.getText() != "") {
				if (b1.getText() == "") {
					b1.setText(b4.getText());
					b4.setText("");
				}
			
				if (b7.getText() == "") {
					b7.setText(b4.getText());
					b4.setText("");
				}
			
				if (b5.getText() == "") {
					b5.setText(b4.getText());
					b4.setText("");
				}
			}	
		}	
	}
	
	public class move5 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if (b5.getText() != "") {
				if (b2.getText() == "") {
					b2.setText(b5.getText());
					b5.setText("");
				}
			
				if (b4.getText() == "") {
					b4.setText(b5.getText());
					b5.setText("");
				}
			
				if (b6.getText() == "") {
					b6.setText(b5.getText());
					b5.setText("");
				}
			
				if (b8.getText() == "") {
					b8.setText(b5.getText());
					b5.setText("");
				}
			}
		}		
	}
	
	public class move6 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if (b6.getText() != "") {
				if (b3.getText() == "") {
					b3.setText(b6.getText());
					b6.setText("");
				}
			
				if (b9.getText() == "") {
					b9.setText(b6.getText());
					b6.setText("");
				}
			
				if (b5.getText() == "") {
					b5.setText(b6.getText());
					b6.setText("");
				}
			}		
		}
	}
	
	public class move7 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if (b7.getText() != "") {
				if (b4.getText() == "") {
					b4.setText(b7.getText());
					b7.setText("");
				}
			
				if (b8.getText() == "") {
					b8.setText(b7.getText());
					b7.setText("");
				}
			}	
		}	
	}
	
	public class move8 implements ActionListener{
		

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			// TODO Auto-generated method stub
			if (b8.getText() != "") {
				if (b7.getText() == "") {
					b7.setText(b8.getText());
					b8.setText("");
				}
			
				if (b9.getText() == "") {
					b9.setText(b8.getText());
					b8.setText("");
				}
			
				if (b5.getText() == "") {
					b5.setText(b8.getText());
					b8.setText("");
				}
			}	
		}	
	}
	
	public class move9 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if (b9.getText() != "") {
				if (b6.getText() == "") {
					b6.setText(b9.getText());
					b9.setText("");
				}
			
				if (b8.getText() == "") {
					b8.setText(b9.getText());
					b9.setText("");
				}
			}
		}		
	}
	
	public class randomize implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			ArrayList<String> list = new ArrayList<String>();
			list.add("1");
			list.add("2");
			list.add("3");
			list.add("4");
			list.add("5");
			list.add("6");
			list.add("7");
			list.add("8");
			
			Collections.shuffle(list);
			
			b1.setText(list.get(0));
			b2.setText(list.get(1));
			b3.setText(list.get(2));
			b4.setText(list.get(3));
			b5.setText(list.get(4));
			b6.setText(list.get(5));
			b7.setText(list.get(6));
			b8.setText(list.get(7));
			start_next.setText("next");
		}
		
	}
	
	public class end implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			b1.setText("");
			b2.setText("");
			b3.setText("");
			b4.setText("");
			b5.setText("");
			b6.setText("");
			b7.setText("");
			b8.setText("");
			b9.setText("");
			start_next.setText("start");
			//b5.setVisible(true);
		}
		
	}

}
