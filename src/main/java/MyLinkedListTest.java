public class MyLinkedListTest <T> {
    public static void main(String[] args) {
        MyLinkedList <Integer> myLinkedList=new MyLinkedList();
        myLinkedList.add(5);
        System.out.println("myLinkedList.getFirst() = " + myLinkedList.getFirst());
        System.out.println("myLinkedList.getLast() = " + myLinkedList.getLast());
        System.out.println("myLinkedList.size = " + myLinkedList.size);
        myLinkedList.printMyLinkedList();
        System.out.println("__________________________________________");


        myLinkedList.add(89);
        myLinkedList.add(12);
        myLinkedList.add(45);
        myLinkedList.add(4);
        System.out.println("myLinkedList.getFirst() = " + myLinkedList.getFirst());
        System.out.println("myLinkedList.getLast() = " + myLinkedList.getLast());
        System.out.println("myLinkedList.size = " + myLinkedList.size);
        myLinkedList.printMyLinkedList();
        System.out.println("__________________________________________");

        myLinkedList.remove(2);
        System.out.println("myLinkedList.getFirst() = " + myLinkedList.getFirst());
        System.out.println("myLinkedList.getLast() = " + myLinkedList.getLast());
        System.out.println("myLinkedList.size = " + myLinkedList.size);
        myLinkedList.printMyLinkedList();
        System.out.println("__________________________________________");

        System.out.println("myLinkedList.getElement(2) = " + myLinkedList.getElement(2));
        System.out.println("_________________________________________________");

        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("_________________________________");

        myLinkedList.clear();
        System.out.println("myLinkedList.size = " + myLinkedList.size);

        System.out.println("__________________________________________");




    }
}
