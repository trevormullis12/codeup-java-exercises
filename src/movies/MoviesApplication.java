package movies;
import org.w3c.dom.ls.LSOutput;
import util.Input;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        MoviesArray movies = new MoviesArray();
        Movie[] allMovies = movies.findAll();
        sortMovies(allMovies);
    }

    public static void sortMovies(Movie[] movies) {
        Input input = new Input();
        System.out.print("\n\nWhat would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice: ");
        int choice = input.getInt();
        String category = "";
        switch (choice) {
            case 0:
                category = "quit";
                break;
            case 1:
                category = "all";
                break;
            case 2:
                category = "animated";
                break;
            case 3:
                category = "drama";
                break;
            case 4:
                category = "horror";
                break;
            case 5:
                category = "scifi";
                break;
            default:
                sortMovies(movies);
                break;
        }

        for(int i = 0; i < movies.length; i++) {
            if(category == movies[i].getCategory() || category == "all")
                System.out.println(movies[i].getName() +"  --  "+ movies[i].getCategory());
        }
        if(category != "quit")
            sortMovies(movies);
    }
}
