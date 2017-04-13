/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteis;

import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author cpd
 */
public class Validation {


    public static boolean email(String email) {
        boolean isValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isValid = true;
            }
        }
        return isValid;
    }
    
    public static boolean senha(String senha,String confirmacao){
        boolean isValid = false;
        if (senha.equals(confirmacao)) {
            isValid = true;
        }
        return isValid;
    }

    public static boolean validaPanel(JPanel container) {
        Boolean isValid = false;
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                if (((JTextField) component).getText().isEmpty()) {
                    ((JTextField) component).requestFocus();
                    isValid = true;
                }
            }
        }

        return isValid;
    }
}
