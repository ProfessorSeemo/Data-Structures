package NodeQueGeneric;

public class GenericNode<E> {
    public final E item;
    public GenericNode<E> next;

    public GenericNode(E item){
        this.item = item;
        next = null;
    }


    public E getItem(){
        return this.item;
    }

    public GenericNode<E> getNext(){
        return this.next;
    }

    public void setNext(GenericNode<E> next){
        this.next = next;
    }




}
