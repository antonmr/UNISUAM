algoritmo "ex11"
// Fun��o :
// Autor :
// Data : 7/6/2015
// Se��o de Declara��es 
var
   op,num,produto:inteiro
   sair:caracter
inicio
      op <- 1
      produto <- 1
      enquanto (op <= 12) e (sair <> "verdadeiro") faca
            escreva("Digite o ",op,"� n�mero: ")
            leia(num)
            produto <- produto * num

            escreva("Para sair digite VERDADEIRO: ")
            leia(sair)
            
            op <- op + 1
      fimenquanto
      
      escreval("Produto dos n�meros lidos: ", produto)
fimalgoritmo
