package extra;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	JLabel label = new JLabel();
	char currentLetter;
	JFrame frame = new JFrame();

	TypingTutor() {

		frame.add(label);
		frame.setName("Type or Die");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");

		label.setFont(label.getFont().deriveFont(300.0f));
		label.setHorizontalAlignment(JLabel.CENTER);

		frame.addKeyListener(this);

		frame.pack();
	}

	public static void main(String[] args) {

		TypingTutor tutor = new TypingTutor();

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == currentLetter) {
			System.out.println("you are correct");

			currentLetter = generateRandomLetter();
			label.setText(currentLetter + "");

			frame.setBackground(Color.GREEN);

		}

		else {
			System.out.println("you are wrong");
			currentLetter = generateRandomLetter();
			label.setText(currentLetter + "");
			frame.setBackground(Color.red);
		}
		frame.pack();
		System.out.println("You Typed: " + e.getKeyChar());

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}