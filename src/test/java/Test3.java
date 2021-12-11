import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3{
    public Test3(){}

    @Test
    public void testLinkedQueue3(){

        LinkedQueue q ;
        Test1 test1 = new Test1();
        q = test1.testLinkedQueue();
        q.isEmpty();
        if(q.isEmpty()){
            System.out.println("First : " + q.getFirst()+" Last : " +q.getLast());
        }
    }

}