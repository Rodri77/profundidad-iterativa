package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IDDFS {
    private int depth;
    private Node current;
    private List<Node> open;
    private List<Node> closed;
    private List<Node> children;

    public IDDFS(Node root) {
        depth = 0;
        this.current = root;
        open = new ArrayList();
        closed = new ArrayList();
        children = new ArrayList();
    }

    public Node search(int limit, Node searched) {
        while (!isFinal(searched) && depth < limit) {
            open.add(current);
            while(!isFinal(searched) && !open.isEmpty()) {
                open.remove(0);
                closed.add(current);
                if(depth <= limit) {
                    children = (List<Node>) current.getChildren().stream().filter(child -> !open.contains(child) && !closed.contains(child))
                        .collect(Collectors.toList());
                    open.addAll(children);
                }
                current = open.get(0);
            }
            depth += 1;
        }
        return current;
    }

    private boolean isFinal(Node searched) {
        return current.getData() == searched.getData();
    }
}
