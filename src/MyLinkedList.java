import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Iterable<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    //node 정의
    private static class Node<E> {
        private E item;
        private Node<E> next;
        private Node<E> prev;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    // index로 node 찾기
    private Node<E> searchNode(int index) {
        Node<E> node;
        if(index < (size >> 1)) {
            node = head;
            for(int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = tail;
            for(int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    //마지막 node에 data 추가
    public void add(E data) {
        Node<E> last = tail;
        Node<E> newNode = new Node<E>(last, data, null);

        size++;
        tail = newNode;

        if(last == null) {
            head = newNode;
        } else {
            last.next = newNode;
        }

    }

    //index로 data get
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return searchNode(index).item;
    }

    //첫번째 node 삭제
    public E deleteFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        E data = head.item;

        Node<E> first = head.next;

        head.next = null;
        head.item = null;

        size--;

        head = first;

        if(first == null) {
            tail = null;
        } else {
            first.prev = null;
        }
        return data;
    }

    //마지막 node 삭제
    public E deleteLast() {
        if(tail == null) {
            throw new NoSuchElementException();
        }

        E data = tail.item;
        Node<E> last = tail.prev;

        tail.item = null;
        tail.prev = null;

        size--;

        tail = last;

        if(tail == null) {
            head = null;
        } else {
            last.next = null;
        }

        return data;
    }

    public E delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return deleteFirst();
        }

        if(index == size - 1) {
            return deleteLast();
        }

        Node<E> delNode = searchNode(index);
        Node<E> nextNode = delNode.next;
        Node<E> prevNode = delNode.prev;

        E data = delNode.item;

        delNode.item = null;
        delNode.next = null;
        delNode.prev = null;

        size--;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        return data;
    }

    @Override
    public String toString() {
        if(head == null) {
            return "[]";

        }
        Object[] array = new Object[size];

        int index = 0;
        Node<E> node = head;
        while (node != null) {
            array[index] = (E)node.item;
            index++;
            node = node.next;
        }

        return Arrays.toString(array);
    }

    private class MyLinkedListIterator implements Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E data = current.item;
            current = current.next;
            return data;
        }
    }

    // Iterator를 반환하는 메서드
    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator();
    }

}
