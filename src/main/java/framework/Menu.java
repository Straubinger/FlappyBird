package framework;

import processing.core.PApplet;

public interface Menu {
    void startMenu(PApplet applet);
    void endMenu(PApplet applet, int score, int highscore);
    void scoreCounter(PApplet applet, int score);
}
