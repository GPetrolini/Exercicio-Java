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
public class Exercicio22 {
    public static void main(String[]args){
        int soma = 0;
        int contador =0;
        int numero = 1;
        
        while(numero <=1000){
            soma += numero;
            contador++;
            numero++;
            
        }
        double media =(double)soma/contador;
        JOptionPane.showMessageDialog(null,"A meédia dos números de 1 a 1000 é:" + media);
    }
}
