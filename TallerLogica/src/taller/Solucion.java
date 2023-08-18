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
      System.out.println("--------------------------");
      Carros();
      System.out.println("--------------------------");
      AppB();
      System.out.println("--------------------------");
      Numeros();
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
    public static void Carros () {
        double comision;
        System.out.println("Ingrese el nombre del auto vendido: ");
       String  autoVend = sc.next();
        System.out.println("ingrese el precio del auto : ");
       int   precio = sc.nextInt();
       
       if(precio <=100000){
           comision = (precio *0.015);
           System.out.println("Su comision es de : " + comision);
       }else if(precio >100000 && precio <=250000){
           comision = (precio * 0.018);
           System.out.println("Su comision es de : " + comision);
       }else if(precio >250000){
           comision = (precio * 0.023);
           System.out.println("Su comision es de : " + comision);
       }
    
    
        
    }
    
    public static void AppB() {
         System.out.println("BIENVENIDO " + "\n" +
                 "----------- " + "\n" +
                 "ingrese 1 si quiere consultar su saldo " + "\n" +
                 "ingrese 2 si desea realizar transaciones " + "\n" +
                 "ingrese 3 si desea cambiar la clave " + "\n" +
                 "ingrese 4 para bloquear producto " + "\n" +
                 "ingrese 5 para donaciones  " + "\n"  );
                 
            int   opcion = sc.nextInt();   
            
            switch (opcion) {
            case 1:
                System.out.println("su saldo es : $$$$$$$" );
                break;
            case 2:
                System.out.println("trasacion exitosa" );
                break;  
            case 3 :
                System.out.println("cambio de cable exitosa" );
                break;   
                case 4:
                System.out.println("producto bloqueado" );
                break;
            case 5:
                System.out.println("Donacion realizada" );
                break;    
            default:
                System.out.println("error intenta de nuevo ");
        }
            
    
                 
                
                      
    }
    
    public static void Numeros() {
        int contador = 0;
        
        for(int i = 0; i <100; i++){
            contador = contador +2;
            System.out.println(contador );
        }
        
    }
    
    
}
