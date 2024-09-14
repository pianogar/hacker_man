import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

public class keyhearer_3 implements KeyListener {
    public boolean valid = true;
    DrawingPanel frame_2;
    Graphics g_2;

    keyhearer_3(DrawingPanel frame) {
        this.frame_2 = frame;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_ENTER) {
            frame_2 = new DrawingPanel(1920, 1080);
            g_2 = frame_2.getGraphics();
            g_2.setColor(Color.BLACK);
            g_2.fillRect(0, 0, 1920, 1080);
            keyhearer keyhearer = new keyhearer(frame_2);
            frame_2.addKeyListener(keyhearer);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
