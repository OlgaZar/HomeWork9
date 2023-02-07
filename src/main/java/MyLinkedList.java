public class MyLinkedList <T> {


    private static class Node<T> {
        private T data;
        private Node<T> prev;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        public Node() {
        }
        public String toString() {
           return data.toString();
        }
    }

    private Node<T> first;
    private Node<T> last;
    int size;

    public T getFirst() {
        return first.data;
    }

    public T getLast() {
        return last.data;
    }

    public void add(T value) {
        Node newLast = new Node(value);
        if (last != null) {
            last.next = newLast;
            newLast.prev = last;
        }
        last = newLast;
        if (first == null) {
            first = last;
        }
        size++;
    }
public void removeFirst() {
        first = first.next;
        first.prev = null;
        size--;
}

    public void remove (int index) {
        if (index==0) {
            removeFirst();
            }
        else {

            Node searchNode = new Node(first.data);
            searchNode.next = first.next;
            Node previousNode = new Node<>();
            Node nextNode = new Node<>();

            for (int i=1; i<=index; i++)  {
                searchNode = searchNode.next;
            }
            previousNode = searchNode.prev;
            nextNode = searchNode.next;
            previousNode.next = nextNode;
            nextNode.prev = previousNode;

            size--;}
    }
    public void printMyLinkedList() {
        int i = 0;
        Node currentNode = new Node(first.data);
        currentNode.next = first.next;

        while (i<size) {
            System.out.println(currentNode);
            currentNode = currentNode.next;
            i++;
        }
    }
    public int size() {
        return size;
    }

    public void clear() {
        while(first!=null) {
            first = first.next;
            size--;
        }
    }

    public T getElement(int index) {
        Node searchNode = new Node(first.data);
        searchNode.next = first.next;

        for (int i=1; i<=index; i++) {
            searchNode = searchNode.next;
        }
        return (T) searchNode.data;

    }

}






