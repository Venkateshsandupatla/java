package Oop5.Interface;

public class nicecar {
    private engine Engine;
    private mediaplayer player;
    private Brake brake;

    // default constructor
    public nicecar() {
        Engine = new petrolengine();
        player = new cdplayer();
        brake = new Discbrake();

    }

    public void start() {
        Engine.start();
    }

    public void acc() {
        Engine.acc();
    }

    public void stop() {
        Engine.stop();
    }

    public void musicstart() {
        player.start();
    }

    public void brake() {
        brake.brake();
    }

    public void musicstop() {
        player.stop();
    }

    public void musicupgrade() {
        player = new bluetoothplayer();
    }

    public void engineupgrade() {
        Engine = new electricengine();
    }

    public void upgradebrake() {
        brake = new absbrake();
    }

}