public interface Queue<E> {


    void push(E element);

    E pop();

    E first();


    boolean isEmpty();

    int size();

    void clear();
}
