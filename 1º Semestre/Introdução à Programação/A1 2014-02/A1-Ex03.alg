algoritmo "A1-Ex03"
// Fun��o :
// Autor :
// Data : 18/04/2015
// Se��o de Declara��es 
var
   i,soma,num_total,num,maior,menor: inteiro
inicio
   // Se��o de Comandos
   ESCREVA("Entre com a quantidade de n�meros que ser� digitado:")
   LEIA(num_total)
   PARA i de 1 ATE num_total FACA
      // Recebo o numero digitado
      ESCREVA("Entre com um n�mero:")
      LEIA(num)
      // Aqui j� fa�o a soma pra dividir no final pela contidade de numeros pra achar a m�dia
      soma <- soma + num
      
      // Verifico se to entrando pela primeira vez no PARA, se sim, falo que o "menor" e "maior" vai receber o n�mero que o usuario digitar
      SE (i = 1) ENTAO
         maior <- num
         menor <- num
      FIMSE
      
      // Verifico se for menor salvo o numero digitado como menor
      SE (num < menor) ENTAO
         menor <- num
      FIMSE
      
      // Verifico se for maior salvo o numero digitado como maior
      SE (num > maior) ENTAO
         maior <- num
      FIMSE

   FIMPARA

   // Agora mostro os resultados
   ESCREVAL("")
   ESCREVAL("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
   ESCREVAL("Quantidade de n�meros digitados: ", num_total)
   ESCREVAL("Maior n�mero digittado: ", maior)
   ESCREVAL("Menor n�mero digitado: ", menor)
   ESCREVAL("M�dia dos n�meros digitados: ", (soma/num_total))
   ESCREVAL("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=")
fimalgoritmo
