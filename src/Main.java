import java.awt.*;
import java.awt.event.InputEvent;
    public class Main {


    public static void main(String[] args) {
        int delayTime = 100;
        try {
            while (true) {
                Robot robot = new Robot();
                int button = InputEvent.BUTTON1_DOWN_MASK;
                robot.mousePress(button);
                Thread.sleep(delayTime);
                robot.mouseRelease(button);
                Thread.sleep(delayTime);
            }
        } catch (AWTException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}