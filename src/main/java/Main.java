import java.util.Scanner;
import java.util.*;

public class Main {
    static LinkedQueue q = new LinkedQueue();
    static Scanner scan = new Scanner(System.in);
    static int qSize = q.getSize();
    public static void main(String[] args) {
      //  boolean moreE;
        int element=0;
      //  moreE = scan.nextBoolean();
        System.out.println(qSize);
        int x = pushingQ();
        poppinQ(x);
      //  System.out.println("To add more elements T/F: " + moreE);
        //switch(qSize){
          //  case 1:


    }


    public static int pushingQ() {
    boolean moreE = true;
    int size;
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
   // LinkedQueue.setSIZE(size);
    System.out.println(size);
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
                    System.out.println(size);
                }
            }
        }

    }

