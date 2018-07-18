import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class twitter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JButton button = new JButton();
	JTextField field = new JTextField(15);
	JTextPane pane;
	JScrollPane scroll;

	public static void main(String[] args) {
		twitter t = new twitter();
		t.JStuff();
	}

	void JStuff() {
		pane = new JTextPane();
		scroll = new JScrollPane(pane);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(p1, BorderLayout.NORTH);
		frame.add(p2, BorderLayout.SOUTH);
		p1.add(button);
		p1.add(field);
		frame.setVisible(true);
		button.setBackground(new Color(000000));
		button.setOpaque(true);
		button.setText("get tweet");
		scroll.setPreferredSize(new Dimension(300, 500));
		p2.add(scroll);
		pane.setEditable(false);
		pane.setBackground(new Color(445566));
		pane.setOpaque(true);
		p1.setBackground(Color.BLUE);
		p2.setBackground(Color.BLUE);
		button.addActionListener(this);
		frame.pack();

	}

	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();

		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			String results = "";
			for (int i = 0; i < result.getCount() - 1; i++) {

				results += result.getTweets().get(i).getText() + "\n";
			}
			return results;
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		pane.setText(getLatestTweet(field.getText()));
	}

}
