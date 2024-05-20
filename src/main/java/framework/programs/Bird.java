package framework.programs;

import processing.core.PApplet;

public class Bird
{
    private float xPos;
    private float yPos;
    private float ySpeed;

    public Bird(float xSize, float ySize)
    {
        xPos = xSize / 2;
        yPos = ySize / 2;
    }

    public void drawBird(PApplet applet)
    {
        applet.stroke(255);
        applet.noFill();
        applet.strokeWeight(2);
        applet.ellipse(xPos,yPos,20,20);
    }

    public void moveBird(PApplet applet)
    {
        if(applet.keyPressed || applet.mousePressed) {
            ySpeed=-10;
        }
        ySpeed+=0.4F;
        yPos+=ySpeed;
    }

    public void checkCollisions(Pillar p, GameCtrl gc, int ySize)
    {
        if(yPos>ySize || yPos<0) {
            gc.setEnd(false);
        }
        for(int i = 0;i<3;i++) {
            if((xPos<p.getxPos()+10&&xPos>p.getxPos()-10)&&(yPos<p.getOpening()-100||yPos>p.getOpening()+100))
            {
                gc.setEnd(false);
            }
        }
    }

    public void resetBird(float ySize)
    {
        yPos = ySize / 2;
    }
}
