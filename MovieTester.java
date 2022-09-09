package Movies;

public class MovieTester {
    public static void main(String[] args) {
        Movies aliceWLO = new Movies();

        aliceWLO.setTitle("Alice in Wonderland");
        aliceWLO.setYear(2010);
        aliceWLO.setDirector("Tim Burton");
        aliceWLO.setLead("Mia Wasikowska and Johnny Depp");

        String name = aliceWLO.getTitle();
        System.out.println(aliceWLO);
        aliceWLO.writeOutput();

    }
}
