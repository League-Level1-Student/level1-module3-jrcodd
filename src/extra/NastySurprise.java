package extra;

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

public class NastySurprise implements ActionListener {
	JPanel p = new JPanel();
	JFrame f = new JFrame();
	JButton b1 = new JButton("Treat");
	JButton b2 = new JButton("Trick");
void JStuff() {

	f.add(p);
	p.add(b2);
	p.add(b1);
	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.pack();
	b1.addActionListener(this);
	b2.addActionListener(this);
}

private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == b2) {
		showPictureFromTheInternet("https://cosmos-magazine.imgix.net/file/spina/photo/12095/spiderpaws_image7_pinktoed_tarantula.jpg?fit=clip&w=835");
	}
	if(e.getSource() == b1) {
		showPictureFromTheInternet("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRVCBg1kl6W0iDOlc3H8Kq7ewQnMB-BQzGqCEHhDh9dmewNCh3z3Q");
	}
	
}}