import java.util.ArrayList;
import java.util.List;

public class Movies {
    private List<Movie> movies;

    public Movies() {
        movies = new ArrayList<>();
        // adicionando filmes à lista
        movies.add(new Movie("Pulp Fiction", "Quentin Tarantino", 54, 1994));
        movies.add(new Movie("2001: A Space Odyssey", "Stanley Kubrick", 149, 1968));
        movies.add(new Movie("The Godfather", "Francis Ford Coppola", 175, 1972));
        movies.add(new Movie("Inception", "Christopher Nolan", 148, 2010));
        movies.add(new Movie("The Shawshank Redemption", "Frank Darabont", 142, 1994));
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
