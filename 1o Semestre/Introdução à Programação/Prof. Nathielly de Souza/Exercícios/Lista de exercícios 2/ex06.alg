algoritmo "ex6"
// Fun��o : Refa�a o algoritmo 2, considerando por�m, a idade de
//          maioridade 18 anos para homens e 21 para mulheres.
// Autor : Anton L. Mazon R. Rangel
// Data : 04/03/2015
// Se��o de Declara��es
var
   idade:inteiro
   sexo:caracter
inicio
      escreva("Digite a idade     : ")
      leia(idade)
      escreva("Digite o sexo (M/F): ")
      leia(sexo)

      se (sexo = "M") entao
         se (idade >= 18) entao
            escreva("� de maior!")
         senao
            escreva("N�o � de maior!")
         fimse
      senao
         se (idade >= 21) entao
            escreva("� de maior!")
         senao
            escreva("N�o � de maior!")
         fimse
      fimse
fimalgoritmo
