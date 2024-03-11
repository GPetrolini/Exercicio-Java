
package Principal;
import javax.swing.JOptionPane;
        
/**
 *
 * @author Gustavo
 */
public class Teste3 {
    public static void main(String[]args){
        double numero,metade;
            numero = Double.parseDouble(JOptionPane.showInputDialog("insira um número"));
            
            if (numero > 10){
                        metade = numero/2;
                        JOptionPane.showMessageDialog(null, "A metade é: " + metade);
        
    }
                        
    }
    
}
