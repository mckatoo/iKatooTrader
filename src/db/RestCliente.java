/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


/**
 *
 * @author cpd
 */
public class RestCliente {
    
    String urlBase = "https://ikatootrading.firebaseio.com/";
    
    public String Consulta() throws MalformedURLException,IOException {
        String listaClientes;
        Gson jsonClientes = new Gson();
		
        HttpURLConnection con = (HttpURLConnection)(new URL(urlBase.concat("clientes.json"))).openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept", "application/json");

        if(con.getResponseCode() == 200) {
            BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
            StringBuilder resultado = new StringBuilder();
            String line;
            
            while((line = br.readLine()) != null) {
                resultado.append(line);
            }
            
            listaClientes = resultado.toString();
            
            return listaClientes;
        }    
        
        
        return null;
    }
    
}
