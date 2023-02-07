public class MyHashMap <K,V> {
    private static class Entry<K,V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return key.toString()+" = "+ value.toString();
        }
    }



    private final int SIZE = 5;
    private Entry<K, V> table[];
    int size;

    public MyHashMap() {
        table = new Entry[SIZE];
    }

@Override
        public String toString() {
               StringBuilder sb = new StringBuilder();
                for (int i = 0; i < SIZE; i++) {
                    if (table[i] != null) {
                        sb.append(i+"  ");
                        Entry currentNode = table[i];
                        while (currentNode!= null) {
                            sb.append(currentNode.getKey() + " = " + currentNode.getValue() + ",");
                            currentNode = currentNode.next;
                        }
                    }else {
                        sb.append(i+" "+"null"+" ");
                    }
                    sb.append("\n");

            }


    return sb.toString();
}


    public void put(K key, V value) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> node = table[hash];
        if (node == null) {
            table[hash] = new Entry<K, V>(key, value);
            size++;
        } else {
            while (node.next!= null) {
                if (node.getKey() == key) {
                    node.setValue(value);
                    return;
                }
                    node = node.next;
                }

                node.next = new Entry<K, V>(key, value);
                size++;
            }
        }



    public Entry<K,V> remove(K key) {
        int hash = key.hashCode()%SIZE;
        Entry<K,V> node = table[hash];

        if (node==null) {
            return null;
        }
        if (node.key==key) {
            table[hash] = node.next;
            size--;
            return node;
        }
        Entry previousNode=node;
        node = node.next;
        while (node!=null) {
            if (node.getKey()==key) {
                previousNode.next = node.next;
                size--;
                return node;
            }
            previousNode = node;
            node = node.next;
        }
        return null;
    }
    public void clear() {
        for(int i= 0; i< table.length;i++) {
            if (table[i]==null) {
            }
            else {
                Entry<K,V> currentNode = table[i];
                while (currentNode!=null) {
                    Entry previousNode = currentNode;
                    currentNode = currentNode.next;
                    previousNode = null;
                    size--;
                }

            }
        }
    }

    public int size() {
        return size;
    }




    public V get(K key) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> node = table[hash];
        if (node == null) {
            return null;
        }

        while (node!= null) {
            if (node.getKey() == key) {
                return node.getValue();
            }
            node = node.next;
        }

        return null;
    }

}