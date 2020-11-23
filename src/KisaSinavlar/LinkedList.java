package KisaSinavlar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tugce Kocak
 */
public class LinkedList {
    Node2 head;
    
    void addLast(int data){
        Node2 newNode=new Node2(data);
        
        if(head==null){
            head=newNode;
        }
        else{
            Node2 temp=head;
            while(temp.nextNode!=null){
                temp=temp.nextNode;
            }
            temp.nextNode=newNode;
        }
    }
    
    void addFirst(int data){
        Node2 newNode=new Node2(data);
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
            Node2 temp=head;
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
            Node2 temp=head;
            
            while(temp.nextNode!=null && temp.nextNode.data!=data){
                temp=temp.nextNode;
            }
            if(temp.nextNode!=null && temp.nextNode.data==data){
                temp.nextNode=temp.nextNode.nextNode;
            }
            
            
        }
    }
    void insertAfter(int search, int data){
        Node2 temp=head;
        
        while(temp!=null && temp.data!=search){
            temp=temp.nextNode;
        }
        if(temp!=null){
            Node2 newNode=new Node2(data);
            newNode.nextNode=temp.nextNode;
            temp.nextNode=newNode;
        }else{
            addLast(data);
        }
    }
    
    void print(){
        Node2 temp=head;
        while(temp!=null){
            System.out.print(temp.data +" > ");
            temp=temp.nextNode;
        }
        System.out.println("null");
    }
    int size(){
        Node2 temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.nextNode;
        }
        return count;
    }
}