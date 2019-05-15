import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Moles_Moles_Moles implements ActionListener {
	JFrame frame = new JFrame();
	 Date timeAtBegining = new Date();
	 int molesPressed = new int();
	JButton moleButton = new JButton("Mole");

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
				moleButton.addActionListener(this);
			} else {
				JButton b = new JButton();
				b.addActionListener(this);
				panel.add(b);

			}

		}
		frame.add(panel);
		frame.setVisible(true);
frame.pack();
frame.setSize(350,240);




	}

void speak(String words) {
     try {
          Runtime.getRuntime().exec("say " + words).waitFor();
     } catch (Exception e) {
          e.printStackTrace();
     }
}
	@Override
	public void actionPerformed(ActionEvent j) {
		// TODO Auto-generated method stub
		if (j.getSource() == moleButton) {
speak("Congrats you hit the right button ");
		}
		else {
			speak("Congrats you hit the wrong button...Again....Siggghhhh ");	
		}
		
		
		
		
		if(++buttonPressed==10) {
			endGame(timeAtBegining,)
		}
		
		
		
		frame.dispose();
		panel.removeAll();
run();

	}

private void endGame(Date timeAtStart, int molesWhacked){
     Date timeAtEnd = new Date();
     Date timeAtBegining = new Date();
     JOptionPane.showMessageDialog(null, "Your whack rate is "
          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
          + " moles per second.");
	}}










