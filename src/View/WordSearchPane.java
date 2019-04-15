package View;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.GridLayout;

public class WordSearchPane extends JPanel {
    public WordSearchPane() {
        setLayout(new GridLayout(3, 2, 5, 30));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JLabel fullText = new JLabel("Full text:");
        JTextArea input = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(input);
        input.setLineWrap(true);
        input.setWrapStyleWord(true);
        JLabel resultLabel = new JLabel("Search result is:");
        JLabel resultText = new JLabel();
        JButton searchButton = new JButton("Search");
        add(fullText);
        add(scrollPane);
        add(resultLabel);
        add(resultText);
        add(searchButton);
    }
}
