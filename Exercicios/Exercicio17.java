/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import javax.swing.JOptionPane;
/**
 *Implemente um algoritmo em JAVA que escreva a seguinte mensagem na tela,
 substituindo a profissão pela informada pelo usuário:
 "Tibúrcio é <profissão>"
 Solicite ao usuário que informe a profissão do Tibúrcio, apresente as seguintes
 e engenheiro ; m médico ; d designer ; p programador ; a advogado
 opções:
 * Se informada opção diferente das apresentadas a profissão é DESEMPREGADO.
 * @author Gustavo
 */
public class Exercicio17 {
    public static void main(String[]args){
        String controle;
        controle = JOptionPane.showInputDialog("Informe a profissão de Tiburcio \n" + "e - engenheiro \n" + "p - programador \n" + "m - médico \n" + "a - advogado \n" + "d - designer \n");
        
            char controleCHAR = controle.charAt(0);
        switch(controleCHAR){
            case 'e':
                JOptionPane.showMessageDialog(null,"Tibúrcio é engenheiro");
            break;
            
            case 'p':
                JOptionPane.showMessageDialog(null,"Tibúrcio é programaodr");
            break;
            
            case 'm':
                JOptionPane.showMessageDialog(null,"Tibúrcio é médico");
            break;
            
            case 'a':
                JOptionPane.showMessageDialog(null,"Tibúrcio é advogado");
            break;
            
            case 'd':
                JOptionPane.showMessageDialog(null,"Tibúrcio é designer");
            break;
            
            default:
                JOptionPane.showMessageDialog(null,"Tibúrcio está desempegado");
            break;
        }    
    }
    
}
