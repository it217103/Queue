public class Main {
        public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        for(int i =0;i<100;i++){
            System.out.println("Adding element " + i + "to queue");
            q.push(i);

        }

        while(!q.isEmpty()){
            System.out.println("here");
            System.out.println("Next element served from queue : " + q.pop());

        }
        System.out.println("end");
    }
}
