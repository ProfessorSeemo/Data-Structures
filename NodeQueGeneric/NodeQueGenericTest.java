package NodeQueGeneric;

import NodeQueGeneric.NodeQueGeneric;

public class NodeQueGenericTest {
    public static void main(String[] args){
        NodeQueGeneric<String> queue = new NodeQueGeneric<String>();
        queue.enqueue("Waseem");
        queue.enqueue("Seemo");
        queue.enqueue("Zinab");
        queue.enqueue("Majid");
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
    }
}
