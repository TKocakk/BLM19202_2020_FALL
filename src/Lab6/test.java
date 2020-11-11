/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

import java.util.Arrays;

/**
 *
 * @author Tugce Kocak
 */
public class test {
    public static void main(String[] args) {
        HashTable table=new HashTable(6);
        System.out.println(table.put(123, "a"));
        System.out.println(table.put(2345, "b"));
        System.out.println(table.put(567, "c"));
        System.out.println(table.put(678, "d"));
        System.out.println(table.put(678902, "e"));
        System.out.println(table.put(3, "f"));
        System.out.println(table.put(45, "g"));
        System.out.println(table.getValue(567));
        table.print();
      
       
    }
}
