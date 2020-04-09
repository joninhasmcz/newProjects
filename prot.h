typedef struct ponto Ponto;

Ponto* cria_ponto(float x, float y);
void libera_ponto(Ponto* p);
void acessa_ponto(Ponto* p, float* x, float* y);
void atribui_ponto(Ponto* p, float x, float y);
float distancia_ponto(Ponto* p1, Ponto* p2);

Ponto* cria_ponto(float x, float y)
{
    Ponto* p = (Ponto*) malloc(sizeof(Ponto*));
    
    if(p != NULL)
    {
        p->x = x;
        p->y = y;
    }
    return p;
}
void libera_ponto(Ponto* p)
{
    free(p);
}
void acessa_ponto(Ponto* p, float* x, float* y)
{
    *x = p->x;
    *y = p->y;
}
void atribui_ponto(Ponto* p, float x, float y)
{
    p->x = x;
    p->y = y;
}
float distancia_ponto(Ponto* p1, Ponto* p2)
{
    float dx = p1->x - p2->x;
    float dy = p2->y - p2->y;
    return sqrt(dx * dx + dy * dy);
}
