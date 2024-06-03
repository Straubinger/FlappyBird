package framework.programs;

import java.util.ArrayList;

public class GameCtrl {

    private int score = 0;
    private int max = 0;
    private int highscore = 0;
    private boolean end = false;
    private boolean intro = true;

    ArrayList<Integer> scoreList = new ArrayList<Integer>();

    // Getters and setters
    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public int getHighscore()
    {
        for (int i = 1; i < scoreList.size(); i++) {
            if (max < scoreList.get(i))
                max = scoreList.get(i);
        }
        highscore = Math.max(max, score);
        return highscore;
    }

    public boolean getEnd()
    {
        return end;
    }

    public void setEnd(boolean end)
    {
        this.end = end;
    }

    public boolean getIntro()
    {
        return intro;
    }

    // Methods
    public void reset()
    {
        scoreList.add(score);
        intro = false;
        end = true;
        score = 0;
    }
}
