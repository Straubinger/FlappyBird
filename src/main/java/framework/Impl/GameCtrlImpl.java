package framework.Impl;

import framework.GameCtrl;
import java.util.ArrayList;

public class GameCtrlImpl implements GameCtrl {

    private int score = 0;
    private int highscore = 0;
    private boolean end = false;
    private boolean intro = true;

    ArrayList<Integer> scoreList = new ArrayList<Integer>();

    // Getters and setters
    @Override
    public int getScore()
    {
        return score;
    }

    @Override
    public void setScore(int score)
    {
        this.score = score;
    }

    @Override
    public int getHighscore()
    {
        highscore = Math.max(highscore, score);
        return highscore;
    }

    @Override
    public boolean getEnd()
    {
        return end;
    }

    @Override
    public void setEnd(boolean end)
    {
        this.end = end;
    }

    @Override
    public boolean getIntro()
    {
        return intro;
    }

    // Resets the score after collision
    @Override
    public void reset()
    {
        scoreList.add(score);
        intro = false;
        end = true;
        score = 0;
    }
}
