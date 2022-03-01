package NodeQueNonGeneric;

public class NodeQue {
    private NodeQue next;
    private final int item;


    public NodeQue(int item){
        this.item = item;
        this.next = null;
    }


    public NodeQue getNext() {
        return next;
    }

    public void setNext(NodeQue next) {
        this.next = next;
    }

    public int getItem() {
        return item;
    }
}
