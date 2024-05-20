package framework.programs;

import processing.core.PApplet;
import framework.ProcessingEngine;

public class Program implements ProcessingEngine
{
    private final int xSize = 500;
    private final int ySize = 800;

    Bird b = new Bird((float)xSize, (float)ySize);
    Pillar[] p = new Pillar[3];
    GameCtrl gc = new GameCtrl();
    Menus m = new Menus();

    @Override
    public void setup(PApplet applet)
    {
        applet.size(xSize,ySize);
        for(int i = 0;i<3;i++) {
            p[i]=new Pillar(i, applet, (float)xSize, (float)ySize);
        }
    }

    @Override
    public void update(PApplet applet)
    {
        if(gc.getEnd()) {
            b.moveBird(applet);
            for(int i = 0;i<3;i++) {
                p[i].movePillar();
                b.checkCollisions(p[i], gc, ySize);
            }
        }
    }

    @Override
    public void draw(PApplet applet)
    {
        applet.background(0);
        b.drawBird(applet);
        for (int i = 0; i < 3; i++) {
            p[i].drawPillar(applet, (float)ySize);
            p[i].checkPosition(gc, (float)xSize, (float)ySize);
        }
        if(gc.getEnd()) {
            m.scoreCounter(applet, gc.getScore());
        } else {
            if(gc.getIntro()) {
                m.startMenu(applet);
            } else {
                m.endMenu(applet, gc.getScore(), gc.getHighscore());
            }
        }
    }

    @Override
    public void reset(PApplet applet)
    {
        if((applet.keyPressed || applet.mousePressed) && !gc.getEnd()) {
            gc.reset();
            b.resetBird(ySize);
            for (int i = 0; i < 3; i++) {
                p[i].resetPillar((float)xSize);
            }
        }
    }
}
