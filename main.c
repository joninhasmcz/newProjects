#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include "prot.h"

struct ponto
{
    float x,y;
};
    

int main()
{
    float d;
    Ponto *p, *q;

    p = cria_ponto(10, 21);
    q = cria_ponto(7,25);

    d = distancia_ponto(p,q);

    printf("Distancia entre Pontos: %f\n", d);
    libera_ponto(p);
    libera_ponto(q);





    return 0;
}