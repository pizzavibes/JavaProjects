
package operadores.relacionales3;

public class OperadoresRelacionales3 {

    
    public static void main(String[] args) {
        double consumoRecomendado = 2;
        double diasEnRacha = 12;
        double tuConsumo = 45;
        double consumoTotalRecomendado = consumoRecomendado*diasEnRacha;
        boolean retoCumplido = tuConsumo >= consumoTotalRecomendado;
        System.out.println(retoCumplido);
    }
    
}
