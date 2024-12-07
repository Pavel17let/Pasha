package L7.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<PartCollection<T>> {

    private PartCollection<T> head;
    private PartCollection<T> tail;
    private int size;

    public void add(T value) {
        PartCollection<T> partCollection = new PartCollection<>(value);
        partCollection.getValue(value);
        partCollection.setNext(null);

        if (head == null) {
            partCollection.setPrevious(null);
            head = partCollection;
            tail = partCollection;
        } else {
            tail.setNext(partCollection);
            partCollection.setPrevious(tail);
            tail = partCollection;
        }
        size++;
    }

    public PartCollection<T> delete() {
        if (tail == null) {
            return null;
        }

        PartCollection<T> deletedNode = tail;
        if (tail.getPrevious() != null) {
            tail = tail.getPrevious();
            tail.setNext(null);
        } else {
            head = null;
            tail = null;
        }
        size--;
        return deletedNode;
    }

    public PartCollection<T> delete(T value) {
        if (head == null) {
            return null;
        }

        PartCollection<T> cur = head;

        while (cur != null) {
            if (cur.getValue().equals(value)) {
                if (cur.getPrevious() != null) {
                    cur.getPrevious().setNext(cur.getNext());
                } else { // Удаляем голову
                    head = cur.getNext();
                }

                if (cur.getNext() != null) {
                    cur.getNext().setPrevious(cur.getPrevious());
                } else { // Удаляем хвост
                    tail = cur.getPrevious();
                }

                size--;
                return cur;
            }
            cur = cur.getNext();
        }

        throw new NoSuchElementException("Элемент не найден");
    }

    public PartCollection<T> findByValue(T value) {
        for (PartCollection<T> elem : this) {
            if (elem.getValue().equals(value)) {
                return elem;
            }
        }
        throw new NoSuchElementException("Элемент не найден");
    }

    public int size() {
        return size;
    }

    public PartCollection<T> getHead() {
        return head;
    }

    public PartCollection<T> getTail() {
        return tail;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Iterator<PartCollection<T>> iterator() {
        return new Iterator<PartCollection<T>>() {
            private PartCollection<T> curr = head;

            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public PartCollection<T> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Нет следующего элемента");
                }
                PartCollection<T> temp = curr;
                curr = curr.getNext();
                return temp;
            }

            @Override
            public void remove() {

            }
        };
    }
}