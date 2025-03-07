"""Indique como um troco deve ser dado utilizando-se um número mínimo de notas. Seu
algoritmo deve ler o valor da conta a ser paga e o valor do pagamento efetuado desprezando
os centavos. Suponha que as notas para troco sejam as de 50, 20, 10, 5, 2 e 1 reais, e que
nenhuma delas esteja em falta no caixa."""

notas_disponiveis = [50, 20, 10, 5, 2, 1] #lista de notas

def calcula_troco(conta, pago):
    troco = pago - conta #calcula o troco necessário
    if troco < 0:
        return "Não tem troco"
    
    resultado_troco = [] #lista para armazenar as strings de resposta com quantidade de cada nota
    for nota in notas_disponiveis: #verifica cada nota na lista de notas
        quantidade = troco // nota #faz a divisão inteira do troco pela nota, para saber quantas notas cabem no troco
        if quantidade > 0:
            resultado_troco.append(f"{quantidade} nota(s) de {nota}") #adiciona uma string com a quantidade e a nota
            troco -= nota * quantidade #Atualiza o valor do troco subtraindo o valor da nota multiplicado pela quantidade de notas utilizadas
    
    return "\n".join(resultado_troco)#usa a quebra de linha para separar as strings que estão dentro dos resultados



conta = int(input("Digite o valor da conta: "))
pago = int(input("Digite o valor pago: "))

resultado = calcula_troco(conta, pago)
print(f"Troco: \n{resultado}")