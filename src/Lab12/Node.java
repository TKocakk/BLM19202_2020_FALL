/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;
import java.util.LinkedList;
/**
 *
 * @author Tugce Kocak
 */
public class Node <T>{
    T data;
    Node <T> next;
    boolean visited;
    private LinkedList <Node<T>> komsuListesi;
    
    public Node(T data) {
        this.data = data;
        this.komsuListesi=new LinkedList<>();
        this.visited=false;
    }
    void addNeighbour(Node<T> node){
        komsuListesi.add(node);
    }
    LinkedList <Node<T>> getNeighbourList(){
        return this.komsuListesi;
    }
}
