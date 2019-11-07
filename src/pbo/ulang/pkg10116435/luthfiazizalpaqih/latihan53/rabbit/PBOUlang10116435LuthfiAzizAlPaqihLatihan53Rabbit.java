/*
 * To change this license header, choose License Headers in Project Properties.
 * nTo change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.luthfiazizalpaqih.latihan53.rabbit;

/**
 *
 * @author Luthfi
 * NIM  : 10116435
 * NAMA : Luthfi Aziz Al Paqih
 */
public class PBOUlang10116435LuthfiAzizAlPaqihLatihan53Rabbit {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit ("Peter",false,"Grass",4,"Grey");
        
        System.out.println("Hello, his name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is Vegetarian? "+rabbit.isVegetarian());
        System.out.println(rabbit.getName()+" eats "+rabbit.getEats());
        System.out.println(rabbit.getName()+" has "+rabbit.getNoOfLegs()+" legs");
        System.out.println(rabbit.getName()+" color is "+rabbit.getColor());
    }
    
}
