
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test2{
    public Test2() {
    }

    @Test
    public void testCircularQueue2() {
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
        q.clear();
        Assertions.assertTrue(q.isEmpty());

        for(int i=0;i<count;i++){
            System.out.println("Count "+i +" First: "+ q.getFirst()+" Last : " +q.getLast()+" Size: "+q.getSize());
        }
        Assertions.assertEquals(q.getFirst(),q.getLast());


    }
}