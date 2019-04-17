import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {

		new ChuckleClicker().run();

	}

	JButton button1 = new JButton();
	JButton button2 = new JButton();

	public void run() {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();

		frame.add(panel);

		button1.addActionListener(this);
		button2.addActionListener(this);

		button1.setText("joke");
		button2.setText("punchline");

		panel.add(button1);
		panel.add(button2);

		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();

		if (button1 == pressed) {
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
		}

		if (button2 == pressed) {
			JOptionPane.showMessageDialog(null, "Because there was a chickfala on the other side.");
		}
	}

}
