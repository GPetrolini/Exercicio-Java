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
public class Exercicio18 {
    public static void main(String[]args){
        //leitura das informaçoes digitadas pelo usuario
    String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
    double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço: "));
    char categoria = JOptionPane.showInputDialog("Digite a categoria: ").charAt(0);
    
    
    //determina o desconto (%) de acordo com a categoria
    double desconto = 0;
    switch (categoria){
        case 'A' :
            desconto = 10;
            break;
            
        case 'B':
            desconto = 15;
            break;
            
        case 'C':
            desconto = 20;
            break;
            
        case 'D':
            desconto = 25;
            break;
            
        case 'E':
            desconto = 50;
            break;
        default:
            JOptionPane.showMessageDialog(null,"Opção invalida");
            break;
         }
    
    // calculo preço final
    double precoFinal = preco - (preco * desconto/100);
    //mostra na tela o valor a ser pago pelo cliente
    JOptionPane.showMessageDialog(null,"Valor a ser pago será: " + precoFinal);
    
    }
}
