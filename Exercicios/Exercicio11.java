
package Principal;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class Exercicio11 {
    public static void main(String[]args){
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        if((a % 2) == 0){
            JOptionPane.showMessageDialog(null, "sim é múltiplo de 2!");
        }else{
            JOptionPane.showMessageDialog(null, " Não, não é múltiplo de 2!");
        }
        
        
        
                
    }
}
