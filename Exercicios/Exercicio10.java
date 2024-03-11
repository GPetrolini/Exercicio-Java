
package Principal;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class Exercicio10 {
    public static void main(String[]args){
        int a,b,resultado;
        a = Integer.parseInt(JOptionPane.showInputDialog("digite um número"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        
        resultado = a + b;
        if (resultado > 10){
            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
        }
    }
}
