package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {

    public MainFrame() {
        JTabbedPane mainTabs = new JTabbedPane();
        ContentPane panelPalabras = new ContentPane();
        ContentPane panelPlazas = new ContentPane();
        mainTabs.addTab("Busqueda de palabras", panelPalabras);
        mainTabs.addTab("Busqueda de ruta", panelPlazas);
        getContentPane().add(mainTabs);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setTitle("Búsqueda en profundidad iterativa");
    }
}
