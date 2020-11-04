/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author Tugce Kocak
 */
public class Personel {
    String isim;
    int maas;

    public Personel(String isim, int maas) {
        this.isim = isim;
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Personel{" + "isim=" + isim + ", maas=" + maas + '}';
    }
    
}
