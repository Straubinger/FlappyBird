package framework;

import processing.core.PApplet;

public interface Pillar {
    float getXPos();
    float getOpening();
    void drawPillar(PApplet applet, float ySize);
    void movePillar();
    void checkPosition(GameCtrl gc, float xSize, float ySize);
    void resetPillar(float xSize);
}
