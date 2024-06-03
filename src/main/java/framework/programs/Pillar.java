package framework.programs;

import processing.core.PApplet;
import java.util.Random;

public class Pillar
{
    private float xPos;
    private float opening;
    private boolean cashed = false;

    Random r = new Random();

    // Constructor
    public Pillar(int i, float xSize, float ySize)
    {
        float random = r.nextFloat() * ((ySize-200) - 0) + 0;
        xPos = 100+(i*(xSize-100)/2);
        opening = random+100;
    }

    // Getters
    public float getxPos()
    {
        return xPos;
    }

    public float getOpening()
    {
        return opening;
    }

    // Methods
    public void drawPillar(PApplet applet, float ySize)
    {
        applet.line(xPos,0,xPos,opening-100);
        applet.line(xPos,opening+100,xPos,ySize);
    }

    public void movePillar()
    {
        xPos-=3;
    }

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

    public void resetPillar(float xSize)
    {
        xPos += xSize+50;
        cashed = false;
    }
}
