import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

public class keyhearer_2 implements KeyListener {
    final static String[] Fact = { "import java.awt.event.KeyEvent;",
            "import java.awt.event.KeyListener;",
            "import java.awt.*;",
            " ",
            "public class keyhearer implements KeyListener {",
            "    final static String[] Fact = { \"Nathan has played piano for 11 years\", \"Nathan has played percussion for 7 years\",",
            "            \"Nathan weighs 15 stone\", \"Nathan got 4th place in the 2016 chess tournament\",",
            "            \"Nathan Peter Crane was leaving digital electronics from Mr. Selvik's room (010) with Kyle Edward Holtz, and while walking down the hallway, when we approached the staircase, Kyle Edward Holtz tried to go up it. Nathan Peter Crane stopped him and called him stupid because Nathan Peter Crane believed that we had just gotten out of 3rd period and that we had lunch. We then walked to the lunch room and had lunch for 20 minutes until Nathan Peter Crane checked his phone and saw that it was 11:00AM this led to the realization that we were in 1st period lunch, so we walked out of the lunch room and to the AP Computer Science room (115).\",",
            "            \"Nathan has 2267 email notifications as of 9/11/2024, 11:25\",",
            "            \"Nathan is accelerated by gravity at a rate of 9.8 m/s^2\", \"Nathan has participated in 8 select ensembles\",",
            "            \"Nathan has listened to 173,453 minutes of music on spotify as of 9/11/2024, 11:31\",",
            "            \"Nathan got highest individual score in math olympiad in the 2019-2020 school year\" };",
            "    final static Font font = new Font(\"Courier New\", Font.BOLD, 15);",
            "    final static Color hacker_green = new Color(36, 214, 69);",
            "    public static int counter_letters = 1;",
            "    public static int counter_spaces = 1;",
            "    public static int start = 0;",
            "    public static int counter_2 = 0;",
            "    public static int line = 0;",
            "    public static int rand = 0;",
            "    DrawingPanel frame;",
            "    Graphics g;",
            " ",
            "    keyhearer(DrawingPanel frame) {",
            "        this.frame = frame;",
            "    }",
            " ",
            "    @Override",
            "    public void keyTyped(KeyEvent e) {",
            "        g = frame.getGraphics();",
            "        g.setFont(font);",
            "        g.setColor(Color.BLACK);",
            "        g.fillRect(0, 6 + (line * 15), 1920, 1080);",
            "        g.setColor(hacker_green);",
            "        g.drawString(Fact[counter_2].substring(start, counter_letters), 5, 17 + (line * 15));",
            "        if (Fact[counter_2].length() - counter_letters != 0) {",
            "            rand = Math.min((int) (4 * Math.random() + 1), Fact[counter_2].length() - counter_letters);",
            "            counter_letters += rand;",
            "            counter_spaces += rand;",
            "        } else {",
            "            counter_letters++;",
            "            counter_spaces++;",
            "        }",
            "        if (Fact[counter_2].length() < counter_letters) {",
            "            counter_2++;",
            "            line++;",
            "            counter_letters = 1;",
            "            counter_spaces = 1;",
            "            start = 0;",
            "        }",
            "        if (counter_spaces > 180 && Fact[counter_2].substring(counter_letters - 1, counter_letters).equals(\" \")) {",
            "            line++;",
            "            counter_spaces = 1;",
            "            start = counter_letters;",
            "        }",
            "    }",
            " ",
            "    @Override",
            "    public void keyPressed(KeyEvent e) {",
            " ",
            "    }",
            " ",
            "    @Override",
            "    public void keyReleased(KeyEvent e) {",
            " ",
            "    }",
            " ",
            "}" };
    final static Font font = new Font("Courier New", Font.BOLD, 15);
    final static Font font_2 = new Font("Courier New", Font.BOLD, 110);
    final static Color hacker_green = new Color(36, 214, 69);
    public static int counter_letters = 1;
    public static int counter_spaces = 1;
    public static int start = 0;
    public static int counter_2 = 0;
    public static int line = 0;
    public static int rand = 0;
    public static DrawingPanel frame_2;
    public static Graphics g_2;
    public static boolean real = false;
    DrawingPanel frame;
    Graphics g;

    keyhearer_2(DrawingPanel frame) {
        this.frame = frame;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (!real) {
            g = frame.getGraphics();
            g.setFont(font);
            g.setColor(Color.BLACK);
            g.fillRect(0, 6 + (line * 15), 1920, 1080);
            g.setColor(hacker_green);
            g.drawString(Fact[counter_2].substring(start, counter_letters), 5, 17 + (line * 15));
            if (Fact[counter_2].length() - counter_letters != 0) {
                rand = Math.min((int) (10 * Math.random() + 5), Fact[counter_2].length() - counter_letters);
                counter_letters += rand;
                counter_spaces += rand;
            } else {
                counter_letters++;
                counter_spaces++;
            }
            if (Fact[counter_2].length() < counter_letters) {
                counter_2++;
                line++;
                counter_letters = 1;
                counter_spaces = 1;
                start = 0;
            }
            if (counter_spaces > 160 && Fact[counter_2].substring(counter_letters - 1, counter_letters).equals(" ")) {
                line++;
                counter_spaces = 1;
                start = counter_letters;
            }
            if (counter_2 >= Fact.length) {
                g.setColor(Color.WHITE);
                g.setFont(font_2);
                g.drawString("Press Enter To Compile", 260, 570);
                real = true;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (real) {
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
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
