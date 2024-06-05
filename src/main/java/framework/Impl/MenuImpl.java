package framework.Impl;

import framework.Menu;
import processing.core.PApplet;

public class MenuImpl implements Menu {

    // Draws the start menu
    @Override
    public void startMenu(PApplet applet)
    {
        applet.fill(0);
        applet.stroke(255);
        applet.rect(50,90,300,110);
        applet.fill(255);
        applet.textSize(32);
        applet.text("Retro Flappy Bird",60,110,300,50);
        applet.text("Click to play",60,160,300,50);
    }

    // Draws the end menu
    @Override
    public void endMenu(PApplet applet, int score, int highscore)
    {
        applet.fill(0);
        applet.stroke(255);
        applet.rect(50,90,300,210);
        applet.fill(255);
        applet.textSize(32);
        applet.text("Game over",60,110,300,50);
        applet.text("Click to try again",60,160,300,50);
        applet.text("Score: "+score,60,210,300,50);
        applet.text("Highscore: "+highscore,60,260,300,50);
    }

    // Draws the score counter
    @Override
    public void scoreCounter(PApplet applet, int score)
    {
        applet.fill(0);
        applet.stroke(255);
        applet.rect(20, 20, 100, 50);
        applet.textSize(32);
        applet.fill(255);
        applet.text(score, 30, 58);
    }
}
