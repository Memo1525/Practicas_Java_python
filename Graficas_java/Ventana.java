import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;
import javax.swing.*;


public class UsoGraficos extends JFrame{

    public static void main (String[] args) {

        UsoGraficos app = new UsoGraficos();
        app.setSize(200,300);
        app.setVisible(true);



        }
    public UsoGraficos() {
        super("Uso de Graficos"); // modifica el header
            addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    dispose();
                    System.exit(0); //calling the method is a must
                }
            });


    }
}

