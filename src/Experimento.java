import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Experimento {
    
    public static void main(String[] args) {
        
        try {
            
            Robot robot = new Robot();
            // Cria um delay de 5 segundos de modo que voc� possa abrir o notepad antes da execu��o do c�digo a seguir
            // Robot come�a a escrever
            robot.delay(5000);
            robot.keyPress(KeyEvent.VK_O);
            robot.keyPress(KeyEvent.VK_I);
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyPress(KeyEvent.VK_M);
            robot.keyPress(KeyEvent.VK_U);
            robot.keyPress(KeyEvent.VK_N);
            robot.keyPress(KeyEvent.VK_D);

            robot.keyPress(KeyEvent.VK_O);
            
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}