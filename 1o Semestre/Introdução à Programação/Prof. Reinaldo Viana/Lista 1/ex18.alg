algoritmo "ex18"
// Fun��o : Sabe-se que o quilowatt de energia custa um quinto do sal�rio
//          m�nimo. Fa�a um algoritmo que receba o valor do sal�rio
//          m�nimo e a quantidade de quilowatts consumida por uma
//          resid�ncia. Calcule e mostre:
//          a) o valor de cada quilowatt
//          b) o valor a ser pago por essa resid�ncia
//          c) o valor a ser pago com desconto de 15%
// Autor : Anton L. Mazon R. Rangel
// Data : 10/03/2015
// Se��o de Declara��es
var
   sal_minimo,kw,kw_c,valor:real
inicio
      escreva("Salario minimo: ")
      leia(sal_minimo)
      escreva("K/w consumidos pela residencia: ")
      leia(kw_c)
      
      kw <- sal_minimo/5
      valor <- kw*kw_c
      escreval("a) O valor de cada quilowatt: ", kw)
      escreval("b) O valor a ser pago por essa residencia: ", valor)
      escreval("c) O valor a ser pago com desconto de 15%: ", valor*0.15)
fimalgoritmo
