
import org.junit.jupiter.api.Test;

class Test2{
    public Test2() {
    }

    @Test
    public void testCircularQueue2() {
        CircularQueue q ;
        MainTest test = new MainTest();
        q= test.testCircularQueue();
        q.clear();
        int count=100;
        for(int i=0;i<count;i++){
            System.out.println("Count "+i +" First: "+ q.getFirst()+" Last : " +q.getLast()+" Size: "+q.getSize());
        }


    }
}