public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String,String> myHashMap = new MyHashMap<>();
        myHashMap.put("A","P");
        myHashMap.put("S","m");
        myHashMap.put("P","Q");
        myHashMap.put("p","k");
        myHashMap.put("ty","a");
        myHashMap.put("B","e");
        myHashMap.put("C","e");
        myHashMap.put("H","D");
        myHashMap.put("a","L");


        System.out.println("myHashMap = " + myHashMap);
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("________________________________________");

        System.out.println("myHashMap.get(\"A\") = " + myHashMap.get("A"));
        System.out.println("______________________________________________");

        System.out.println("myHashMap.remove(\"B\") = " + myHashMap.remove("B"));
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("______________________________________________________");

        myHashMap.clear();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("_____________________________________________________");
    }

}
