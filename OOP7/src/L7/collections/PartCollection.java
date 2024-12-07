package L7.collections;

import java.util.Objects;



public class PartCollection<T> {
    private PartCollection<T> previousPartCollection;
    private PartCollection<T> nextPartCollection;
    private T partCollectoinValue;

    public PartCollection(T value) {
        this.partCollectoinValue = value;
    }

    public PartCollection<T> getPrevious() {
        return previousPartCollection;
    }

    public void setPrevious(PartCollection<T> previous) {
        this.previousPartCollection = previous;
    }

    public PartCollection<T> getNext() {
        return nextPartCollection;
    }

    public void setNext(PartCollection<T> next) {
        this.nextPartCollection = next;
    }

    public T getValue() {
        return partCollectoinValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        PartCollection<?> otherPartCollection = (PartCollection<?>) obj;
        return Objects.equals(partCollectoinValue, otherPartCollection.partCollectoinValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partCollectoinValue);
    }

    public void getValue(T value) {
    }
}