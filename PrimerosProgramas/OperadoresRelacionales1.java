
package operadoresrelacionales1;

public class OperadoresRelacionales1 {

    public static void main(String[] args) {
       double dineroGenerado= 120000;
        double dineroApuesta= 245000;
        double dineroNecesarioDeuda= 550000;
        double dineroTrasApuesta= dineroGenerado+dineroApuesta;
        System.out.println(dineroGenerado>dineroNecesarioDeuda);
        System.out.println(dineroNecesarioDeuda<dineroTrasApuesta);
        
    }
    
}
