import java.util.Random;

public class generateRandomLetter {
	public static void main(String[] args) {
		char currentLetter;

		currentLetter = generateRandomLetter();

		char generateRandomLetter() {
		      Random r = new Random();
		      return (char) (r.nextInt(26) + 'a');
		}
	
	}}