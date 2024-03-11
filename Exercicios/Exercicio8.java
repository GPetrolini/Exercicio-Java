
package Principal;
import javax.swing.JOptionPane;
/**
 *Escreva um programa em JAVA que solicite ao usuário 2 números inteiros (um de cada vez), 
armazene os valores em variáveis e depois mostre a soma dos dois em uma mensagem.

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
