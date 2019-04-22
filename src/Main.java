import View.MainFrame;
import utils.IDDFS;
import utils.Node;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        b.addChild(e);
        b.addChild(f);
        c.addChild(g);
        c.addChild(h);
        d.addChild(i);

        a.addChild(b);
        a.addChild(c);
        a.addChild(d);

        IDDFS search = new IDDFS(a);
        Node result = search.search(2, i);
        System.out.println(result.getData());
    }
}
