/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikatootrader;

import db.RestCliente;
import java.beans.PropertyVetoException;
import java.io.IOException;
import views.FrmPrincipal;

/**
 *
 * @author cpd
 */
public class IKatooTrader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PropertyVetoException, IOException {
//        FrmPrincipal graficos = new FrmPrincipal();
//        graficos.setVisible(true);
        RestCliente cliente = new RestCliente();
        System.out.println(cliente.Consulta());
    }
    
}
