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
public class DFstest {
    public static void main(String[] args) {
        Node <String> ns=new Node<>("S");
        Node <String> na=new Node<>("A");
        Node <String> nb=new Node<>("B");
        Node <String> nc=new Node<>("C");
        Node <String> nd=new Node<>("D");
        Node <String> ne=new Node<>("E");
        Node <String> ng1=new Node<>("G1");
        Node <String> ng2=new Node<>("G2");
        
        ns.addNeighbour(nb);
        ns.addNeighbour(na);
        na.addNeighbour(nc);
        na.addNeighbour(nd);
        nb.addNeighbour(ne);
        nb.addNeighbour(ng2);
        nc.addNeighbour(nd);
        nc.addNeighbour(ns);
        nd.addNeighbour(nb);
        nd.addNeighbour(ng1);
        ne.addNeighbour(ng2);
        ng1.addNeighbour(nc);
        ng2.addNeighbour(nb);
        
        DFS dfs=new DFS();
//        dfs.dfsIteratif(ns);
//        dfs.reset(ns);
//        dfs.dfsRecursive(ns);
        System.out.println(dfs.printPath(ns, ng1));
      //  System.out.println(dfs.path(ns, nc));
        
    }
}
