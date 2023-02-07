import java.util.Arrays;

public class MyArrayList <T>{
    private Object elements [];
    private final int INIT_CAPACITY = 16;
    private int size;

    public MyArrayList(){
        elements = new Object [INIT_CAPACITY];
        size = 0;
    }

   public MyArrayList (Object [] elements) {
        this.elements = elements;
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                count++;
            }
            this.size = count;
        }
    }

      public MyArrayList(int initLenght) {
           this.elements= new Object [initLenght];
           this.size = 0;
        }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    public void add(T value) {
        if (size >= elements.length*0.8) {
            elements = Arrays.copyOf(elements, (int) (elements.length * 1.5 + 1));
        }
        elements[size] = value;
        size++;
    }
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size=0;
    }


    public int size() {
        return size;
    }


    public T get(int index) {
        return (T) elements[index];
    }

    }







//}