/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author Tugce Kocak
 */
public class HashEntry <T,G>{
    T key;
    G value;

    public HashEntry(T key, G value) {
        this.key = key;
        this.value = value;
    }
    
}
