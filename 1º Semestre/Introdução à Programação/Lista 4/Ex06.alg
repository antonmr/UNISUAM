algoritmo "ex06"
// Fun��o :
// Autor :
// Data : 7/6/2015
// Se��o de Declara��es 
var
   num:inteiro
   sair:caracter
inicio
      enquanto (sair <> "s") faca
           escreva("Digite um n�mero: ")
           leia(num)
           
           se (num >= 20) e (num <= 90) entao
               escreval(num, " est� compreendido entre 20 e 90!")
           senao
               escreval(num, " n�o est� compreendido entre 20 e 90!")
           fimse
           
           repita
               escreva("Deseja sair? (S/N): ")
               leia(sair)
           ate (sair = "s") ou (sair = "n")
      fimenquanto
fimalgoritmo
