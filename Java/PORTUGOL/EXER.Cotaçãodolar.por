programa
{

     
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	real dolar
     real valor
     real valor_real


 escreva("Quantos dólares vc tem? \n")
     leia(dolar)

	escreva(dolar, "USD" ,"\n")

	
     escreva("Digite um valor em R$: ")
     leia(valor)

     	valor_real = valor * dolar
     escreva(valor_real) //*Faz a conversão de US$ para R$
	

     escreva("escreva o valor da cotação do dia: ")
     leia(dolar)
     
    escreva("valor convertidp em dolar é igual: ", valor_real)
     
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 508; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */