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
    
    public static void main(String[] args)
    {
        
        
        ClientePF clientepf1 = new ClientePF("Jonas","Travessa Maria Erivânia","11315461480");
        ClientePJ clientepj1 = new ClientePJ("Genesis","Dona Marieta","234243432");
        
        System.out.println("cliente pessoa Física dados: " + clientepf1.toString());
        System.out.println("cliente pessoa Jurídica dados: " + clientepj1.toString());
    }
    
    
}
