/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KisaSinavlar;

/**
 *
 * @author Tugce Kocak
 */
public class KisaSinav3 {

    Node2 head;

    void push(int data) {
        Node2 newNode = new Node2(data);
        newNode.nextNode = head;
        head = newNode;
    }
    int pop(){
        if(head==null){
            System.out.println("Empty Stack!");
            return -1;
        }else{
            int data=head.data;
            head=head.nextNode;
            return data;
        }
    }
    int peek(){
        if(head==null){
            return -1;
        }else{
            return head.data;
        }
    }
    // istenen metot sadece smash metodudur.
    void smash(int value){
        if(head==null)
            head=new Node2(value);
        else{
            KisaSinav3 tempStack=new KisaSinav3();
            while(this.peek()<value){
                tempStack.push(this.pop());
            }
            this.push(value);
            while(tempStack.peek()!=-1){
                this.push(tempStack.pop());
            }
        }
        
    }
    void print(){
        Node2 temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.nextNode;
        }
    }
    public static void main(String[] args) {
        KisaSinav3 stack=new KisaSinav3();
        stack.push(45);
        stack.push(11);
        stack.push(9);
        stack.push(7);
        stack.push(4);
        stack.smash(8);
        
        stack.print();
    }
    
}

