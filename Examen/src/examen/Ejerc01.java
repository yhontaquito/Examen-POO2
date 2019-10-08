package examen;

import java.util.Scanner;


public class Ejerc01 {
    public static void main(String[] args){
        
        Scanner lector= new Scanner(System.in);
        System.out.println("ingrese el numnero de digitos :");
        int n=lector.nextInt();
        int [] Arreglo=new int [n];
        for (int i=0;i<n;i++)
        {
            Arreglo[i]=lector.nextInt();
        }   
        int menor,mayor;
        menor=mayor=Arreglo[0];
        for(int j=1;j<n;j++)
        {
            if(Arreglo[j]>mayor)
            {
            mayor=Arreglo[j];
            }
            if (Arreglo[j]<menor)
            {
            menor=Arreglo[j];
            }               
        }  
        System.out.println("digito mayor :");
        System.out.println(mayor);
        System.out.println("digito menor :");
        System.out.println(menor);       
        
   }  
}

