/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class Exercicio16 {
    public static void main(String[]args){
        int controle;
        double resultado,resultadodiv;
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digiteo o primeiro número"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        controle = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você quer fazer?" + "\n 1 - adição \n 2 - subtração \n 3 - multiplicação \n 4 - divisão"));
        
    switch(controle){
        case 1: 
            resultado = numero1 + numero2;
            JOptionPane.showMessageDialog(null,"O resultado é:" + resultado);
                        break;
        case 2:
            resultado = numero1 - numero2;
            JOptionPane.showMessageDialog(null,"o resultado é:" + resultado);
                    break;
        case 3:
            resultado = numero1 * numero2;
            JOptionPane.showMessageDialog(null,"o resultado é:" + resultado);
            break;
                    case 4:
                        resultadodiv = numero1 / numero2;
                        JOptionPane.showMessageDialog(null,"O resultado é:" + resultadodiv);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null,"Opção invalida!");
    }
    }
}
