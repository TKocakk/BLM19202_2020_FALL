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
public class Box {
    private Object object;
    
    public Object get(){
        return this.object;
    }
    
    void add(Object object){
         this.object=object;
    }
    
    void showType(){
        System.out.println("Type of this object "+object.getClass().getName());
    }
}
