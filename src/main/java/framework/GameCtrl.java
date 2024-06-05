package framework;

public interface GameCtrl {
    int getScore();
    void setScore(int score);
    int getHighscore();
    boolean getEnd();
    void setEnd(boolean end);
    boolean getIntro();
    void reset();
}
