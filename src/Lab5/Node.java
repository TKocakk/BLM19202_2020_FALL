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
public class Node<T> {
    Node next;
    T data;
    Node(T data){
        this.data=data;
        this.next=null;
    }
}
