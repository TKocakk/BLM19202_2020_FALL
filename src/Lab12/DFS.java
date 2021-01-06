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
public class DFS<T> {

    void dfsIteratif(Node<T> startNode) {
        Stack<Node<T>> stack = new Stack<>();
        stack.push(startNode);
        startNode.visited = true;

        while (!stack.isEmpty()) {
            Node<T> pop = stack.pop();
            System.out.print(pop.data + " ");

            for (Node<T> neighbour : pop.getNeighbourList()) {
                if (!neighbour.visited) {
                    stack.push(neighbour);
                    neighbour.visited = true;
                }
            }
        }
        System.out.println("");
    }
    
   void dfsRecursive(Node <T> startNode){
       System.out.print(startNode.data+" ");
       startNode.visited=true;
       
       for (Node<T> neighbour : startNode.getNeighbourList()) {
           if(!neighbour.visited)
               dfsRecursive(neighbour);
       }
   }
   void reset(Node <T> startNode){
       startNode.visited=false;
       
       for (Node<T> neighbour : startNode.getNeighbourList()) {
           if(neighbour.visited)
               reset(neighbour);
       }
   }
   boolean path(Node<T> source,Node<T> destination){
       source.visited=true;
       if(source.equals(destination)){
           return true;
       }
       for (Node<T> neighbour : source.getNeighbourList()) {
           if(!neighbour.visited){
               System.out.print(neighbour.data+" ");
               return path(neighbour,destination);
           }
       }
       return false;
   }
   String printPath(Node<T> source,Node<T> destination){
       source.visited=true;
       if(source.equals(destination)){
           return destination.data +": path bulundu";
       }
       String result;
       for (Node<T> neighbour : source.getNeighbourList()) {
           if(!neighbour.visited){
               result= source.data +" -> " + printPath(neighbour,destination);
               
               if(result.contains("bulundu")){
                   return result;
               }
           }
       }
       return "no path";
   }
}
