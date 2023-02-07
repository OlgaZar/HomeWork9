public class MyQueue <T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;


        public QueueNode(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        @Override
            public String toString() {
                return data.toString();
            }

        }

        private QueueNode<T> first;
        private QueueNode<T> last;
        private int size;

    public MyQueue() {
    }

    public T getFirst() {
        return first.getData();
    }

    public T getLast() {
        return last.getData();
    }



    public void add (T value) {
        QueueNode node = new QueueNode<>(value);
        if (last!=null) {
            last.next = node;
        }
        last = node;
        if (first==null) {
            first=last;
        }
        size++;
    }

    public void clear () {
        while (first!=null) {
            poll();
        }
    }

    public int getSize() {
        return size;
    }

    public T peek () {
        return first.getData();
    }

    public T poll() {
        T data = first.data;
        first = first.next;
        if (first==null)  {
            last = null;
        }
        size--;
            return data;

    }
}
