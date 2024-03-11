/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import javax.swing.JOptionPane;
/**
 *Solicitar nome e idade de uma pessoa.
  a pessoa possuir idade entre 15 e 25 anos, imprimir o nome e a
 mensagem: “ACEITA”.
 Caso contrário, imprimir o nome e a mensagem: “NÃO ACEITA”.
 * @author Gustavo
 */
public class Exercicio15 {
    public static void main(String[]args){
        String nome;
        int idade;
        
        nome = JOptionPane.showInputDialog("Digite seu nome");
                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
    if((idade > 15) && (idade < 25)){
            JOptionPane.showMessageDialog(null,nome + "ACEITA!");
    }else{
        JOptionPane.showMessageDialog(null,nome + "NÂO ACEITA!");
    }
    }
}
