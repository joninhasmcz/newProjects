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
public class Pessoa 
{
    
    private int codigo;
    private String nome;

    public Pessoa(int codigo, String nome)
    {
        this.codigo = codigo;
        this.nome = nome;
    }
    public int getCode()
    {
        return codigo;
    }
    public void setCode(int codigo)
    {
        this.codigo = codigo;
    }
    public String getName()
    {
        return nome;
    }
    public void setName(String nome)
    {
        this.nome = nome;
    }
    
    
    
}
