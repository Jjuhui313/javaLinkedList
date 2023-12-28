import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyStack<E> {
    private MyLinkedList<E> list;
    private int top;

    public MyStack() {
        this.list = new MyLinkedList<>();
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == (list.getSize() - 1);
    }

    public E push(E data) {
        list.add(data);
        top++;
        return data;
    }
    public E pop() {
        if(isEmpty()) {
            throw new NoSuchElementException("Stack is Empty");
        }

        return list.delete(top--);
    }

    public E peek() {
        return list.get(top);
    }

    public int search(E data) {
        for(int i = 0; i < list.getSize(); i++) {
            if(list.get(i) == data) {
                return list.getSize() - i;
            }
        }
        return -1;
    }

    public int size() {
        return list.getSize();
    }

    @Override
    public String toString() {
        return list.toString();
    }

}
