import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slots implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
public static void main(String[] args) {
	
	slots slot = new slots();
	
	slot.run();

	
}


public void run() {
	
	
	frame.add(panel);
	panel.add(button);
	frame.setVisible(true);
	
try {
	createLabelImage("cherry.jpg");
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
try {
	createLabelImage("lime .png");
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	
try {
	createLabelImage("orange.png");
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


button.setText("Press for a chance to win it all!");

//frame.getDefaultCloseOperation(frame.EXIT_ON_CLOSE);

button.addActionListener((ActionListener) this);



frame.pack();
	

}

private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	
}

}
