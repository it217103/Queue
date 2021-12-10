import java.util.NoSuchElementException;

public class LinkedQueue implements Queue {

    private int first;
    private int last;
    private int size;
    private Object[] N;
    public static final int SIZE = 100;



    public LinkedQueue() {
        this(SIZE);
    }

    public LinkedQueue(int siz) {
        size = siz;
        N = new Object[size];
    }
    public LinkedQueue(int first, int last, int size) {
        this.first = first;
        this.last = last;
        this.size = size;
    }


    @Override
    public void push(Object element) {
        if (size() == size) {

            //if queue is empty
            N[last] = element;
            last = (last + 1) % size;
        }
    }

    @Override
    public Object pop() {
        Object elem;
        if (isEmpty()) {
            elem = N[first];
            N[first] = null;
            first = (first + 1) % size;
            return elem;
        }
       return null;
    }

    @Override
    public Object first () {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return N[first];
    }

    @Override
    public boolean isEmpty () {
        return first ==last;
    }

    @Override
    public int size () {
        return (size - first + last)%size;
    }

    @Override
    public void clear () {
        this.first = 0;
        this.last = 0;
        this.size = 0;
    }
}
