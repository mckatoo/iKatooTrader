/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cpd
 */

public class Cliente {
    private String Nome;
    private String Data_Cadastro;
    private String User;
    private String EMail;
    private String Senha;
    private String PoloniexKey;
    private String PoloniexSecret;

    public Cliente(String Nome, String User, String EMail, String Senha, String PoloniexKey, String PoloniexSecret) {
        this.Data_Cadastro = DataHora_Atual();
        this.Nome = Nome;
        this.User = User;
        this.EMail = EMail;
        this.Senha = Senha;
        this.PoloniexKey = PoloniexKey;
        this.PoloniexSecret = PoloniexSecret;
    }
    
    public Cliente(){
        this.Data_Cadastro = DataHora_Atual();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getData_Cadastro() {
        return Data_Cadastro;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getPoloniexKey() {
        return PoloniexKey;
    }

    public void setPoloniexKey(String PoloniexKey) {
        this.PoloniexKey = PoloniexKey;
    }

    public String getPoloniexSecret() {
        return PoloniexSecret;
    }

    public void setPoloniexSecret(String PoloniexSecret) {
        this.PoloniexSecret = PoloniexSecret;
    }

    public String DataHora_Atual() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public String toJson(){
        String json = "{"+
                "\"nome\":\""+this.Nome+
                "\",\"data_cadastro\":\""+this.Data_Cadastro+
                "\",\"user\":\""+this.User+
                "\",\"senha\":\""+this.Senha+
                "\",\"email\":\""+this.EMail+
                "\",\"poloniex_key\":\""+this.PoloniexKey+
                "\",\"poloniex_secret\":\""+this.PoloniexSecret+
                "\"}";
        return json;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cliente [nome=");
        builder.append(Nome);
        builder.append(", data_cadastro=");
        builder.append(Data_Cadastro);
        builder.append(", senha=");
        builder.append(Senha);
        builder.append(", user=");
        builder.append(User);
        builder.append(", email=");
        builder.append(EMail);
        builder.append(", poloniex_key=");
        builder.append(PoloniexKey);
        builder.append(", poloniex_secret=");
        builder.append(PoloniexSecret);
        return builder.toString();
    }
    
    
}
