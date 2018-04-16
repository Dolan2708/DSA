/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsa;

/**
 *
 * @author Radhika
 */
            
public class AVLInsertElement
{
 private class Node
    {
        int element;  //value of node
        int height; //to calcualte height of tree
        Node left; //left child
        Node right;  //right child
        Node(int element) //constructor
        {
            this.element=element;
            this.height=0; 
            // if height = 0,1 or -1 , then it is a balanced tree
       //here height is considered as 0
        }
    }
    private Node root;  //root node for tree
    // root is private because no external class can change the root node
     private int height(Node node) //calculate height
    {
        if(node == null)
        {
            return -1; //there won't be any height for null node
        }
    return node.height; //if node is not null then return height 
    }
    private int bf(Node node) //calculate balancing factor bf
    {
        if(node == null) //node is null 
        {
            return 0; //bf is 0
        }
        return height(node.left) - height(node.right);  //bf = height of left subtree - height of right subtree
    }
    public void insert(int item)  //insert item in tree
    {
        this.root = insert(this.root,item); //insert function will have a root node and second item
        //value returned by node will be saved in this.root
    }
    private Node insert(Node node, int item) //return type is Node 
            //Node will return the root of subtree where the value is added
    {
        if(node == null)   //node is null
        {
            Node newnode = new Node(item);
            return newnode;
        }
        if(item > node.element) //item is greater than root node
        {
            node.right = insert(node.right,item); //insert on right side
        }
        else if(item < node.element) //item is smaller than root node
        {
            node.left = insert(node.left,item); //insert on left side
        }
        node.height= Math.max(height(node.left), height(node.right)) +1; //update height of node
        // formula for height = max(height of left child,height of right child)+1
       
        int bf = bf(node); //calculate balancing factor
        //There are four cases : LL, RR, LR, RL
        //LL case needs right rotation
        if(bf > 1 && item < node.left.element)
        {
            return rightRotation(node);
        }
        //RR case needs left rotation
         if(bf < -1 && item > node.right.element)
        {
          return leftRotation(node);
        }
          //LR case needs right rotation then left rotation
         if(bf > 1 && item > node.left.element)
        {
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
          //RL case needs right rotation then left rotation
         if(bf < -1 && item < node.left.element)
        {
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node; 
          //Node will return the root of subtree where the value is added
    }
   
    private Node rightRotation(Node r)  //right rotation 
    {
        Node c1= r.left;   //r=root                                                                      r 
        //c1 is left child of r                                                                     c1      c2
        Node c4=c1.right;   //                                                                  c3      c4
        // c3 is left child of c1 and c4 is right child of c1                               c5      c6
        
        //now let's rotate
        c1.right=r;  //c1 will become new root
        r.left= c4;  //left child of r will be c4 and right child will remain c2.
        
         //calculate height of tree
        r.height = Math.max(height(r.left), height(r.right))+1;  //calcuate height of r after rotation
        c1.height = Math.max(height(c1.left), height(c1.right))+1;  //calcuate height of c1 after rotation
        return c1; //new root
    }
     private Node leftRotation(Node r)
    {
        Node c1= r.right;   //                                                                             r
        // c1 is right child of r                                                                      c5     c1
        Node c6=c1.left;    //                                                                              c6    c3
        //c4 is left child of c3 and c2 is right child of c3                                                    c4    c2
        
        //now let's rotate
        c1.left=r; //c1 will become new root
        r.right= c6;   //right child of r will be c6 and left child will remain c5.
        
        //calculate height of tree
        r.height = Math.max(height(r.left), height(r.right))+1;  //calcuate height of r after rotation
        c1.height = Math.max(height(c1.left), height(c1.right))+1;   //calcuate height of c1 after rotation
        return c1; //new root 
    }
    public void display() //display AVL insertion tree
    {
        display(this.root);  
    }
    private void display(Node node)  //user will call public display function and then public display function will call private display function
    {
        if (node == null) //node is null then just return
        {
            return ;
        }
        String str = "";
        if(node.left == null)
        {
          str = str + "no child";   //no child of node
        }
        else
        {
            str = str + node.left.element; //add on left side
        }
        str = str + " - " + node.element + " - ";
        if(node.right == null)
        {
          str = str + "no child";   //no child of node 
        }
        else
        {
            str = str + node.right.element; //add on right side
        }
        System.out.println(str);
        display(node.left);  //display left
        display(node.right);  //display right
    }
}



    

