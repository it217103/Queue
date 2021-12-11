import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class Test1 {
    public Test1(){}

    @Test
    public  void testLinkedQueue() {
        LinkedQueue q = new LinkedQueue();
        Assertions.assertTrue(q.isEmpty());

        int count = 100;

        for(int i =0;i< count;i++){
            q.push(i);
            Assertions.assertTrue(q.size() <= i+1);
            //Assertions.assertEquals(0, q.first());
            Assertions.assertEquals(0,(int)q.first());
        }
        int current =0;
        while(!q.isEmpty()){
            Assertions.assertEquals(q.first(),current);
            Assertions.assertEquals(q.pop(),current);
            current++;
        }
        Assertions.assertTrue(q.isEmpty());

    }
}