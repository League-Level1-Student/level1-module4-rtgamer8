import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slots {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();


	
public static void main(String[] args) {
	Slots slots = new Slots();
	
	
	
}

private JLabel createLabelImage(String chicken) throws MalformedURLException{
    URL imageURL = getClass().getResource(chicken);
if (imageURL == null){
	System.err.println("Could not find image " + chicken);
	return new JLabel();
}
Icon icon = new ImageIcon();
JLabel imageLabel = new JLabel(icon);
return imageLabel;
    

public void run() {
	
	
	frame.add(panel);
	
	
	
	
	
}




}











}