import javax.swing.JOptionPane;
public class calculadoraPane{
    public static void main(String[] arg){
        String numero1 = JOptionPane.showInputDialog("Ingresa el primer numero");
        String numero2 = JOptionPane.showInputDialog("Ingresa el segundo numero"); 

        double numeroDecimal1 = Double.parseDouble(numero1);
        double numeroDecimal2 = Double.parseDouble(numero2);

        System.out.println(numeroDecimal1 + numeroDecimal2);
        System.out.println(numeroDecimal1 - numeroDecimal2);
        System.out.println(numeroDecimal1 * numeroDecimal2);
        System.out.println(numeroDecimal1 / numeroDecimal2);
    }
}