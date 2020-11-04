/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author Tugce Kocak
 */
public class test {
    public static void main(String[] args) {
//        Queue<String> kuyruk= new Queue<>();
//        kuyruk.enqueue("eleman1");
//        kuyruk.print();
//        System.out.println(kuyruk.getsize());
//        kuyruk.enqueue("eleman2");
//        kuyruk.enqueue("eleman3");
//        kuyruk.print();
//        System.out.println(kuyruk.getsize());
//        System.out.println(kuyruk.dequeue());
//        kuyruk.print();
//        System.out.println(kuyruk.getsize());
//        Queue<Personel> pkuyruk=new Queue<>();
//        Personel p1=new Personel("fatih", 2000);
//        Personel p2=new Personel("ayse", 3000);
//        pkuyruk.enqueue(p1);
//        pkuyruk.enqueue(p2);
//        pkuyruk.print();

        queue_array kuyruk1=new queue_array(5);
        kuyruk1.enqueue(7);
        kuyruk1.enqueue(3);
        kuyruk1.enqueue(2);
        kuyruk1.enqueue(1);
        kuyruk1.print();
        
        kuyruk1.enqueue(8);
        kuyruk1.enqueue(9);
         kuyruk1.print();
          System.out.println(kuyruk1.dequeue());
          kuyruk1.enqueue(10);
           kuyruk1.print();
          
          
    }
}
