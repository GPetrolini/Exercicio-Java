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
public class Exercicio14 {
    public static void main(String[]args){
        int an, aa, resultado;
            an = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimneto"));
            aa = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
    if (an >= aa){
                    JOptionPane.showMessageDialog(null,"Ano de nascimento inválido!!" );
    }else{
        resultado = aa - an;
        JOptionPane.showMessageDialog(null,"Sua idade é:" + resultado);
    }        
        
    }

}
