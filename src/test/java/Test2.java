import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2{
    public Test2() {
    }

    @Test
    public void testLinkedQueue2() {
        LinkedQueue q ;
        Test1 test = new Test1();
        q= test.testLinkedQueue();
        q.clear();
        int count=100;
        for(int i=0;i<count;i++){

            System.out.println("Count "+i +" First: "+ q.getFirst()+" Last : " +q.getLast()+" Size: "+q.getSize());
        }


    }
}