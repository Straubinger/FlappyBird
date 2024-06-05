package framework.Impl;

import framework.Bird;
import framework.GameCtrl;
import framework.Pillar;
import processing.core.PApplet;

public class BirdImpl implements Bird {

    private float xPos;
    private float yPos;
    private float ySpeed;

    // Constructor
    public BirdImpl(float xSize, float ySize)
    {
        xPos = xSize / 2;
        yPos = ySize / 2;
    }

    // Draws the bird
    @Override
    public void drawBird(PApplet applet)
    {
        applet.stroke(255);
        applet.noFill();
        applet.strokeWeight(2);
        applet.ellipse(xPos,yPos,20,20);
    }

    // Makes the bird move up or down
    @Override
    public void moveBird(PApplet applet)
    {
        if(applet.keyPressed || applet.mousePressed) {
            ySpeed=-10;
        }
        ySpeed+=0.4F;
        yPos+=ySpeed;
    }

    // Checks if the bird collides with either the top, the bottom or a pillar
    @Override
    public void checkCollisions(Pillar p, GameCtrl gc, int ySize)
    {
        if(yPos>ySize || yPos<0) {
            gc.setEnd(false);
        }
        for(int i = 0;i<3;i++) {
            if((xPos<p.getXPos()+10&&xPos>p.getXPos()-10)&&(yPos<p.getOpening()-100||yPos>p.getOpening()+100))
            {
                gc.setEnd(false);
            }
        }
    }

    // Resets the position of the bird after collision
    @Override
    public void resetBird(float ySize)
    {
        yPos = ySize / 2;
    }
}
