/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.net.MalformedURLException;


/**
 *
 * @author cpd
 */
public class TradeRestCliente {
    
    String urlBase = "https://ikatootrading.firebaseio.com/";
    
    public List<Cliente> Consulta() throws MalformedURLException,IOException {
        List<Cliente> listaClientes;
        Gson jsonClientes = new Gson();
		
        HttpURLConnection con = (HttpURLConnection)(new URL(urlBase.concat("/clientes.json"))).openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept", "application/json");

        if(con.getResponseCode() == 200) {
            BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));
            StringBuilder resultado = new StringBuilder();
            String line;
            
            while((line = br.readLine()) != null) {
                resultado.append(line);
            }
            
            Type collectionType = new TypeToken<List<Cliente>>(){}.getType();
            listaClientes = jsonClientes.fromJson(resultado.toString(), collectionType);
            return listaClientes;
        }
        return null;
    }
    
}
