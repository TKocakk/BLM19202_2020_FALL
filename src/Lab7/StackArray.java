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
public class StackArray <T>{
    private T [] dataArray;
    private int top;
    public StackArray(int capacity){
        dataArray= (T[])new Object[capacity];
        top=-1;
    }
    void push(T data){
        if(isFull())
            System.out.println("Stack is Full!");
        else{
            dataArray[++top]=data;
        }
    }
    T pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return null;
        }
        else{
            return dataArray[top--];
        }
    }
    T peek(){
        if(isEmpty())
            return null;
        else
            return dataArray[top];
    }
    boolean isFull(){
        return top+1==dataArray.length;
    }
    boolean isEmpty(){
        return top==-1;
    }
    void print(){
        if(isEmpty())
            System.out.println("Empty Stack!");
        else{
            for (int i = top; i >=0; i--) {
                System.out.println(dataArray[i]);
            }
        }
    }
    int size(){
        return top+1;
    }
    
    public static void main(String[] args) {
        StackArray <Integer> mystack=new StackArray(10);
        mystack.push(5);
        mystack.push(2);
        mystack.push(7);
        mystack.print();
        System.out.println("----------------");
        System.out.println("Pop : "+mystack.pop());
        mystack.print();
        System.out.println("Size : "+mystack.size());
        System.out.println("Peek : "+mystack.peek());
        mystack.pop();
        mystack.pop();
        mystack.pop();
        System.out.println("Size : "+mystack.size());
    }
    
}
