public class MyStack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
        @Override
        public String toString() {
            return data.toString();
        }
    }

    private StackNode<T> first;
    private int size;

    public MyStack() {
    }

    public T getFirst() {
        return first.data;
    }

    public void push(T value) {
        StackNode newFirst = new StackNode<>(value);
        newFirst.next = first;
        first = newFirst;

        size++;
    }


     public T remove (int index) {
       if (index==0) {
           peek ();
           return first.data;
       }
       else {

           StackNode searchNode = new StackNode<>(first.data);
           searchNode.next = first.next;
           StackNode previousNode = new StackNode(null);
           previousNode.next = first;
           StackNode nextNode = searchNode.next;

           for (int i = 1; i <= index; i++) {
               previousNode = searchNode;
               searchNode = searchNode.next;
               nextNode = searchNode.next;
           }
           previousNode.next = nextNode;
           size--;
           return (T) searchNode.data;
       }
}

    public void clear () {
        while (first!=null) {
            pop ();
        }
    }

    public int getSize() {
        return size;
    }

    public T peek() {
        return first.data;
    }

    public T pop() {
            T data = first.data;
            first = first.next;
            size--;
            return data;
   }

   public void printMyStack() {
        int i = 0;
        StackNode currentNode = new StackNode(first.data);
        currentNode.next = first.next;
       while (i<size) {
           System.out.println(currentNode);
           currentNode = currentNode.next;
           i++;
       }
   }

}
