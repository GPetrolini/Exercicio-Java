
package Principal;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class Exercicio8 {
    public static void main(String[]args){
        int numero1,numero2,soma;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        soma = numero1 + numero2;
        JOptionPane.showMessageDialog(null,"o resultado da sua soma é :" + soma);
                
        
                
    }
    
}
