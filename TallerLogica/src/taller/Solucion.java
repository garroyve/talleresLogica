/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author 503
 */
import java.util.Scanner;
public class Solucion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
      int Operacion1 = 3+((8*5)-(6/3));
        System.out.println("El resultado es " + Operacion1);
        

      double Operacion2 = ((2.5*2*3)-(4/2)+8);
         System.out.println("El resultado es " + Operacion2);
        
      double  Operacion3= (2*(6-2.5))/3;
        System.out.println("El resultado es " + Operacion3);
        
     boolean Operacion4 = 25>18;
      System.out.println("El resultado es " + Operacion4);
      
      boolean Operacion5 = ((3+2.5)*4)/3 != (4*5.2)-3.8;
       System.out.println("El resultado es " + Operacion5);
       
      boolean Operacion6 = (8.5/3.2+6.5-(2.3*5)/6 >= 15.8) && (21.4<81/4+2);
       System.out.println("El resultado es " + Operacion6);
        System.out.println("--------------------------");
      Rectangulo();
       
    }
    
    
    public static void Rectangulo (){
     
        double base, altura;
        System.out.println("Ingrese la base: ");
        base = sc.nextDouble();
        System.out.println("ingrese la altura: ");
        altura = sc.nextDouble();
      
        double area = base*altura;
        System.out.println("El area del rectangulo es " + area + " cm2");
        
       
        double perimetro = (base*2) + (altura*2);
          System.out.println("El perimetro del rectangulo es " + perimetro + " cm");
    }
        
    public static void Carbon(){
    
    }
    
}
