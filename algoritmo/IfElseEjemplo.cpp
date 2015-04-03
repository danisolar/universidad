#include <stdio.h>
int MAXIMO = 15; /* global, accesible desde cualquier parte del programa*/

int main() /*Función principal del programa*/
{
    printf("\nHELLO WORLD");
    
    printf("\nA continuacion vamos a escribir los numeros menores de %d \n", MAXIMO);
    for(int i = 0; i <= MAXIMO; i++)
    {/*
     if(i % 2 != 0)
     {
      printf("\nnumero impar %d", i);
      }
      else
      {
       printf("\n\tnumero par %d", i);
       }*/
       if (i != 0)
          {
           printf("\nnumero %d es %s ", i, i % 2 == 0 ? "par" : "impar" );
           
           }
          else
          {
           printf("\nnumero  %d no es par ni impar", i);
           }
   
    }
    
   getchar();
 return(0);
}
