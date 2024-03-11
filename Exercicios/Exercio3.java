//Faça um programa em JAVA declarando uma variável chamada nome,  e siga os seguintes passos:

/*1 – Atribua o valor “João” a esta variável
2 – Mostre o valor da variável nome em uma mensagem
3 – Mude o valor da variável nome para outro valor qualquer
4 - Mostre o valor da variável nome em uma mensagem seguindo o seguinte modelo
    O valor da variável é: <valor inserido no passo 3>
package Principal;*/

import javax.swing.JOptionPane;

public class Exercio3 {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        String nome;
        nome = "Joao";
        JOptionPane.showMessageDialog(null,nome);
        nome = "Maria";
        JOptionPane.showMessageDialog(null, "O valor da variável é: " + nome);
        
        
        
    }
    
}
