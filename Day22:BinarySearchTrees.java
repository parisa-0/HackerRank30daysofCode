import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

/*
Heap - root has special relations with children, but children have no relationship with eachother.
Min heap - smaller data is higher in the tree
i.e: Golfing 18 holes, want to know who has the best score? Lowest score wins
Max heap - largest element as the root.
To get child index of first node: root * 2, root * 2 + 1. To get parent node do child/2
Binary search trees, the left node is less than the root node and the right node is greater than the root node
A tree is a recursive data structure because each node has a reference to its other subtrees.
We can implement using array: To get parent node do child/2.
To get child index of first node: (left) root * 2, (right) root * 2 + 1
Solve challenge recursively first.
*/

class Solution{

    public static int getHeight(Node root){
        if (root == null) { 
           return -1; 
        } 
        else  
        { 
             return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
