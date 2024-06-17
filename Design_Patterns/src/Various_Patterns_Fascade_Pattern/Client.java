package Various_Patterns_Fascade_Pattern;

public class Client {
    public static void main(String[] args) {
        // Creating subsystem components
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();

        // Creating the facade
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

        // Using the facade to watch a movie
        homeTheaterFacade.watchMovie("The Matrix", 8);

        // Using the facade to end the movie
        homeTheaterFacade.endMovie();
    }
}
