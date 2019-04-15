import View.MainFrame;
import utils.Node;

public class Main {
    public static void main(String[] args) {
        Node<Integer> node = new Node<Integer>(7);
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        System.out.println(node.getData());
    }
}
