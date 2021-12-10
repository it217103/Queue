import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

class Test1 {

    @Test
    public  void testLinkedQueue() {
        Queue<Integer> q = new LinkedQueue();
        Assertions.assertTrue(q.isEmpty());

        int count = 1000;

        for(int i =0;i< count;i++){
            q.push(i);
            Assertions.assertTrue(q.size() == i+1);
            Assertions.assertEquals(0, (int) q.first());
        }
        int current =0;
        while(!q.isEmpty()){
            assertTrue(q.first() == current);
            assertTrue(q.pop() == current);
            current++;
        }
        assertTrue(q.isEmpty());

    }
}