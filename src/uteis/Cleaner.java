/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteis;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author cpd
 */
public class Cleaner {
    public static void limpaPanel(JPanel container) {
        Component components[] = container.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                ((JTextField) component).setText(null);
            }
            if (component instanceof JPasswordField) {
                ((JPasswordField) component).setText(null);
            }
            if (component instanceof JCheckBox) {
                ((JCheckBox) component).setSelected(false);
            }
        }
    }
}
