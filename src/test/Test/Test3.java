
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test3{
    public Test3(){}

    @Test
    public void testCircularQueue3(){

        CircularQueue q = new CircularQueue();
        Assertions.assertTrue(q.isEmpty());

        int count = 100;

        for(int i =0;i< count;i++){
            q.push(i);
            Assertions.assertTrue(q.size() < i+1);
            Assertions.assertEquals(0,(int)q.first());
        }
        int current =0;
        while(!q.isEmpty()){
            Assertions.assertEquals(q.first(),current);
            Assertions.assertEquals(q.pop(),current);
            current++;
        }
        Assertions.assertTrue(q.isEmpty());

        if(q.isEmpty()){
            System.out.println("First : " + q.getFirst()+" Last : " +q.getLast());
        }
    }

}