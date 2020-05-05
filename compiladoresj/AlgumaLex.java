package compiladoresj;

import compiladoresj.Token;

public class algumalex
{
    public static void main(String[] args)
    {
        AlgumaLexico lex = new AlgumaLexico(args[0]);
        Token t = null;

        while((t = lex.proximoToken()).nome != TipoToken.Fim)
        {
            System.out.print(t);
        }
    }



}
