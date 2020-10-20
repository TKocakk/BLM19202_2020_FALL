/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

/**
 *
 * @author Tugce Kocak
 */
public class jBox <T>{
    private T t;
    
    T get(){
        return t;
    }
    
    void add(T t){
        this.t=t;
    }
    
    void showType(){
        System.out.println("Type of this object "+t.getClass().getName());
    }
}
