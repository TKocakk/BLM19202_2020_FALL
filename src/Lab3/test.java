package Lab3;

/**
 *
 * @author Tugce Kocak
 */
public class test {
    public static void main(String[] args) {
     LinkedList liste =new LinkedList();
     liste.addLast(7);
     liste.addLast(6);
     liste.addFirst(5);
     liste.print();
     
     liste.insertAfter(7, 2);
     liste.addFirst(2);
     liste.print();
     liste.remove(2);
     liste.print();
    }
}
