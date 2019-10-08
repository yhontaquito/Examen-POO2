package examen;

import java.util.Scanner;


public class Ejerc06 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int Prestamosdiarios = 0;
        double TotaldelPrestamo, CantidadTotaldePrestada;
        String TeclaRepetir;
        Prestamosdiarios = 0;
        CantidadTotaldePrestada = 0;
        do {
            System.out.print("Ingrese el valor de total del prestamo: ");
            TotaldelPrestamo = in.nextDouble();
            in.nextLine();
            CantidadTotaldePrestada = CantidadTotaldePrestada + TotaldelPrestamo;
            Prestamosdiarios = Prestamosdiarios + 1;
            System.out.println();
            do {
                System.out.print("\u00BFDesea repetir el proceso? (S/N): ");
                TeclaRepetir = in.nextLine();
            } while (!TeclaRepetir.equalsIgnoreCase("s") && !TeclaRepetir.equalsIgnoreCase("n"));
        } while (TeclaRepetir.equalsIgnoreCase("s"));
        System.out.println("Cantidad de Prestamos al Dia: " + Prestamosdiarios);
        System.out.println("Cantidad Total de Prestada: " + CantidadTotaldePrestada);
    
    }
    
}
