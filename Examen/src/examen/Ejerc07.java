package examen;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Ejerc07 {
    public static void main(String[] ARGS){
		Scanner obtener = new Scanner(System.in);
		int estudiantes,i,edadMayor,edadMenor,edad,sumaedad;
 
		System.out.print("Ingrese la cantidad de estudiantes: ");
		estudiantes = obtener.nextInt();
 
		edadMayor = 0;
		edadMenor = 100;
		sumaedad = 0;
 
 
		for(i = 1; i <= estudiantes; i++)
		{
			System.out.print("Ingrese la edad del estudiante: " + i + " : ");
		  edad = obtener.nextInt();
 
			sumaedad = sumaedad + edad;
			if(edad > edadMayor)
			{
				edadMayor=edad;
			}
			if(edad < edadMenor)
			{
				edadMenor=edad;
			}
		}
 
		System.out.print("La edad mayor es: " + edadMayor + "\n");
		System.out.print("La edad menor es: " + edadMenor + "\n");
 
		DecimalFormat df = new DecimalFormat("#.00");
 
		System.out.print("El promedio de las edades es: " + df.format((double)sumaedad/estudiantes) + "\n");
	}
    
}
