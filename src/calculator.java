import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
	JButton one = new JButton();
	JButton four = new JButton();
	JButton three = new JButton();
	JButton two = new JButton();
	JLabel label = new JLabel();
	JTextField text = new JTextField();
	JTextField text1 = new JTextField();

	public static void main(String[] args) {
		calculator c = new calculator();
		c.run();
	}

	public void run() {
		JFrame frame = new JFrame();

		JPanel panel = new JPanel();

		frame.add(panel);

		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		panel.add(text);
		panel.add(text1);

		one.setText("multiplication");
		two.setText("addition");
		three.setText("division");
		four.setText("subtraction");

		frame.setTitle("calculator, fill in the blanks or else!");

		frame.setVisible(true);

		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);

		panel.add(label);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton press = (JButton) e.getSource();

		String a = text.getText();
		String b = text1.getText();
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		if (one == press) {
			label.setText((c * d) + "");
		}

	}
}