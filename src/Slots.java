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

	JLabel label;

	JLabel label1;

	JLabel label2;

	public static void main(String[] args) {

		Slots slot = new Slots();

		slot.run();

	}

	public void run() {

		frame.add(panel);
		panel.add(button);
		frame.setVisible(true);

		button.setText("Press for a chance to win it all!");

		label = createLabelImage("cherry.jpg");

		label1 = createLabelImage("lime.png");

		label2 = createLabelImage("orange.png");

		panel.add(label);
		panel.add(label1);
		panel.add(label2);
		frame.pack();
//frame.getDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		button.addActionListener((ActionListener) this);

	}

	private JLabel createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
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
		panel.remove(label);
		Random random1 = new Random();

		int reel2 = random1.nextInt(3);

		if (reel2 == 1) {
			label = createLabelImage("lime.png");

		}

		if (reel2 == 2) {
			label = createLabelImage("orange.png");

		}

		if (reel2 == 0) {
			label = createLabelImage("cherry.jpg");

		}
		panel.add(label);
		panel.remove(label1);
		Random random = new Random();
		int reel1 = random1.nextInt(3);

		if (reel2 == 1) {
			label1 = createLabelImage("lime.png");

		}

		if (reel2 == 2) {
			label1 = createLabelImage("orange.png");

		}

		if (reel2 == 0) {
			label1 = createLabelImage("cherry.jpg");

		}
		panel.add(label1);
		panel.remove(label2);
		Random random2 = new Random();
		int reel3 = random2.nextInt(3);

		if (reel3 == 1) {

			label2 = createLabelImage("lime.png");

		}

		if (reel3 == 2) {
			label2 = createLabelImage("orange.png");

		}

		if (reel3 == 0) {
			label2 = createLabelImage("cherry.jpg");

		}
		panel.add(label2);
		frame.pack();

	}
}
