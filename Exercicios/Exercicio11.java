
package Principal;
import javax.swing.JOptionPane;
/**
 *Faça um programa em JAVA que solicite 1 número inteiro, verificar
 se o mesmo é múltiplo de 2 e mostrar a resposta mesmo que
 negativa 
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
