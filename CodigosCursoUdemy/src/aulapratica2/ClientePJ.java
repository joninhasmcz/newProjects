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
public class ClientePJ extends Cliente{
    
    private String cnpj;
    
    public ClientePJ(String nome, String endereco,String cnpj){
        super(nome,endereco);
        this.cnpj=cnpj;
        
    }
    
    public String getCnpj()
    {
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    }
    public String toString(){
        return super.toString()+"cnpj:"+cnpj;
    }
    
}
