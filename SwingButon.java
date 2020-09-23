package SwingInterface;

import javax.swing.*; 

public class SwingButon {  
	public static void main(String[] args) {  
		JFrame SwingI=new JFrame("Swing Interface");//creating instance of JFrame  
          
		JButton buton=new JButton("click");//creating instance of JButton  
		buton.setBounds(100,100,100, 50);//x axis, y axis, width, height  
          
		SwingI.add(buton);//adding button in JFrame  
          
		SwingI.setSize(400, 500);//400 width and 500 height  
		SwingI.setLayout(null);//using no layout managers  
		SwingI.setVisible(true);//making the frame visible  
	}  
}  