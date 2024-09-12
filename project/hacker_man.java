import java.awt.*;
public class hacker_man {
    public static DrawingPanel frame = new DrawingPanel(800, 800);
    public static Graphics g = frame.getGraphics();

    public static int counter = 0;
    public static boolean real = false;

    public static void main(String[] args) throws Exception{
        keyhearer keyhearer = new keyhearer(frame);
        frame.addKeyListener(keyhearer);
    }
}
