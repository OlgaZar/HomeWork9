public class MyStackTest {
    public static void main(String[] args) {
        MyStack <Integer> stk = new MyStack<>();
        stk.push(5);
        stk.push(12);
        stk.push(63);
        stk.push(4);
        stk.push(95);

        System.out.println("stk.getFirst() = " + stk.getFirst());
        System.out.println("stk.getSize() = " + stk.getSize());
        stk.printMyStack();
        System.out.println("___________________________________");


        stk.peek();
        System.out.println("stk.getFirst() = " + stk.getFirst());
        System.out.println("stk.getSize() = " + stk.getSize());
        stk.printMyStack();
        System.out.println("___________________________________");

        stk.pop();
        System.out.println("stk.getFirst() = " + stk.getFirst());
        System.out.println("stk.getSize() = " + stk.getSize());
        stk.printMyStack();
        System.out.println("___________________________________");

        stk.clear();
        System.out.println("stk.getSize() = " + stk.getSize());
        System.out.println("___________________________________");


        stk.push(5);
        stk.push(12);
        stk.push(63);
        stk.push(4);
        stk.push(95);
        System.out.println("stk.remove(2) = " + stk.remove(2));
        stk.printMyStack();




    }
}
