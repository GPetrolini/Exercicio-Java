/*Escreva um algoritmo usando while que solicite ao usuário um número inicial e
um número final. Calcule a soma de todos os números dentro da faixa de valor
informada INCLUINDO o número inicial e final
 */
package Principal;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class Exercicio23 {
    public static void main(String[]args){
        String numInicial = JOptionPane.showInputDialog("Digite o número inicial");
        int numinicial = Integer.parseInt(numInicial);
        
        String numFinal = JOptionPane.showInputDialog("Digite o número final:");
        int numfinal = Integer.parseInt(numFinal);
        
        int sum = 0;
        
        int currentnumber = numinicial;
        
        while (currentnumber <= numinicial){
            sum += currentnumber;
            currentnumber++;
            
        }
        JOptionPane.showMessageDialog(null,"A soma dos números de " + numinicial + " a " + numfinal+ " é: " + sum);
    }
}
