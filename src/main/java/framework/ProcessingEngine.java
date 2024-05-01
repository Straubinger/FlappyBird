package framework;

import processing.core.PApplet;

public interface ProcessingEngine
{
    void setup(PApplet applet);
    void update(PApplet applet, double seconds);
    void draw(PApplet appllet);
}
