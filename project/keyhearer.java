import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;
public class keyhearer implements KeyListener{
    final static String[] Fact = {"Nathan has played piano for 11 years","Nathan has played percussion for 7 years","Nathan weighs 15 stone","Nathan got 4th place in the 4th grade chess tournament","Nathan Peter Crane was leaving digital electronics from Mr. Selvik's room (010) with Kyle Edward Holtz, and while walking down the hallway, when we approached the staircase, Kyle Edward Holtz tried to go up it. Nathan Peter Crane stopped him and called him stupid because Nathan Peter Crane believed that we had just gotten out of 3rd period and that we had lunch. We then walked to the lunch room and had lunch for 20 minutes until Nathan Peter Crane checked his phone and saw that it was 11:00AM this led to the realization that we were in 1st period lunch, so we walked out of the lunch room and to the AP Computer Science room (115).","Nathan has 2267 email notifications as of 9/11/2024, 11:25","Nathan is accelerated by gravity at a rate of 9.8 m/s^2","Nathan has participated in 8 select ensembles","Nathan has listened to 173,453 minutes of music on spotify as of 9/11/2024, 11:31","Nathan catfished someone as an egirl over the summer (don't worry it was a joke)"};
    final static Font font = new Font("Comic Sans", Font.BOLD, 15);
    public static int counter = 1;
    public static int counter_2 = 0;
    DrawingPanel frame;
    Graphics g;
    keyhearer(DrawingPanel frame) {
        this.frame = frame;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        g = frame.getGraphics();
        g.setFont(font);
        g.setColor(Color.WHITE);
        g.fillRect(0, 6 + (counter_2 * 15), 800, 800);
        g.setColor(Color.BLACK);
        g.drawString(Fact[counter_2].substring(0,counter), 5, 17 + (counter_2 * 15));
        counter++;
        if(Fact[counter_2].length() < counter) {
            counter_2++;
            counter = 1;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
