/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package local.mavenprojectPablo1;

//import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarculaLaf;


/**
 *
 * @author Pablo
 */
public class MavenprojectPablo1 {

    public static void main(String[] args) {
        int i = 0;
        System.out.println("Hello World!" + i++);
        System.out.println("Hello World!" + i++);
        System.out.println("Hello World!" + i++);
        System.out.println("Hello World!" + i++);
        System.out.println("Hello World!" + i++);
        System.out.println("Hello World!" + i++);
        System.out.println("Hello World!" + i++);
        System.out.println("Hello World!" + i++);
        
        //FlatLightLaf.setup();
          FlatDarculaLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
}
