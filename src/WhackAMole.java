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

	public static void main(String[] args) {
		
		WhackAMole wm = new WhackAMole();
		wm.drawButtons(24);
		wm.JStuff();
	}

	void JStuff() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.add(p);
		f.setSize(300, 400);
		drawButtons(24);
		for (int i = 0; i < 24; i++) {
			JButton b = new JButton();
					b.addActionListener(this);
			
			if(i == randomNum) {
				b.setText( "mole");
			}
			
			p.add(b);
		}
		f.setVisible(true);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}

	void drawButtons(int num) {
		 randomNum = r.nextInt(num);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//drawButtons(24);
	}
}
