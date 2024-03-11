
package Principal;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author Gustavo
 */
public class Exercicio9 {
    public static void main(String[]args){
        int massa;
        double altura,imc;
        massa = Integer.parseInt(JOptionPane.showInputDialog("Digite sua massa em KG:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros"));
        imc = massa/ (altura * altura);
        
        DecimalFormat aproximador = new DecimalFormat( "0.00" );
        
        
        JOptionPane.showMessageDialog(null,"Seu IMC é: " + aproximador.format(imc));
                        
    }
}
