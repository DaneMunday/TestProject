import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndingListener implements ActionListener {
	
	public static int counter = 0;
	
	public void actionPerformed(ActionEvent e) {
		
		//increase count by 1 per click
		counter += 1;
		
		//update label text for each click
		GUI.label.setText("Click Count: " + counter);
	}
}
