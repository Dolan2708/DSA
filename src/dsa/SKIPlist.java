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
public class SKIPlist implements ADT{

    @Override
    public void findElement() {
        System.out.println("findElementSKIPlist");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertElement() {
        System.out.println("insert Element");
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeElement() {
        System.out.println("removeElement");
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void closestKeyAfter() {
        System.out.println("closestKeyAfter");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[]) {
      SKIPlist fe = new SKIPlist();
      fe.findElement();
      fe.insertElement();
      fe.removeElement();
      fe.closestKeyAfter();
}
}

