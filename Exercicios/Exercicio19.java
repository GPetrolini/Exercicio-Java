/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import javax.swing.JOptionPane;

/**
 *Solicite ao usuário que escreva uma frase e o número de vezes que a mesma
 deve ser mostrada. Implemente o algoritmo usando for
 * @author Gustavo
 */
public class Exercicio19 {
    public static void main (String[]args){
    
    
    int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vezes:"));
    String frase = JOptionPane.showInputDialog("Digite a frase");
    
    for (int i=0; i<n;i++){
        JOptionPane.showMessageDialog(null,"Frase:" + frase);
    }
        }    
    }

