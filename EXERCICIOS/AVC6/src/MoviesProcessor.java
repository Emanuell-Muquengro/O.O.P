import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Comparator;

public class MoviesProcessor {

    public static void main(String[] args) {
        Movies movies = new Movies(); // Supondo que você tenha uma instância de Movies

        // Conte a quantidade de filmes existentes
        long totalMovies = movies.getMovies().stream().count();
        System.out.println("Quantidade total de filmes: " + totalMovies);

        // Conte a quantidade de filmes de "Stanley Kubrick"
        long kubrickMoviesCount = movies.getMovies().stream()
                .filter(movie -> movie.getDirector().equals("Stanley Kubrick"))
                .count();
        System.out.println("Quantidade de filmes de Stanley Kubrick: " + kubrickMoviesCount);

        // Obtenha uma lista de filmes com duração menor que 100 minutos
        List<Movie> shortMovies = movies.getMovies().stream()
                .filter(movie -> movie.getDuration() < 100)
                .collect(Collectors.toList());
        System.out.println("Filmes com duração menor que 100 minutos: ");
        shortMovies.forEach(System.out::println);

        // Obtenha um mapa contendo diretores e uma lista de seus filmes
        Map<String, List<Movie>> moviesByDirector = movies.getMovies().stream()
                .collect(Collectors.groupingBy(Movie::getDirector));
        System.out.println("\nMapa de diretores e seus filmes: ");
        moviesByDirector.forEach((director, movieList) -> {
            System.out.println(director + ": ");
            movieList.forEach(System.out::println);
        });

        // Descubra qual o filme mais longo e o mais curto
        Movie longestMovie = movies.getMovies().stream()
                .max(Comparator.comparingInt(Movie::getDuration))
                .orElse(null);
        Movie shortestMovie = movies.getMovies().stream()
                .min(Comparator.comparingInt(Movie::getDuration))
                .orElse(null);
        System.out.println("\nFilme mais longo: ");
        System.out.println(longestMovie);
        System.out.println("Filme mais curto: ");
        System.out.println(shortestMovie);

        // Coloque os filmes em ordem cronológica
        List<Movie> moviesInChronologicalOrder = movies.getMovies().stream()
                .sorted(Comparator.comparingInt(Movie::getReleaseYear))
                .collect(Collectors.toList());
        System.out.println("\nFilmes em ordem cronológica: ");
        moviesInChronologicalOrder.forEach(System.out::println);
    }
}
