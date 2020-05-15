
package cursojava;


public class controleRemoto implements controlador
{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public controleRemoto()
    { 
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private int getVolume()
    {
        return this.volume;
    }
    private boolean getLigado()
    {
        return this.ligado;
    }
    private boolean getTocando()
    {
        return this.tocando;
    }
    private void setVolume(int volume)
    {
        this.volume = volume;
    }
    private void setLigado(boolean ligado)
    {
        this.ligado = ligado;
    }
    private void setTocando(boolean tocando)
    {
        this.ligado = tocando;
    }
    // 
    public void ligar()
    {
        this.setLigado(true);
    }
    public void desligar()
    {
        this.setLigado(false);
    }
    public void abrirMenu()
    {
        System.out.println("---MENU---");
        System.out.println(this.getLigado());
        System.out.println(this.getVolume());
        for(int i = 1; i <= this.getVolume(); i++)
        {
            if(i%10 == 0)
            {
                System.out.print("|" + i);
            }
        }
        
    }
    public void fecharMenu()
    {
        System.out.println("Fechando Menu");
    }
    public void maisVolume()
    {
        if(this.getLigado())
        {
            this.setVolume(this.getVolume() + 5);
        }
    }
    public void menosVolume()
    {
        if(this.getLigado())
        {
            this.setVolume(this.getVolume() - 5);
        }
    }
    public void ligarMudo()
    {
        if(this.getLigado() && this.getVolume() > 0)
        {
            this.setVolume(0);
        }
    }
    public void desligarMudo()
    {
        if(this.getLigado() && this.getVolume() == 0)
        {
            this.setVolume(50);
        }
    }
    public void play()
    {
        if(this.getLigado() && !this.getTocando())
        {
            this.setTocando(true);
        }
    }
    public void pause()
    {
        if(this.getLigado() && this.getTocando())
        {
            this.setTocando(false);
        }
    }
    
    
}

