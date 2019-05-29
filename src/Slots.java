import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slots implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
public static void main(String[] args) {
	
	Slots slot = new Slots();
	
	slot.run();

	
}


public void run() {
	
	
	frame.add(panel);
	panel.add(button);
	frame.setVisible(true);
	
try {
JLabel label =	createLabelImage("cherry.jpg");
panel.add(label);
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	
	e.printStackTrace();
}
	
try {
	JLabel label1 =createLabelImage("lime .png");
	panel.add(label1);
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	
try {
	JLabel label2 =	createLabelImage("orange.png");

panel.add(label2);
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


button.setText("Press for a chance to win it all!");

//frame.getDefaultCloseOperation(frame.EXIT_ON_CLOSE);

button.addActionListener((ActionListener) this);


Random random = new Random();
int reel1 = random.nextInt(3);
try {
if(reel1 ==1) {
	JLabel label1 =createLabelImage("lime .png");
	panel.add(label1);
	
}

if(reel1 ==2) {
	JLabel label1 =createLabelImage("orange .png");
	panel.add(label1);
	
}


if(reel1 ==3) {
	JLabel label1 =createLabelImage("cherry .jpg");
	panel.add(label1);
	
}
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}












Random random1 = new Random();
int reel2 = random1.nextInt(3);
try {
if(reel2 ==1) {
	JLabel label1 =createLabelImage("lime .png");
	panel.add(label1);
	
}

if(reel2 ==2) {
	JLabel label1 =createLabelImage("orange .png");
	panel.add(label1);
	
}


if(reel2 ==3) {
	JLabel label1 =createLabelImage("cherry .jpg");
	panel.add(label1);
	
}
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}










Random random2 = new Random();
int reel3 = random2.nextInt(3);
try {
if(reel3 ==1) {
	JLabel label1;

		label1 = createLabelImage("lime .png");
	
	panel.add(label1);
	
}

if(reel3 ==2) {
	JLabel label1 =createLabelImage("orange .png");
	panel.add(label1);
	
}


if(reel3 ==3) {
	JLabel label1 =createLabelImage("cherry .jpg");
	panel.add(label1);
	
}
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

























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
