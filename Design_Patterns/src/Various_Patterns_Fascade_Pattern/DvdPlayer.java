package Various_Patterns_Fascade_Pattern;

//Subsystem class - DVD player
class DvdPlayer {
 public void on() {
     System.out.println("DVD player is ON");
 }

 public void play(String movie) {
     System.out.println("Playing movie: " + movie);
 }
}

//Subsystem class - Projector
class Projector {
 public void on() {
     System.out.println("Projector is ON");
 }

 public void setInput(DvdPlayer dvdPlayer) {
     System.out.println("Setting input to DVD player");
 }
}

//Subsystem class - Sound system
class SoundSystem {
 public void on() {
     System.out.println("Sound system is ON");
 }

 public void setVolume(int volume) {
     System.out.println("Setting volume to " + volume);
 }
}
