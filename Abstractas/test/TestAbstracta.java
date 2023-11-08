package abstracta.test;

import abstracta.*;

public class TestAbstracta {
    public static void main(String[] args) {
       FiguraGeometrica figura = new Rectangulo("Rectangulo1");
       
       //System.out.println(figura);
       figura.dibujar();
       
       figura = new Cuadrado("Cuadrado1");
       figura.dibujar();
       
    }
}
