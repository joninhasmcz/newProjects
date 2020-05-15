package cursojava;

public class conta
{
    // Atributes //
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    // Constructor //
    public conta()
    {
        this.saldo = 0.00;
        this.status = false;
    }
    // Setters and Getters // 
    public void setNumConta(int numConta)
    {
        this.numConta = numConta;
    }
    public int getNumConta()
    {
       return numConta;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    public String getTipo()
    {
        return tipo;
    }
    public void setDono(String dono)
    {
        this.dono = dono;
    }
    public String getDono()
    {
        return dono;
    }
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public void setStatus(boolean status)
    {
        this.status = status;
    }
    public boolean getStatus()
    {
        return status;
    }
   // Available Methods //
    public void abrirConta(String tipo)
    {
        this.setTipo(tipo);
        this.setStatus(true);
        if(this.getTipo() == "cc")
            this.setSaldo(50);
        else if(this.getTipo() == "cp")
            setSaldo(150);
        else 
            System.out.println("Erro Na Configuração do Tipo de Conta !!!");       
    }
    public void fecharConta()
    {
        if(this.getSaldo() > 0)
            System.out.println("Conta com Dinheiro, Impossibilidade de Fechamento!!!");
        else if(this.getSaldo() < 0)
            System.out.println("Conta em Débito, Impossibilidade de Fechamento!!!");
        else 
           this.setStatus(false);
    }
    public void depositar(double dinheiro)
    {
        if(this.getStatus())
            this.setSaldo(this.getSaldo() + dinheiro);
        else
            System.out.println("Conta Inválida, Impossiblidade de Depósito!!!");
    }
    public void sacar(double dinheiro)
    {
        if(this.getStatus())
        {
            if(this.getSaldo() >= dinheiro)
                this.setSaldo(this.getSaldo() - dinheiro);
            else
                System.out.println("Saldo Insuficiente, Impossibilidade de Sacar!!!");                
        }   
        else
            System.out.println("Conta Inválida, Impossibilidade de Sacar!!!");
    }
    public void pagarMensal()
    {
       double dinheiro = 0.00;
       if(this.getTipo() == "cc")
           dinheiro = 12.00;
       else if(this.getTipo() == "cp")
           dinheiro = 20.00;
       if(this.getStatus())
           this.setSaldo(this.getSaldo() - dinheiro);
       else
           System.out.println("Tipo de Conta Inválida, Impossiblidade de Pagamento!!!");
    }
    public void estadoAtual()
    {
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }



















}
