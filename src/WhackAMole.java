import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	Random r = new Random();
	int randomNum;
	WhackAMole wm;
	JFrame f;
	JPanel p;

	public static void main(String[] args) {
		WhackAMole wm = new WhackAMole();

		wm.drawButtons(24);

	}

	// void JStuff() {
	// JFrame f = new JFrame();
	// JPanel p = new JPanel();

	// WhackAMole wm = new WhackAMole();
	// wm.drawButtons(24);
	/*
	 * f.add(p); f.setSize(500, 700); f.setVisible(true);
	 * f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 */
	// }

	void drawButtons(int num) {

		f = new JFrame();
		p = new JPanel();
		f.add(p);
		f.setSize(500, 700);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		randomNum = r.nextInt(num);

		for (int i = 0; i < 24; i++) {
			JButton b = new JButton();
			b.addActionListener(this);
			p.add(b);
			if (i == randomNum) {
				b.setText("mole");
			}
			
		}
	}

	void mole(int total) {

		f.dispose();
		drawButtons(total);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mole(24);
	}
}
