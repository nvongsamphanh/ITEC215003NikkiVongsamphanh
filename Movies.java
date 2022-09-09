package Movies;
/**
 * class: Movies
 * date:September 08, 2022
 * instruction of this program:
 * (1) attributes - title, released year, name of the director, name of leading role
 * (2) constructors - no argument constructor which takes from the constructor
 * with four parameters.
 * (3) getters and setters
 * (4) toString method to display each information about a movie. It will display
 *     each information line by line.
 *     Title of Movie: ____
 *     Released Year:  ___
 *     Director: ______
 *     Leading role: ______
 */
public class Movies {

    //attributes go below here
    private String title;

    private int year;
    private String director;

    private String lead;

    public String getTitle() {

        return title;
    }

    public void setTitle(String newTitle) {

        this.title = newTitle;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String newDirector) {
        this.director = newDirector;
    }

    public String getLead(String newLead) {
        return lead;
    }

    public void setLead(String newLead) {
        this.lead = newLead;
    }

    public void writeOutput() {
        System.out.printf("Title: %s\nYear Released: %d\n%s" + " Director: %s\n%s" + "Lead Role:", title, year, director, lead);
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" + "Year Released: " + year + "\n" + "Director: " +
                director + "\n" + "Lead Role: " + lead;
    }
}
