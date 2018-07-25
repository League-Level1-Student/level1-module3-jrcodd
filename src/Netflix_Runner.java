
public class Netflix_Runner {
	;
	public static void main(String[] args) {
		NetflixQueue nq = new NetflixQueue();
		Movie dino = new Movie("Jurassic planet", 1);
		Movie phone1 = new Movie("IPhone", 3);
		Movie phone2 = new Movie("IPhone 2", 2);
		Movie phone3 = new Movie("IPhone 3", 1);
		Movie house = new Movie("the house", 4);
		;
		nq.addMovie(dino);
		nq.addMovie(house);
		nq.addMovie(phone3);
		nq.addMovie(phone2);
		nq.addMovie(phone1);
		nq.sortMoviesByRating();
		nq.printMovies();
		System.out.println("the best movie is " +nq.getBestMovie());
		System.out.println("the second best movie is " + nq.getSecondBestMovie());
	}
}
