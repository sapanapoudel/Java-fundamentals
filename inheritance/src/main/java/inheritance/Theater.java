package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater implements Reviewable {

    //Instance Variables
    private String name;
    private int stars;
    private List<String> movies = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();

    //Constructor
    public Theater(String name, int stars) {
        this.name = name;
        this.stars = stars;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    //Instance Methods


    @Override
    public String toString() {
        return   "name='" + name + '\'' +
                ", stars=" + stars +
                ", movies=" + movies +
                ", reviews=" + reviews;
    }

    //addMovie in the movies list
    public void addMovie(String movieName) {
        this.movies.add(movieName);
    }

    //Remove movieName from movies list
    public void removeMovie(String moviesName) {
        this.movies.remove(moviesName);
    }

    //add Review
    public void addReview(Review review) {
        this.reviews.add(review);
        review.setMovie();
    }

    //update star
    public void updateStars() {
        int currentStar = this.stars;
        for(int i = 0; i < getReviews().size(); i++) {
            currentStar += getReviews().get(i).getStar();
        }
        currentStar /= (getReviews().size());
        this.stars = currentStar;
    }

}
