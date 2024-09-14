import java.awt.*;

public class hacker_man {
    public static DrawingPanel frame = new DrawingPanel(1920, 1080);
    public static DrawingPanel frame_2;
    public static Graphics g = frame.getGraphics();
    public static Graphics g_2;
    public static boolean valid = false;
    public static int counter = 0;
    public static boolean real = false;

    public static void main(String[] args) throws Exception {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1920, 1080);
        keyhearer_2 keyhearer_2 = new keyhearer_2(frame);
        frame.addKeyListener(keyhearer_2);
    }
}
