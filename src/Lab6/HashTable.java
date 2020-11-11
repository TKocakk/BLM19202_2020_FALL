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
public class HashTable <T,G> {
    
    private HashEntry<T, G>[] table;

    public HashTable(int dimension) {
        table= new HashEntry[dimension];
    }
    
    boolean put(T key,G value){
        int index= hashFunction(key);
        if(table[index]==null){
            table[index]= new HashEntry(key,value);
            return true;
        }else{
            // linear probing
            int tempIndex=index+1;
            while(tempIndex!=index){
                if(table[tempIndex]==null){
                    table[tempIndex]=new HashEntry(key,value);
                    return true;
                }
                tempIndex=(tempIndex+1)%table.length;
            }
            return false;
        }
    }
    
    G getValue(T key){
        int index=hashFunction(key);
        if(table[index]!=null && table[index].key.equals(key)){
            return table[index].value;
        }else{
            int tempIndex=index+1;
            while(tempIndex!=index){
                if(table[tempIndex]!=null && table[tempIndex].key.equals(key)){
                    return table[tempIndex].value;
                    
                }
                tempIndex=++tempIndex%table.length;
            }
            return null;
            
        }
    }
    int hashFunction(T key){
        String str=key.toString();
        return str.length()%table.length;
    }
    
    void print(){
        for (int i = 0; i < table.length; i++) {
            if(table[i]==null){
                System.out.println("["+i+"] = null");
            }else{
                System.out.println("["+i+"] = "+table[i].key +","+ table[i].value);
            }
        }
    }
}
