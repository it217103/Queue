import java.util.NoSuchElementException;

/*
Step 1: IF (REAR+1)%MAX = FRONT
Write " OVERFLOW "
Goto step 4
[End OF IF]

Step 2: IF FRONT = -1 and REAR = -1
SET FRONT = REAR = 0
ELSE IF REAR = MAX - 1 and FRONT ! = 0
SET REAR = 0
ELSE
SET REAR = (REAR + 1) % MAX
[END OF IF]

Step 3: SET QUEUE[REAR] = VAL

Step 4: EXIT
 */
public class LinkedQueue implements Queue {

    private int first;
    private int last;
    private int size;
    private Object[] N;
    public static final int SIZE = 100;

    public LinkedQueue() {
        this(SIZE);
        first=-1;
        last=-1;
    }

    public LinkedQueue(int siz) {
        size = siz;
        N = new Object[size];
    }
/*
 if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1)))	// Condition if queue is full
        {
            System.out.print ("Queue Full!");
        }
        else if (front == -1)	// Condition for empty queue.
        {
            front = 0;
            rear = 0;
            queue.add(rear,value);
        }
        else if (rear == size - 1 && front != 0)
        {
            rear = 0;
            queue.set(rear,value);
        }
        else
        {
            rear = (rear + 1);
    	    // Adding a new element if
	        if (front <= rear)
    	    {
                queue.add(rear, value);
            }
            // Else updating old value
	        else
        	{
                queue.set(rear, value);
            }
        }
    }
 */
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
            if (isEmpty()) {
                first = -1;
                last = -1;
            } else {
                //N[first] = null;
                first = (first + 1) % size;
            }
            return elem;
        }
    }
    @Override
    public Object first () {
        if (isEmpty())
            throw new NoSuchElementException();
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
