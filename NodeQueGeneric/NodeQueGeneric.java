package NodeQueGeneric;

public class NodeQueGeneric<E> implements Que<E> {
    public GenericNode<E> first;
    public GenericNode<E> last;
    public  int n;
    public NodeQueGeneric(){
        first = null;
        last = null;
        n = 0;
    }

    @Override
    public void enqueue(E item){
        if (first == null){
            first = new GenericNode<E>(item);
            last = first;
        }
        else{
            GenericNode<E> oldlast = last;
            last = new GenericNode<E>(item);
            oldlast.setNext(last);
        }
        n++;
    }

    @Override
    public E dequeue(){
        if (n == 0){
            return null;
        }
        else {
            E temp =  first.getItem();
            first = first.getNext();

            if (first == null){
                last = null;
            }

            n--;
            return temp;
        }

    }

    @Override
    public int size(){
        return n;
    }

}



