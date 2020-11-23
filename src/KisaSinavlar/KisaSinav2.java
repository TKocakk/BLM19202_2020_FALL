package KisaSinavlar;

/**
 *
 * @author Tugce Kocak
 */
class Node<T> {

    T data;
    Node<T> head;
    Node<T> next;
    Node<T> sameNext;

    Node(T data) {
        this.data = data;
        this.next = null;
        this.sameNext = null;
    }
}

public class KisaSinav2<T> {

    Node<T> head;

    public KisaSinav2(T data) {
        this.head = new Node<>(data);
    }
    // istenen metot sadece addLast metodudur.
    void addLast(T newData) {
        Node newNode = new Node<T>(newData);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            // önce sameNext' e kaydeder
            while (temp != null && !temp.data.equals(newData)) {
                temp = temp.next;
            }
            while (temp != null) {
                if (temp.sameNext == null) {
                    temp.sameNext = newNode;
                    break;
                }
                temp = temp.sameNext;
            }
            //ardından listenin sonuna eklenir
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    //ana listeyi yazdırır.
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " > ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // same datanın olduğu bağlı listeyi yazdırır.
    void print(T data) {
        Node temp = head;
        while (temp != null && !temp.data.equals(data)) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " > ");
            temp = temp.sameNext;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        KisaSinav2 liste = new KisaSinav2(2);
        liste.addLast(5);
        liste.addLast(2);
        liste.addLast(7);
        liste.addLast(5);
        liste.addLast(5);
        liste.print();
        liste.print(2);
        liste.print(5);
        liste.print(7);

    }
}
