
package Principal;
import javax.swing.JOptionPane;
/**
 *Faça um programa em JAVA que solicite 2 números inteiros, verificar qual é
 o número maior e mostrar na tela, ou se forem iguais, mostrar uma
 mensagem indicando esta informação.
 * @author Gustavo
 */
public class Exercicio12 {
    public static void main(String[]args){
        int a,b;
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a"));
            b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b"));
            
        if (a > b){
                   JOptionPane.showMessageDialog(null,"O maior número é:" + a);
        }else{
            if (a == b){
                JOptionPane.showMessageDialog(null,"Os 2 números são iguais");
            }else{
                JOptionPane.showMessageDialog(null, "O maior número é:" + b);
              }
            }
        }
    }
                
 

                
            
           
                    
                

                
        
    

