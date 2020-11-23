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
public class KisaSinav1{
    // Prototipi verilen metot için parametre olaraak girilen 
    // bir Linked Listteki max ve min elemanı bulan metotu yazınız.
    int [] findMaxMin(LinkedList lst){
        int [] minMaxArray=new int [2];
        int min = 0,max = 0;
        Node2 temp=lst.head;
        if(temp!=null)
            min=max=(int)lst.head.data;
        while(temp!=null){
            if(temp.data>max)
                max=temp.data;
            else if(temp.data<min)
                min=temp.data;
        }
        minMaxArray[0]=max;
        minMaxArray[1]=min;
        return minMaxArray;
    }

    
}

