package NodeQueGeneric;

public interface Que<E> {

    public void enqueue(E item);
    public E dequeue();
    public int size();


}
