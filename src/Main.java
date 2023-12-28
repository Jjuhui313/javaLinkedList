import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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

        System.out.println("--- --- --- --- --- --- --- ---");

        System.out.println("get(index 1) test: " + ml.get(1));
        System.out.println("get(index 2) test: " + ml.get(2));

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

    }
}