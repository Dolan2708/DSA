/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;
import java.util.Scanner;
/**
 *
 * @author Radhika
 */
public class AVL implements ADT{
         static AVLInsertElement abc = new AVLInsertElement();
         static AVLDeleteElement pqr = new AVLDeleteElement();
       static int x;
    @Override
    public void findElement() {
           System.out.println("findElementAVL");
           System.out.println("Enter the element to be searched");
           
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


     @Override
    public void insertElement(int p) {
              if(x == 1) 
              {
            abc.insert(p);
                 abc.display();
              }
              else
              {
                  //insert code for skip list;
              }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeElement(int q) {
        if(x == 1)
        {
            pqr.delete(q);
            pqr.display();
           System.out.println("removeElement");
        }
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closestKeyAfter() {
           System.out.println("closestKeyAfter");
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        Scanner num = new Scanner(System.in);
                System.out.println("Select 1 for AVL and 2 for skip list");
                x= num.nextInt();
                 AVL avl = new AVL();
                 System.out.println("this is an AVL tree.");  
                 char ch;
            
                 do
                 {
                  System.out.println("Select 1 for insert element."); 
                  System.out.println("Select 2 for find element.");
                  System.out.println("Select 3 for remove element.");
                     int choice = num.nextInt(); 
                      switch (choice)
                        {       
                            case 1 : //insertion
                              System.out.println("Enter element to insert in AVL tree");
                                 for(int i=0;i<3;i++)
                                 {
                                    Scanner sc=new Scanner(System.in);   //scan value for insertion
                                      int a=sc.nextInt();
                                     avl.insertElement(a);  
                                 }      
                             break; 
                             case 2 :  //find element
                                System.out.println("Enter element to search in AVL tree");  
                             break;
                             case 3 :   //delete element
                                System.out.println("Enter element to delete in AVL tree");  
                                Scanner sc=new Scanner(System.in);   //scan value for insertion
                                      int a=sc.nextInt();
                                     avl.removeElement(a); 
                                
                              break;
                             default : //wrong entry
                                 System.out.println("Wrong Entry \n ");
                             break;  
                        }
                       System.out.println("\nDo you want to continue ( y or n)");
                         ch = num.next().charAt(0);                        
                }
                 while (ch == 'y' || ch == 'Y');        
    }   
       
}

   

    


