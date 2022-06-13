package ss9_DanhSach.Bai_Tap.linkedlist;

public class Node {
    public Node next;
    public String key;
    private Object data;


    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }
}
