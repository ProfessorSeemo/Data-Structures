package NodeQueGeneric;

import NodeQueGeneric.NodeQueGeneric;

public class NodeQueGenericTest {
    public static void main(String[] args){
        NodeQueGeneric<String> queue = new NodeQueGeneric<String>();
        queue.enqueue("Waseem");
        queue.enqueue("Seemo");
        queue.enqueue("Zainab");
        queue.enqueue("Majid");

        System.out.println(queue.size());
        queue.walkQue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
       queue.dequeue();
        queue.walkQue();
        System.out.println(queue.size());
    }}
