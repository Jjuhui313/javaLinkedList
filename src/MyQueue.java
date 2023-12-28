import java.util.NoSuchElementException;

public class MyQueue<E> {
    private MyLinkedList<E> list;

    public MyQueue() {
        this.list = new MyLinkedList<>();
    }

    public void enqueue(E data) {
        list.add(data);
    }

    public E dequeue() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        return list.deleteFirst();
    }
    public boolean isEmpty() {
        return list.getSize() == 0;
    }

    public int size() {
        return list.getSize();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
