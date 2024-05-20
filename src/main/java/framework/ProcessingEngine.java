package framework;

import processing.core.PApplet;

public interface ProcessingEngine
{
    void setup(PApplet applet);
    void update(PApplet applet);
    void draw(PApplet applet);
    void reset(PApplet applet);
}
