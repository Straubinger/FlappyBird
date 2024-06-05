package framework.Impl;

import framework.GameCtrl;
import framework.Pillar;
import processing.core.PApplet;

import java.util.Random;

public class PillarImpl implements Pillar {

    private float xPos;
    private float opening;
    private boolean cashed = false;

    Random r = new Random();

    // Constructor
    public PillarImpl(int i, float xSize, float ySize)
    {
        float random = r.nextFloat() * ((ySize-200) - 0) + 0;
        xPos = 100+(i*(xSize-100)/2);
        opening = random+100;
    }

    // Getters
    @Override
    public float getXPos()
    {
        return xPos;
    }

    @Override
    public float getOpening()
    {
        return opening;
    }

    // Draws 3 pillars
    @Override
    public void drawPillar(PApplet applet, float ySize)
    {
        applet.line(xPos,0,xPos,opening-100);
        applet.line(xPos,opening+100,xPos,ySize);
    }

    // Moves the pillars
    @Override
    public void movePillar()
    {
        xPos-=3;
    }

    // Checks the position of the pillars
    @Override
    public void checkPosition(GameCtrl gc, float xSize, float ySize)
    {
        float random = r.nextFloat() * ((ySize-200) - 0) + 0;
        if(xPos<0) {
            xPos+=(((xSize+100)/3)*3);
            opening = random+100;
            cashed=false;
        }
        if(xPos<(xSize/2)&& !cashed) {
            cashed=true;
            gc.setScore(gc.getScore() + 1);
        }
    }

    // Resets the pillars after collision
    @Override
    public void resetPillar(float xSize)
    {
        xPos += xSize+50;
        cashed = false;
    }
}
