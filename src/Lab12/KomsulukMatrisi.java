/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12;

/**
 *
 * @author Tugce Kocak
 */
public class KomsulukMatrisi {
    
    static String findAdj(int [][] matris,int v){
        String adj="";
        for (int i = 0; i < matris[v].length; i++) {
            if(matris[v][i]==1){
                adj+=i+" - ";
            }
        }
        return adj;
    }
    
    public static void main(String[] args) {
                             //0,1,2,3,4,5,6,7,8,9,10,11,12,13,14
        int [][] adjMatrix = {{0,0,0,0,0,1,1,0,0,0, 0, 0, 0, 0, 0},
                              {0,0,0,0,0,0,1,1,0,0, 0, 0, 0, 0, 0},
                              {0,0,0,1,0,0,0,0,0,0, 0, 0, 0, 0, 0},
                              {0,0,0,0,1,0,0,0,0,0, 0, 0 ,0 ,0 ,0},
                              {0,0,0,0,0,0,0,0,0,1, 0, 0 ,0 ,0 ,0},
                              {0,0,0,0,0,0,1,0,0,0, 0, 0, 0, 0, 0},
                              {0,1,0,0,0,0,0,1,0,0, 0, 0, 0, 0, 0},
                              {0,0,1,0,0,0,0,0,0,0, 0, 0, 0, 1, 0},
                              {0,0,0,0,0,0,0,1,0,0, 0, 0, 0, 0, 0},
                              {0,0,0,1,0,0,0,0,0,0, 0, 0, 0, 0, 1},
                              {0,0,0,0,0,1,0,0,0,0, 0, 0, 0, 0, 0},
                              {0,0,0,0,0,0,1,0,0,0, 0, 0, 0, 0, 0},
                              {0,0,0,0,0,0,1,1,0,0, 0, 1, 0, 0, 0},
                              {0,0,0,0,0,0,0,0,0,0, 0, 0, 1, 0, 0},
                              {0,0,0,0,0,0,0,0,0,0, 0, 0, 0, 0, 0}};
        
        for (int i = 0; i < adjMatrix.length; i++) {
            System.out.println(i+". nodun komsuları="+ findAdj(adjMatrix, i));
        }
        
    }
}
