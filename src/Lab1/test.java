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
public class test {
    public static void main(String[] args) {
        
        Box Integerbox=new Box();
        Integerbox.add(new Integer(10));
        Integer someInteger=(Integer) Integerbox.get();
//        String s=(String) Integerbox.get();
//        System.out.println(s);
    //    Integerbox.showType();
        
        jBox <Integer> jbox=new jBox<>();
        
        jbox.add(5);
        Integer str1=jbox.get();
        //jbox.showType();
        Integer [] dizi=new Integer[3];
        dizi[0]=5;
        dizi[1]=3;
        dizi[2]=7;
        TwoGen <Integer, String> tBox=new  TwoGen<>(5,"abc",dizi);
        System.out.println(tBox.average());
        Integer x=tBox.getobj1();
        
        tBox.showType();
    }
}
