import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
public class GUI {
	
	//create label
	public static JLabel label = new JLabel("CLick Count: " + EndingListener.counter);
	
	public static void main(String[] args) {
		
		//create JFrame and assign properties
		JFrame window = new JFrame("GUI");
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setVisible(true);
		
		//get contentpane and assign background color
		window.getContentPane().setBackground(Color.yellow);
		
		//layout manager
		window.setLayout(new BorderLayout());
		
		
		
		
		
		//Create button, assign properties, and add to window
		JButton button = new JButton("Click Me");
		button.setSize(100, 40);
		button.setBackground(Color.cyan);
		window.add(button, BorderLayout.EAST);
		
		//instantiate listener object
		EndingListener buttonEar = new EndingListener();
		
		//add listener object to button
		button.addActionListener(buttonEar);
		
		//add label to window
		window.add(label, BorderLayout.WEST);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.green);
		panel.setLayout(new FlowLayout());
		window.add(panel);
		
		JMenu menu = new JMenu("Menu - Drinks");
		panel.add(menu);
		
		JMenu menuItem = new JMenu("Lemonade");
		panel.add(menuItem);
	}
}
