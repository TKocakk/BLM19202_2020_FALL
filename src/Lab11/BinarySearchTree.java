/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

/**
 *
 * @author Tugce Kocak
 */
public class BinarySearchTree <T extends Comparable>{
    Node<T> root;

    void insert(T newData) {
        Node<T> newNode = new Node<>(newData);

        if (root == null) {
            root = newNode;
        } else {
            Node<T> temp = root;

            while (temp != null) {
                if (newData.compareTo(temp.data) > 0) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        return;
                    }
                    temp = temp.right;
                } else if (newData.compareTo(temp.data) < 0) {
                    if (temp.left == null) {
                        temp.left=newNode;
                        return;
                    }
                    temp=temp.left;
                }else {
                    return;
                }

            }
        }
    }
    void preorder() {
        System.out.print("preorder : ");
        preorder(root);
        System.out.println();
    }

    private void preorder(Node<T> node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    void inorder() {
        System.out.print("inorder : ");
        inorder(root);
        System.out.println();
    }

    private void inorder(Node<T> node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    void postorder() {
        System.out.print("postorder : ");
        postorder(root);
        System.out.println();
    }

    private void postorder(Node<T> node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
    boolean search(T data){
        if(root==null){
            System.out.println("Agac Bos!!");
        }else{
            Node <T> temp=root;
            while(temp!=null){
                if(data.compareTo(temp.data)==0)
                    return true;
                else if(data.compareTo(temp.data)<0)
                    temp=temp.left;
                else if(data.compareTo(temp.data)>0)
                    temp=temp.right;
            }
        }
            return false;
    }
    T min(){
        if(root==null){
            System.out.println("Agac Bos!!");
            return null;
        }
        Node <T> temp=root;
        while(temp.left!=null){
            temp=temp.left;
        }
        return temp.data;
    }
     T min(Node baslangic){
       while(baslangic.left!=null){
           baslangic=baslangic.left;
       }
       return (T)baslangic.data;
    }
    T max(){
        if(root==null){
            System.out.println("Agac bos!");
            return null;
        }
        Node <T> temp=root;
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp.data;
    }
    T maxRec(Node <T> n){
        if(n.right!=null){
            return maxRec(n.right);
        }
        return n.data;
    }
    int sizeRec(Node <T> n){
        if(n==null)
            return 0;
        else 
            return 1 + sizeRec(n.left) +sizeRec(n.right);
            
    }
    int heightOfTree(Node <T> n){
        if(n==null) return 0;
        int leftSub=heightOfTree(n.left);
        int rightSub=heightOfTree(n.right);
        return Math.max(leftSub, rightSub)+1;
    }
    
    Node deleteRec(Node <T> root,T key){
        if(root==null) return root;
        if(key.compareTo(root.data)<0)
            root.left=deleteRec(root.left, key);
        if(key.compareTo(root.data)>0)
            root.right=deleteRec(root.right, key);
        else{
            if(root.left==null)
               return root.right; 
            else if(root.right==null)
                return root.left;
            
            root.data= min(root.right);
            root.right=deleteRec(root.right, root.data);
        }
        return root;
    }
    
}
