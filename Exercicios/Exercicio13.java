/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import javax.swing.JOptionPane;
/**
 *A prefeitura de Florianópolis abriu uma linha de crédito para os funcionários estatutários.
 O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
 Faça um algoritmo que permita entrar com o salário bruto e o valor da prestação e
 informar se o empréstimo pode ou não ser concedido.
 * @author Gustavo
 */
public class Exercicio13 {
    public static void main(String[]args){
        double sb,vp;
               sb = Double.parseDouble(JOptionPane.showInputDialog("Insira seu salábrio bruto:"));
        vp = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de prestação"));
        
        if (vp <= (0.3 * sb)){
            JOptionPane.showMessageDialog(null,"Empreéstimo concedido!");
        }else{
            JOptionPane.showMessageDialog(null,"Empréstimo NEGADO");
        }
    }
}
