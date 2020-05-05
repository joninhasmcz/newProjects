package compiladoresj;

import java.io.FileInputStream;
import java.io.InputStream;

public class LeitorDeArquivosTexto 
{
    private final static int TAMANHO_BUFFER = 20;
    int[] bufferDeLeitura;
    int ponteiro;
    int bufferAtual;
    int inicioLexema;
    private String lexema;

    InputStream is;

    public LeitorDeArquivosTexto(String arquivo)
    {   
        is = new FileInputStream(new File(arquivo));
        inicializarBuffer();
    } 

    private void inicializarBuffer()
    {
        bufferAtual = 2;
        inicioLexema = 0;
        lexema = "";
        bufferDeLeitura = new int[TAMANHO_BUFFER * 2];
        ponteiro = 0;
        recarregarBuffer1(); 
    }

    private void incrementarPonteiro() 
    {
        ponteiro++;

        if(ponteiro == TAMANHO_BUFFER)
            recarregarBuffer2();
        else if(ponteiro == TAMANHO_BUFFER)
        {
            recarregarBuffer1();
            ponteiro = 0;
        }

    }

    private void recarregarBuffer1()
    {
        if(bufferAtual == 2) 
        {
            bufferAtual = 1;
            for(int i=0; i < TAMANHO_BUFFER; i++)
            {
                bufferDeLeitura[i] = is.read();
                if(bufferDeLeitura[i] == -1) break;
            }
        }
    }

    private void recarregarBuffer2()
    {
        if(bufferAtual == 1)
        {
            bufferAtual = 2;
            for(int i = TAMANHO_BUFFER; i < TAMANHO_BUFFER * 2; i++)
            {
                bufferDeLeitura[i] = is.read();
                if(bufferDeLeitura[i] == -1) break;
            }
        }
    }

    private int lerCaractereDoBuffer()
    {
        int ret = bufferDeLeitura[ponteiro];
        // System.out.println(this);
        incrementarPonteiro();
        return ret;
    }
    public int lerProximoCaractere()
    {
        int c = lerCaractereDoBuffer();
        lexema += (char)c;
        return c;
    }

    public void retroceder()
    {
        ponteiro--;
        lexema = lexema.substring(0, lexema.length() - 1);
        if(ponteiro < 0)
            ponteiro = TAMANHO_BUFFER * 2 - 1;
    }

    public void zerar()
    {
        ponteiro = inicioLexema;
        lexema = "";
    }

    public void confirmar()
    {
        inicioLexema = ponteiro;
        lexema = "";
    }
    public String getLexema()
    {
        return lexema;
    }

}