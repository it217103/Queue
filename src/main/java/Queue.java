public interface Queue<Object> {


    void push(Object element);

    Object pop();

    Object first();


    boolean isEmpty();

    int size();

    void clear();
}
