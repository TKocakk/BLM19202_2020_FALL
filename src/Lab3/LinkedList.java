/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author Tugce Kocak
 */
public class LinkedList {
    Node head;
    
    void addLast(int data){
        Node newNode=new Node(data);
        
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.nextNode!=null){
                temp=temp.nextNode;
            }
            temp.nextNode=newNode;
        }
    }
    
    void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.nextNode=head;
            head=newNode;
            
        }
    }
    void removeFirst(){
        if(head==null){
            System.out.println("Listede silinecek eleman yok");
        }
        else{
            System.out.println(head.data +" silindi");
            head=head.nextNode;
        }
    }
    
    void removeLast(){
        if(head==null){
            System.out.println("Listede silinecek eleman yok");
        }
        else{
            Node temp=head;
            while(temp.nextNode!=null){
                temp=temp.nextNode;
            }
            System.out.println(temp.data +" silindi");
            temp=null;
        }
    }
    
    void remove(int data){
        if(head==null){
            System.out.println("Liste bos, silinmedi");
        }
        else if(head.data==data){
            removeFirst();
        }
        else{
            Node temp=head;
            
            while(temp.nextNode!=null && temp.nextNode.data!=data){
                temp=temp.nextNode;
            }
            if(temp.nextNode!=null && temp.nextNode.data==data){
                temp.nextNode=temp.nextNode.nextNode;
            }
            
            
        }
    }
    void insertAfter(int search, int data){
        Node temp=head;
        
        while(temp!=null && temp.data!=search){
            temp=temp.nextNode;
        }
        if(temp!=null){
            Node newNode=new Node(data);
            newNode.nextNode=temp.nextNode;
            temp.nextNode=newNode;
        }else{
            addLast(data);
        }
    }
    
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" > ");
            temp=temp.nextNode;
        }
        System.out.println("null");
    }
    int size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.nextNode;
        }
        return count;
    }
    
    
}
