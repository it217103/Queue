import static org.junit.Assert.assertTrue;

public class LinkedQueueTest {

    public LinkedQueueTest() {
    }
    public static void testLinkedQueue() {
        Queue<Integer> q = new LinkedQueue<Number>();
        assertTrue(q.isEmpty());

        int count = 100000;

        for(int i =0;i< count;i++){
            q.push(i);
            assertTrue(q.size() == i+1);
            assertTrue(q.first() == 0);
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