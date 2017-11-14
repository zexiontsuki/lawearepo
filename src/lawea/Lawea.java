/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lawea;

import java.util.Scanner;

/**
 *
 * @author zexiontsuki
 */
public class Lawea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int radio;
        int area;
            System.out.println("Hola weoncd");
            Scanner sc=new Scanner(System.in);
            
           System.out.println("Ingresa radio del circulo por favor");
           radio=sc.nextInt();
           
          area=(int) (Math.PI*(Math.pow(radio, 2)));
           
           System.out.println("EL radio es "+ area);
    }
    
}
