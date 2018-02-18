
public class MovieNetflix {
	public static void main(String[] args) {
		Movie a = new Movie("blagh the blah blahed" , 4);
		Movie b = new Movie("THE MOST AMAZING MOVIE " , -50);
		Movie c = new Movie("The glass class" , 4);
		Movie d = new Movie("Matt" , 2);
		Movie e = new Movie("LotAP" , 5);
		
		System.out.print(d.getTicketPrice());
		
		
		
		Netflix n = new Netflix();
		
		n.addMovie(a);
		n.addMovie(b);
		n.addMovie(c);
		n.addMovie(d);
		n.addMovie(e);
		
		n.printMovies();
		
		n.sortMoviesByRating();
		
		n.getBestMovie();
	}
}
