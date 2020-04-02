/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica3;

/**
 *
 * @author helder
 */
public class ContaCorrente {
    
    private int numero, agencia;
    private float limite;
    
    public ContaCorrente(int numero, int agencia){
        this.numero=numero;
        this.agencia=agencia;
    }
    
    
    public ContaCorrente(int numero, int agencia, float limite){
        this.numero=numero;
        this.agencia=agencia;
        this.limite=limite;
    }
    
}
