package ejerlechegloria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EjerLecheGloria2 {
    ArrayList <EjerLecheGloria1> Listaproductos = new ArrayList<>();
    EjerLecheGloria1 producto = new EjerLecheGloria1();
    
    public void agregarProducto (EjerLecheGloria1 p){
        Listaproductos.add(p);
    }
    public Date fecha(String f){
        Date fecha = null;
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            fecha=formato.parse(f);
        } catch (ParseException ex){
            Logger.getLogger(Produc.class.getName()).log(Level.SEVERE, null,ex);
        }
        return fecha;
    }
    public void Listaproductos(){
        for(EjerLecheGloria1 prod : Listaproductos){
            System.out.println("Nombre: "+prod.getNombreProducto());
            System.out.println("Precio: "+prod.getPrecio());
            System.out.println("Fecha de caducidad: "+prod.getFechaCaducidad());
        }
    }
    
}
