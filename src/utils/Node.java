package utils;
import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    private List<Node<T>> children = new ArrayList<Node<T>>();
    private Node<T> parent = null;
    private T data = null;
    private int level;

    public Node(T data) {
        this.data = data;
        this.level = 0; //This is root node
    }

    public Node(T data, Node<T> parent) {
        this.data = data;
        setParent(parent);
        level = parent.level + 1;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        child.setParent(this);
        children.add(child);
    }

    public void addChild(T data) {
        Node<T> newChild = new Node (data);
        this.addChild(newChild);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getParent() {
        return parent;
    }
}