public class MyQueueTest {

    public static void main(String[] args) {
        MyQueue<Integer> q1 = new MyQueue<>();
        q1.add(4);
        System.out.println("q1.getFirst() = " + q1.getFirst());
        System.out.println("q1.getLast() = " + q1.getLast());
        System.out.println("q1.getSize() = " + q1.getSize());
        System.out.println("_________________");


        q1.add(8);
        q1.add(10);
        q1.add(20);
        System.out.println("q1.getFirst() = " + q1.getFirst());
        System.out.println("q1.getLast() = " + q1.getLast());
        System.out.println("q1.getSize() = " + q1.getSize());
        System.out.println("__________________");

        System.out.println("q1.peek() = " + q1.peek());
        System.out.println("q1.getSize() = " + q1.getSize());
        System.out.println("q1.getFirst() = " + q1.getFirst());
        System.out.println("q1.getLast() = " + q1.getLast());
        System.out.println("_______________________________");


        System.out.println("q1.poll() = " + q1.poll());
        System.out.println("q1.getSize() = " + q1.getSize());
        System.out.println("q1.getFirst() = " + q1.getFirst());
        System.out.println("q1.getLast() = " + q1.getLast());
        System.out.println("_______________________________");

        q1.clear();
        System.out.println("q1.getSize() = " + q1.getSize());
        System.out.println("_______________________________");

    }
}
