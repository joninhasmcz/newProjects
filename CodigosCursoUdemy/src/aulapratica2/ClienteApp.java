/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica2;

/**
 *
 * @author helder
 */
public class ClienteApp {
    
    public static void main(String[] args){
        
        
       ClientePF clientepf1 = new ClientePF("xxxxyz","bairro tal","1112121");
       
       
       ClientePJ clientepj1 = new ClientePJ("zzzzz","bairro tal tal","234243432");
        
       
        System.out.println("cliente pf dados:"+clientepf1.getNome() + " "+ clientepf1.getEndereco());
       
        System.out.println(clientepf1.toString());
        
        System.out.println(clientepj1.toString());
        
    }
    
    
}
