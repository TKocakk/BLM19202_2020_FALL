/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

    /*
                 15
                /  \
               6    18
              / \    \
             3   7    30
            / \   \  
           2   4   13 
     */
public class TestInteger {
    public static void main(String[] args) {
       BinarySearchTree <Integer> tree=new BinarySearchTree<>();
       tree.insert(15);
       tree.insert(6);
       tree.insert(3);
       tree.insert(7);
       tree.insert(2);
       tree.insert(4);
       tree.insert(13);
       tree.insert(18);
       tree.insert(30);
       
        System.out.println(tree.search(15));
        System.out.println(tree.search(1));
        System.out.println("En büyük eleman: "+tree.maxRec(tree.root));
         System.out.println("En küçük eleman: "+tree.min());
         System.out.println("Agacın eleman sayısı: "+tree.sizeRec(tree.root));
         System.out.println("Agacın yüksekliği: "+tree.heightOfTree(tree.root));
        tree.deleteRec(tree.root, 7);
         tree.preorder();
    }
}
