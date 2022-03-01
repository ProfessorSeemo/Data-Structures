package NodeQueNonGeneric;

import NodeQueNonGeneric.NodeQue;

public class Queue implements Que {
    private NodeQue first;
    private NodeQue last;
    private int n; // for the size


    public Queue(){
        first = null;
        last = null;
        n = 0;
    }

    @Override
    public void enqueue(int item) {
        if (first == null){ // if the que is empty
            first = new NodeQue(item);
            last = first;
        }
        else {
            NodeQue oldlast = last;
            last = new NodeQue(item);
            oldlast.setNext(last);
        }
       n++;
    }

    @Override
    public int dequeue() {
        if (n == 0) {
            return first.getItem();
        }
        else {
            int temp = first.getItem();
            first = first.getNext();
            if (first == null){last = null;}
            n--;
            return temp;
        }
    }

        @Override
    public int size() {
        return n;
    }
}



