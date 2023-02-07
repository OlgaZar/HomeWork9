public class MyArrayListTest {

  public static void main(String[] args) {

        MyArrayList <Integer> myArrayList1 = new MyArrayList(new Integer[]{1, 5, 7, 8, 5, 4});
        System.out.println("myArrayList1.size() = " + myArrayList1.size());
        System.out.println("myArrayList1.toString() = " + myArrayList1.toString());
      System.out.println("________________________________________________________");

        myArrayList1.add(3);
        System.out.println("myArrayList1.size() = " + myArrayList1.size());
        System.out.println("myArrayList1.toString() = " + myArrayList1.toString());
      System.out.println("_____________________________________________________");

        myArrayList1.remove(1);
        System.out.println("myArrayList1.size() = " + myArrayList1.size());
        System.out.println("myArrayList1.toString() = " + myArrayList1.toString());
      System.out.println("_____________________________________________________");

        myArrayList1.add(4);
        System.out.println("myArrayList1.size() = " + myArrayList1.size());
        System.out.println("myArrayList1.toString() = " + myArrayList1.toString());
      System.out.println("__________________________________________________________");


        MyArrayList<String> myArrayList2 = new MyArrayList<>();
        System.out.println("myArrayList2.size() = " + myArrayList2.size());
        System.out.println("myArrayList2.toString() = " + myArrayList2.toString());


        myArrayList2.add("8da");
        myArrayList2.add("4yes");
        myArrayList2.add("sun");
        System.out.println("myArrayList2.size() = " + myArrayList2.size());
        System.out.println("myArrayList2.toString() = " + myArrayList2.toString());
      System.out.println("________________________________________________");

        System.out.println("myArrayList2.get(2) = " + myArrayList2.get(2));
      System.out.println("myArrayList2.get(0) = " + myArrayList2.get(0));
      System.out.println("______________________________________________");

        myArrayList2.clear();
        System.out.println("myArrayList2.size() = " + myArrayList2.size());
        System.out.println("myArrayList2.toString() = " + myArrayList2.toString());
      System.out.println("_______________________________________________");

        MyArrayList<Double> myArrayList3 = new MyArrayList <Double>(5);
        myArrayList3.add(3.5);
        myArrayList3.add(7.4);
        myArrayList3.add(9.1);
        System.out.println("myArrayList3.size() = " + myArrayList3.size());
        System.out.println("myArrayList3.toString() = " + myArrayList3.toString());
        System.out.println("myArrayList3.get(1) = " + myArrayList3.get(1));

    }
}

