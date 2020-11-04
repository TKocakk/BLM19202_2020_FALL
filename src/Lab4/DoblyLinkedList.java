/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

/**
 *
 * @author Tugce Kocak
 */
public class DoblyLinkedList <T>{
    Node<T> header,tail;
    private int size=0;
    DoblyLinkedList(T data){
        Node <T> newNode=new Node(data);
        header=tail=newNode;
        size++;
    }
    void addFirst(T data){
        Node <T> newNode=new Node(data);
        if(header==null){
            header=tail=newNode;
        }else{
            newNode.next=header;
            header.prev=newNode;
            header=newNode;
        }
        size++;
    }
    void addLast(T data){
        Node <T> newNode=new Node(data);
        if(header==null){
            header=tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=newNode;
            tail=newNode;
        }
        size++;
    }
    void addSomewhere(T find,T data){
        if(header==null){
            System.out.println("Aranılan eleman yok");
        }else if(tail.data.equals(find)){
            addLast(data);
        }else{
            Node <T> temp=header;
            while(temp!=null && !temp.data.equals(find)){
               temp=temp.next;
            }
            if(temp!=null){
                Node <T> newNode=new Node(data);
                newNode.next=temp.next;
                newNode.prev=temp;
                temp.next.prev=newNode;
                temp.next=newNode;
                size++;
            }else{
                System.out.println("Aranılan eleman bulunamadı, data eklenilemedi");
            }
        }
    }
    T removeFirst(){
        T data=null;
         if(header==null){
            System.out.println("Silinecek eleman yok");
        }else{
             data=header.data;
             header=header.next;
             if(header==null){
                 tail=null;
             }
             size--;
         }
         return data;
    }
    T removeLast(){
        T data=null;
         if(header==null){
            System.out.println("Silinecek eleman yok");
        }else{
         data=tail.data;
         tail=tail.prev;
         tail.next=null;
         size--;
         
         }
         return data;
    }
    void remove(T data){
        Node <T> temp=header;
        if(temp!=null && temp.data.equals(data)){
            removeFirst();
        }else if(tail!=null && tail.data.equals(data)){
             removeLast();
        }else{
            temp=temp.next;
            while(temp!=null && !temp.data.equals(data)){
                temp=temp.next;
            }
            if(temp!=null){
                temp.next.prev=temp.prev;
                temp.prev.next=temp.next;
                size--;
                System.out.println(temp.data+" listeden silindi");
            }else{
                System.out.println("Aranılan data bulunamadı");
            }
        }
    }
    int getsize(){
    return size;
     }
    void print(){
        Node <T> temp=header;
        while(temp!=null){
            System.out.print(temp.data+ " -> ");
            temp=temp.next;
        }
        System.out.println(" null");
    }
    
}
