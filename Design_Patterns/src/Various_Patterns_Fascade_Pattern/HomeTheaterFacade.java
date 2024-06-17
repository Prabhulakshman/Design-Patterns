package Various_Patterns_Fascade_Pattern;

//Facade class
class HomeTheaterFacade {
 private DvdPlayer dvdPlayer;
 private Projector projector;
 private SoundSystem soundSystem;

 public HomeTheaterFacade(DvdPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
     this.dvdPlayer = dvdPlayer;
     this.projector = projector;
     this.soundSystem = soundSystem;
 }

 public void watchMovie(String movie, int volume) {
     System.out.println("Get ready to watch a movie...");
     dvdPlayer.on();
     projector.on();
     projector.setInput(dvdPlayer);
     soundSystem.on();
     soundSystem.setVolume(volume);
     dvdPlayer.play(movie);
 }

 public void endMovie() {
     System.out.println("Shutting down the home theater...");
     dvdPlayer.on();
     projector.on();
     soundSystem.on();
 }
}
