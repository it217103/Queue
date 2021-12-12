public interface Queue<E> {


    void push(E element);
    void push(E element,int size);

    E pop();

    E first();


    boolean isEmpty();

    int size();

    void clear();
}
