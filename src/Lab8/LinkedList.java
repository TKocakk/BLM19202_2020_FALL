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
public class LinkedList <T>{
    Node<T> header;

    public LinkedList(T data) {
        this.header = new Node(data);
    }
    
    private Node addLast(T data,Node start){
        //base case
        if(start==null){
            start=new Node(data);
        }
        //recursive
        else{
            start.nextNode=addLast(data, start.nextNode);
        }
        return start;
    }
    void addLast(T data){
        addLast(data,this.header);
    }
    void printRecursive (Node ref){
        //base case
        if(ref==null)
            System.out.print("null");
        else{
            System.out.print(ref.data+"-> ");
            printRecursive(ref.nextNode);
            
        }
    }
    int size(Node start){
        if(start==null){
            return 0;
        }else{
            return 1+ size(start.nextNode);
        }
    }
    boolean search(int data,Node ref){
        if(ref==null){
            return false;
        }else if(ref.data.equals(data)){
            return true;
        }
        return search(data, ref.nextNode);
    }
    int sum(Node start){
        if(start==null){
            return 0;
        }else{
            return (int)start.data + (int)sum(start.nextNode);
        }
    }
    Node remove (T data,Node ref){
        if(ref==null){
            return null;
        }else{
            if(ref.data.equals(data)){
                return remove(data, ref.nextNode);
            }else{
                ref.nextNode=remove(data, ref.nextNode);
                return ref;
            }
                
        }
    }
    
}
