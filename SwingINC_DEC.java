package SwingInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingINC_DEC extends JFrame {
	int i=0;
	ActionEvent e;
	JTextField tf; JLabel l; JButton b, b1;  
    SwingINC_DEC(){    
        l=new JLabel();  
        l.setBounds(145,100, 250,20);      
        b=new JButton("Inc");  
        b.setBounds(50,50,95,30);  
        b.addActionListener(new INC());  
        b1=new JButton("Dec");  
        b1.setBounds(150,50,95,30);  
        b1.addActionListener(new DEC());
        add(b);add(b1);add(l);    
        setSize(300,200);  
        setLayout(null);  
        setVisible(true); 
        setTitle("Swing Prac");
    }
	
    public static void main(String[] args) {  
        new SwingINC_DEC();  
    } 
    
    public  class   INC implements   ActionListener{

    	@Override
    	public void actionPerformed(ActionEvent arg0) {
    		// TODO Auto-generated method stub
    		try{   
            	i++;
            	String j = Integer.toString(i);
            	l.setText(j);
            }catch(Exception ex){System.out.println(ex);} 
    	}	
    }
    
public  class   DEC implements   ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try{   
        	i--;
        	String j = Integer.toString(i);
        	l.setText(j);
        }catch(Exception ex){System.out.println(ex);} 
	}	
}
}