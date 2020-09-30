package MT;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

class LookAndFeelMenu extends JMenu implements ActionListener {
    
    public static final String LOOK_AND_FEEL_1 = 
                    "javax.swing.plaf.nimbus.NimbusLookAndFeel";
    public static final String LOOK_AND_FEEL_2 = 
                    "javax.swing.plaf.metal.MetalLookAndFeel";
    public static final String LOOK_AND_FEEL_3 = 
                    "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
    
    public LookAndFeelMenu() {
        super("Look and feel");
        setMnemonic('L');
        
        JMenuItem nimbus = new JMenuItem("Nimbus");
        nimbus.setMnemonic('N');
        nimbus.addActionListener(this);
        this.add(nimbus);   

        JMenuItem metal = new JMenuItem("Metal");
        metal.setMnemonic('M');
        metal.addActionListener(this);
        this.add(metal);   
        
        JMenuItem windows = new JMenuItem("Windows");
        windows.setMnemonic('W');
        windows.addActionListener(this);
        this.add(windows);   
    }
    
    public void actionPerformed(ActionEvent event) {
        String newLook;
       
        switch( event.getActionCommand() ) {
            case "Nimbus":
                newLook = LOOK_AND_FEEL_1;
                break;
            case "Metal":
                newLook = LOOK_AND_FEEL_2;
                break;
            default:
                newLook = LOOK_AND_FEEL_3;
        }
               
        try {
            // On change le look and feel en cours
            UIManager.setLookAndFeel( newLook );
            // On applique ce nouveau look à la fenêtre intégral 
            SwingUtilities.updateComponentTreeUI( this.getTopLevelAncestor() );
        } catch( Exception exception ) { 
            exception.printStackTrace(); 
        }
    }
}

public class AllSwing extends JFrame {

    public AllSwing() {
        super( "Look'n feel sample" );
        this.setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        this.setSize( 600, 400 );

        // --- Mise en place d'une barre de menu ---
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu( "File" );
        file.setMnemonic( 'f' );
        JMenuItem open = new JMenuItem( "Open" );
        open.setMnemonic( 'o' );
        file.add( open );
        menuBar.add( file );
        
        menuBar.add(new LookAndFeelMenu());
        
        this.setJMenuBar( menuBar );
        
        // --- On met quelques composants visuels dans la fenêtre ---
        JPanel contentPane = (JPanel) this.getContentPane();
        
        JToolBar toolBar = new JToolBar();
        toolBar.add( new JButton( "Click me") );
        toolBar.add( new JTextField( "Edit me") );
        toolBar.add( new JCheckBox( "Check me") );
        contentPane.add( toolBar, BorderLayout.NORTH );
        
        JScrollPane scrollPane = new JScrollPane( new JTree() );
        scrollPane.setPreferredSize( new Dimension( 140, 0 ) );
        contentPane.add( scrollPane, BorderLayout.WEST );
        
        contentPane.add( new JScrollPane( new JTextArea() ), BorderLayout.CENTER );
        
        contentPane.add(  new JLabel( "A status bar" ), BorderLayout.SOUTH );
    }

    public static void main( String[] args ) {
    	AllSwing frame = new AllSwing();
        frame.setVisible( true );
    }
}