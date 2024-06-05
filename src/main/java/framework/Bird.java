package framework;

import processing.core.PApplet;

public interface Bird {
    void drawBird(PApplet applet);
    void moveBird(PApplet applet);
    void checkCollisions(Pillar p, GameCtrl gc, int ySize);
    void resetBird(float ySize);
}
