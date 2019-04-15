package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {

    public MainFrame() {
        JTabbedPane mainTabs = new JTabbedPane();
        ContentPane wordPane = new ContentPane();
        WordSearchPane searchPane = new WordSearchPane();
        wordPane.add(searchPane, BorderLayout.CENTER);
        ContentPane placePane = new ContentPane();
        mainTabs.addTab("Busqueda de palabras", wordPane);
        mainTabs.addTab("Busqueda de ruta", placePane);
        getContentPane().add(mainTabs);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Búsqueda en profundidad iterativa");
    }
}
