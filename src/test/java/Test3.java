import org.junit.jupiter.api.Test;

class Test3{
    public Test3(){}

    @Test
    public void testLinkedQueue3(){

        CircularQueue q ;
        Test1 test1 = new Test1();
        q = test1.testLinkedQueue();
        q.isEmpty();
        if(q.isEmpty()){
            System.out.println("First : " + q.getFirst()+" Last : " +q.getLast());
        }
    }

}