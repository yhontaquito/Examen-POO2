package ejerlechegloria;


public class EjerLecheGloria {

    public static void main(String[] args) {
        EjerLecheGloria2 pa = new EjerLecheGloria2();
        EjerLecheGloria1 pe = new EjerLecheGloria1();
        pe.setNombreProducto("LECHE GLORIA");
        pe.setPrecio(3.5);
        pe.setFechaCaducidad(pa.fecha("07-12-2019"));
        
        
        pa.agregarProducto(pe);
        pa.Listaproductos();
        
        System.out.println("");
        System.out.println("El producto no esta vencido ");
    }
    
}
