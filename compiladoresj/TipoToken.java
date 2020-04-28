package compiladoresj;

public enum TipoToken 
{
    PCDeclaracoes, PCAlgoritmo, PCInteiro, PCReal, PCAtribuir, PCA, PCLer, PCImprimir, PCSe, PCEntao, PCEnquanto, PCInicio, PCFim,
    OpAritMult, OpAritDiv, OpAritSoma, OpAritSub,
    OpRelMenor, OpRelMaior, OpRelMaiorIgual, OpRelMenorIgual, OpRelIgual, OpRelDif,
    OpBoolE, OpBoolOu,
    Delim, AbrePar, FechaPar, Var, NumInt, NumReal, Cadeia, Fim;

}