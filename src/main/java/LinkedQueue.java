import java.util.NoSuchElementException;
import java.util.Scanner;

public class LinkedQueue implements Queue {


    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }

    public static void setSIZE(int SIZE) {
        LinkedQueue.SIZE = SIZE;
    }

    public int getSize() {
        return size;
    }

    private int first;
    private int last;
    private int size;
    private Object[] N;
    public static  int SIZE ;

    public LinkedQueue() {
        this(SIZE);
        first=-1;
        last=-1;
    }

    public LinkedQueue(int siz) {
        size = siz;
        N = new Object[size];
    }

    @Override
    public void push(Object element,int size) {

    }

    @Override
    public void push(Object element) {

        if(!isEmpty()){
            System.out.println("full");
        }else if (first ==-1){
            first=0;
        }
        last = (last + 1) % size;
        N[last] = element;
        System.out.println("Inserted " + element);

    }

    @Override
    public Object pop() {
        Object elem;
        if (first==-1) {
            throw new NoSuchElementException("");
        }else {
            elem = N[first];
            //N[first] = null;
            first = (first + 1) % size;
            }
        System.out.println("Removed element: " + elem);
            return elem;
        }

    @Override
    public Object first () throws NoSuchElementException {

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
