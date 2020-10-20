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
public class TwoGen <T extends Number,V>{
    T obj1;
    V obj2;
    T nums[];
    TwoGen(T obj1, V obj2, T[] o){
        this.obj1=obj1;
        this.obj2=obj2;
        nums=o;
        
    }
    T getobj1(){
        return this.obj1;
    }
    
    V getobj2(){
        return this.obj2;
    }
    void showType(){
        System.out.println("Type of T is "+ obj1.getClass().getName());
        System.out.println("Type of V is "+ obj2.getClass().getName());
    }
    double average(){
        double sum=0.0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i].doubleValue();
        }
        return sum/nums.length;
    }
    
}
