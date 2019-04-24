import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Moles_Moles_Moles implements ActionListener {
	JFrame frame = new JFrame();
	JButton moleButton = new JButton(
			"MOlE PLZ HIT ME FIRST IF YOU WWANT TO DO GOOD IN THIS GAME!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ");

	JPanel panel = new JPanel();

	public static void main(String[] args) {

		Moles_Moles_Moles m = new Moles_Moles_Moles();

		m.run();

	}

	public void run() {
		int molePos = new Random().nextInt(24);
		moleButton.setVisible(true);
		for (int i = 0; i < 24; i++) {
			if (i == molePos) {
				panel.add(moleButton);
			} else {
				JButton b = new JButton();
				b.addActionListener(this);
				panel.add(b);
			}

		}
		frame.add(panel);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == moleButton) {

		}
	}
}
