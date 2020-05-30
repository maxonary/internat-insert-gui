import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

public class StatusGUI
{
    /**Diese Klasse wird erzeugt wenn eine erfolgreiche oder nicht erfolgreiche Eingabe getätigt wird**/
    
    private JFrame window = new JFrame("Status");
    private JPanel panel = new JPanel();
    
    private JLabel good = new JLabel("Eingabe Erfolgreich!");
    private JLabel error = new JLabel("Eingabe NICHT Erfolgreich!");
    
    private JButton ok = new JButton("O.K.");
    private JButton fehler = new JButton("Bitte alle Eingaben überprüfen!");
    
    
    //Wird bei gelungener Eingabe ausgeführt
    public void good(){
        window.setSize(150,100);
        window.setLocationRelativeTo(null);
        panel.add(good);
        ok.setBackground(Color.RED);
        ok.setForeground(Color.WHITE);
        ok.setOpaque(true);
        ok.setBorderPainted(false);
        panel.add(ok);
        ok.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e) { 
               window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING));                    
            }
           });
        window.add(panel);
        window.setVisible(true);
    }
    //Wird bei nicht gelungener Eingabe ausgeführt
    public void error(){
        window.setSize(260,100);
        window.setLocationRelativeTo(null);;
        panel.add(error);
        fehler.setBackground(Color.RED);
        fehler.setForeground(Color.WHITE);
        fehler.setOpaque(true);
        fehler.setBorderPainted(false);
        panel.add(fehler);
        fehler.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e) { 
               window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING));                    
            }
           });
        window.add(panel);
        window.setVisible(true);
    }
}
