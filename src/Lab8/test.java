/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author Tugce Kocak
 */
public class test <T>{
    public static void main(String[] args) {
        LinkedList <Integer> list=new LinkedList(6);
        list.addLast(5);
        list.addLast(3);
        list.addLast(9);
        list.printRecursive(list.header);
        System.out.println("");
        System.out.println("Listenin boyutu: "+ list.size(list.header));
        System.out.println(list.search(4,list.header ));
        System.out.println("Listenin elemanlarının toplamı: "+ list.sum(list.header));
        list.remove(3, list.header);
        list.printRecursive(list.header);
    }
}
