algoritmo "ex12"
// Fun��o : Fa�a um algoritmo que leia 3 n�meros e os chame por
//          a, b, c  e imprima:
//              a)	quais s�o divis�veis por 2 e por 4
//              b)	quais est�o compreendidos entre 100  e 1000
//              c)	verifique se existe igualdade entre os n�meros lidos
// Autor : Anton L. Mazon R. Rangel
// Data : 04/03/2015
// Se��o de Declara��es
var
   a,b,c:inteiro
inicio
      escreva("Digite o 1� n�mero: ")
      leia(a)
      escreva("Digite o 2� n�mero: ")
      leia(b)
      escreva("Digite o 3� n�mero: ")
      leia(c)
      
      escreval()
      escreval(" a) ")
      se (a%2<>0) e (a%4<>0) e (b%2<>0) e (b%4<>0) e (c%2<>0) e (c%4<>0) entao
         escreval("Nenhum n�mero � divis�vel por 2 e por 4!")
      senao
         se (a % 2 = 0) e (a % 4 = 0) entao
            escreval(a, " � divis�vel por 2 e por 4")
         fimse
         se (b % 2 = 0) e (b % 4 = 0) entao
            escreval(b, " � divis�vel por 2 e por 4")
         fimse
         se (c % 2 = 0) e (c % 4 = 0) entao
            escreval(c, " � divis�vel por 2 e por 4")
         fimse
      fimse
      
      escreval()
      escreval(" b) ")
      se (a<100) e (a>1000) e (b<100) e (b>1000) e (c<100) e (c>1000) entao
         escreval("Nenhum n�mero esta compreendido entre 100  e 1000!")
      senao
         se (a >= 100) e (a <= 1000) entao
            escreval(a, " esta compreendido entre 100  e 1000")
         fimse
         se (b >= 100) e (b <= 1000) entao
            escreval(b, " esta compreendido entre 100  e 1000")
         fimse
         se (c >= 100) e (c <= 1000) entao
            escreval(c, " esta compreendido entre 100  e 1000")
         fimse
      fimse
      
      escreval()
      escreval(" c) ")
      se (a <> b) e (b <> c) e (c <> a) entao
         escreval("N�o existe igualdade entre os n�meros!")
      senao
         se (a = b) entao
            escreval("O primeiro n�mero", a, " � igual ao segundo n�mero", b)
         fimse
         se (b = c) entao
            escreval("O segundo n�mero", b, " � igual ao terceiro n�mero", c)
         fimse
         se (a = c) entao
            escreval("O primeiro n�mero", a, " � igual ao terceiro n�mero", c)
         fimse
      fimse
fimalgoritmo
