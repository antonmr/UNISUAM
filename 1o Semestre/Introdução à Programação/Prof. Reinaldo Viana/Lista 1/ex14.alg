algoritmo "ex13"
// Fun��o : Crie um algoritmo que efetue o c�lculo do sal�rio
//          l�quido de um professor. Ser�o fornecidos: valor da
//          hora aula, o n�mero de aulas dadas no m�s e percentual
//          de desconto no INSS.
// Autor : Anton L. Mazon R. Rangel
// Data : 10/03/2015
// Se��o de Declara��es
var
   valor,aulas,percentual,sal:real
inicio
      escreva("Valor da hora aula: ")
      leia(valor)
      escreva("Aulas dadas no m�s: ")
      leia(aulas)
      escreva("Percental de desconto no INSS: ")
      leia(percentual)
      
      percentual <- percentual/100
      sal <- valor*aulas
      
      escreval()
      escreval("Sal�rio bruto  : R$", sal)
      escreval("Sal�rio l�quido: R$", sal-(sal*percentual))
fimalgoritmo
