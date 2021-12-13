
import org.junit.jupiter.api.Test;

class Test3{
    public Test3(){}

    @Test
    public void testCircularQueue3(){

        CircularQueue q ;
        MainTest test1 = new MainTest();
        q = test1.testCircularQueue();
        q.isEmpty();
        if(q.isEmpty()){
            System.out.println("First : " + q.getFirst()+" Last : " +q.getLast());
        }
    }

}