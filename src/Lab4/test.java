
package Lab4;

/**
 *
 * @author Tugce Kocak
 */
public class test {
    public static void main(String[] args) {
        DoblyLinkedList<String> liste=new DoblyLinkedList("eleman1");
        
        liste.addFirst("eleman2");
        liste.addLast("eleman3");
        liste.print();
        System.out.println(liste.getsize());
        liste.addSomewhere("eleman1", "eleman4");
        liste.print();
        System.out.println(liste.getsize());
        liste.removeFirst();
        liste.print();
        liste.removeLast();
        liste.print();
        liste.addLast("eleman5");
        liste.print();
        liste.remove("eleman4");
        liste.print();
        System.out.println(liste.getsize());
        liste.remove("eleman");
    }
}
