package NodeQueNonGeneric;

public class NodeQueTest {
        public static void main(String[] args){
            Queue queue = new Queue();
            queue.enqueue(911);
            queue.enqueue(808);
            queue.enqueue(333);
            queue.enqueue(755);
            System.out.println(queue.size());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.size());

    }


}
