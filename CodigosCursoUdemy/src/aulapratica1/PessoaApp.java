/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica1;

/**
 *
 * @author Helder
 */
public class PessoaApp 
{
    
    public static void main(String[] args)
    {
        Pessoa pessoa1 = new Pessoa(1,"Jonas");
        Pessoa pessoa2 = new Pessoa(2,"Flor");
        
        System.out.println("Essa é a pessoa Número 1: " + pessoa1.getName());
        System.out.println("Essa é a pessoa Número 2: " + pessoa2.getName());



        System.out.println("Essa é o(a) " + pessoa1.getName() + " de Código " + pessoa1.getCode());
        System.out.println("Essa é o(a) " + pessoa2.getName() + " de Código " + pessoa2.getCode());

        
    }
    
}
