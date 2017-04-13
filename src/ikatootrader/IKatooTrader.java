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
     * @throws java.beans.PropertyVetoException
     */
    public static void main(String[] args) throws Exception {
        FrmPrincipal graficos = new FrmPrincipal();
        graficos.setVisible(true);
//        RestCliente rCliente = new RestCliente();
//        rCliente.Salva("clientes.json","{\"nome\":\"Milton Carlos Katoo Teste 2222\",\"data_cadastro\":\"13/04/2017 21:55:34\",\"user\":\"mckatooteste222\",\"senha\":\"222246070D4BF934FB0D4B06D9E2C46E346944E322444900A435D7D9A95E6D7435F5\",\"email\":\"teste@teste.com\",\"poloniex_key\":\"123456222\",\"poloniex_secret\":\"2222123456teste\"}");
    }
    
}
