import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        while (true)
            try {
                Robot robot = new Robot();

                //time between messages
                robot.delay(1000);

                // Spam text "hello java"
                typeText(robot, "....");

                // for auto click
                pressEnter(robot);

            } catch (AWTException e) {
                e.printStackTrace();
            }
        }

        private static void typeText (Robot robot, String text){
            for (char c : text.toCharArray()) {
                typeChar(robot, c);
            }
        }

        private static void typeChar (Robot robot,char c){
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
        }

        private static void pressEnter (Robot robot){
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
    }
    //be careful
