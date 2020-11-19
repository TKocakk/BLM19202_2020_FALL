/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab7;

/**
 *
 * @author Tugce Kocak
 */
public class Node <T>{
    T data;
     Node <T> next;
    public Node(T data) {
        this.data = data;
        this.next=null;
    }
   
    
}
