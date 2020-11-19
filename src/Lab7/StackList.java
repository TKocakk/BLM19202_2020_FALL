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
public class StackList<T> {

    Node<T> head;

    void push(T data) {
        Node<T> newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    T pop(){
        if(head==null){
            System.out.println("Empty Stack!");
            return null;
        }else{
            T data=head.data;
            head=head.next;
            return data;
        }
    }
    T peek(){
        if(head==null){
            return null;
        }else{
            return head.data;
        }
    }
    int size(){
        int size=0;
        Node <T> temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    void print(){
        Node <T> temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        StackList<Integer> stack=new StackList();
        stack.push(5);
        stack.push(78);
        stack.push(23);
        stack.print();
        System.out.println("---------------------------");
        System.out.println("Pop edilen eleman= "+ stack.pop());
        stack.print();
        System.out.println("Stack size= "+ stack.size());
        System.out.println("Peek: "+stack.peek());
        stack.print();
    }
}
