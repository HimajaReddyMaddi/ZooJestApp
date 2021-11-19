/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo06group;

import java.lang.invoke.StringConcatException;

/**
 *Giraffe class (derived subclass of the superclass Animal)
 * 
 * @author Himaja Reddy Maddi
 */
public class Giraffe extends Animal {

    /**
     * Giraffe constructor
     *
     * @param name - the name of this Giraffe
     */
    public Giraffe(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm giraffe!", this.name);
    }

    @Override
    public void move() {
        System.out.println("When I move, I run, run, run.");

    }

    /**
     * Custom Giraffe function for performing an operation
     *
     * 
     */
    public void multiply()  {
        double a = 1.5;
        int b = 4;
        double c = getGiraffeMultiplication(a, b);
        System.out.printf("I know GiraffeMultiplication! %4.2f times %d is %4.2f \n", a, b, c);
    }
    
    public void divide() {
   try{
        int a = 4;
        int b = 0;
        System.out.println(a/b);
    }
   catch(ArithmeticException e){
       System.out.println("Exception occured");
}
   finally{
       System.out.println("Exception Handling");
   }
    }
    
    public void addition() throws ArrayIndexOutOfBoundsException{
        try{
            int[] arr= {1,2,3};
            int add= arr[2]+arr[3];
            System.out.println("addition of two elements:" + add);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        finally{
            System.out.println("Exception Handling");
        }
    }
    
    public void concat() throws StringIndexOutOfBoundsException{
        try{
            String name="Himaja";
            for(int i=0;i<name.length();i++){
                System.out.println("Char at index 6 is "+ name.charAt(6));
            }
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
    

    /**
     * Custom Giraffe function 
     *
     * @param leg1 double input
     * @param leg2 int input
     * @return double multiplied value
     */
    public double getGiraffeMultiplication(double leg1, int leg2) {
        return leg1 * leg2;
    }

    public static void main(String[] args) {
        var giraffe = new Giraffe("Spike");
        giraffe.speak();
        giraffe.move();
        giraffe.multiply();
        giraffe.divide();
        giraffe.addition();
      giraffe.concat();
    }


}
