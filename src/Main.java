
public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> ml = new MyLinkedList<>();

        ml.add(1);
        ml.add(2);
        ml.add(3);
        ml.add(4);

        System.out.print("for-each test: ");
        for(Integer i : ml) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();

        System.out.println("get(index 1) test: " + ml.get(1));
        System.out.println("get(index 2) test: " + ml.get(2));

        System.out.println();

        System.out.print("delete before: ");
        for(Integer i : ml) {
            System.out.print(i + " ");
        }
        System.out.println();

        ml.delete(2);
        System.out.print("delete after: ");
        for(Integer i : ml) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("====================================================");
        System.out.println();

        MyStack<Integer> s = new MyStack<>();

        System.out.println("stack이 비어있나? (데이터 push 전): " + s.isEmpty());

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("stack이 비어있나? (데이터 push 후): " + s.isEmpty());

        System.out.println("현재 stack 데이터 출력: " + s);

        System.out.println();

        System.out.println("stack peek test: " + s.peek());

        System.out.println();

        System.out.println("search(2) test: " + s.search(2));
        System.out.println("search(3) test: " + s.search(3));
        System.out.println("search(4) test: " + s.search(4));

        System.out.println();

        System.out.println("pop() after" + s);
        System.out.println("pop() test: " + s.pop());
        System.out.println("pop() after: " + s);

        System.out.println();
        System.out.println("====================================================");
        System.out.println();

        MyQueue<Integer> q = new MyQueue<>();

        System.out.println("Queue가 비어있나? (데이터 enqueue 전): " + q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Queue가 비어있나? (데이터 enqueue 후): " + q.isEmpty());
        System.out.println();

        System.out.println("dequeue() before: " + q);

        System.out.println("dequeue() test: " + q.dequeue());

        System.out.println("dequeue() after: " + q);




    }
}