package add;
import javax.swing.JOptionPane;
public class Add {
    public static void main(String[] args) {
        // TODO code application logic here
        String value1;
        String value2;
        int result,number1,number2;
        value1=JOptionPane.showInputDialog("Mete el primer numero rey");
        value2=JOptionPane.showInputDialog("Mete el segundo numero rey") ;
        
        number1= Integer.parseInt(value1);
        number2= Integer.parseInt(value2);
        
        result = number1 + number2;
        JOptionPane.showMessageDialog(null, "El resultado es "+ result, "Resultado",JOptionPane.PLAIN_MESSAGE);
    }
    
}
