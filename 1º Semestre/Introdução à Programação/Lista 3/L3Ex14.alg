algoritmo "L3Ex14"
// Fun��o :
// Autor :
// Data : 13/04/2015
// Se��o de Declara��es 
var
   num,maior,menor,i:inteiro
inicio
// Se��o de Comandos
      escreval("informe um n�mero: ")
      leia(num)
      maior <- num
      menor <- num
      para i de 1 ate 5 faca
           escreval("informe um n�mero: ")
           leia (num)
           se (num > maior) entao
              maior <- num
           fimse
           se (num < menor) entao
              menor <- num
           fimse
           fimpara
           escreval("o maior �:",maior)
           escreval("o menor �:",menor)



 
fimalgoritmo

