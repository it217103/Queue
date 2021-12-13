import java.util.Scanner;

public class Main {
   static CircularQueue q = new CircularQueue();
    static Scanner scan = new Scanner(System.in);
   static int qSize;

    public static void main(String[] args) {
        int x = pushingQ();
        poppinQ(x);
    }


    public static int pushingQ() {
    boolean moreE = true;
    int size;


    qSize = q.getSize();


    do {
        for (int i = 0; i < qSize; i++) {
            System.out.println("Adding element " + i + "to queue");
            q.push(i);
        }
        System.out.println(qSize);
        System.out.println("To add more elements T/F: " );
        moreE =scan.nextBoolean();
        if(moreE)
            qSize = qSize*2;
    }
    while (moreE);
    size=qSize;
    q.setSize(size);
    System.out.println(q.getSize());
    return size;

    }

    public static void poppinQ(int size) {
        int c=0;
        int s = size/4;

        System.out.println("Size passed : " + size);
            while (c<size) {
                System.out.println("Next element served from queue : " + q.pop());
                c++;
                if(c==s) {
                    size = size / 2;
                    System.out.println("1/4 of queue");
                    System.out.println(size);
                }
            }
        }

    }

