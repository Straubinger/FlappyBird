import processing.core.PApplet;
import framework.ProcessingEngine;
import framework.Impl.Program;

public class FlappyBird extends PApplet {

    private static final ProcessingEngine Program = new Program();

    public void settings()
    {
        Program.setup(this);
    }

    public void draw()
    {
        Program.update(this);
        Program.draw(this);
        Program.reset(this);
    }

    public static void main(String[] args)
    {
        PApplet.main("FlappyBird");
    }

}