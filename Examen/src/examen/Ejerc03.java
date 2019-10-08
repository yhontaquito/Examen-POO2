package examen;

import java.util.Scanner;


public class Ejerc03 {
    public static void main(String[] args) {
       double C;
       Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el cateto opuesto ");
        double a=sc.nextDouble();
        System.out.println("ingrese el cateto adyacente");
        double b=sc.nextDouble();
        C=Math.sqrt((a*a+b*b));
        System.out.println("la hipotenusa del triangulo es" +C);
        
    }
    
}

