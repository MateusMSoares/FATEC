"""Dizemos que um número natural é triangular se ele é produto de três números naturais
consecutivos. Exemplo: 120 é triangular, pois 4.5.6 = 120. Dado um inteiro não-negativo n,
verificar se N é triangular"""

def verifica_numero_triangular(n):
    produto = 0 #inicia o valor da variavel
    i = 1 #contador
    while produto < n: # enquanto o valor do produto for menor que o valor que sera testado
        produto = i * (i+1) * (i+2) # multiplica o contador pelo proximos 2 numeros
        i +=1 #acrescenta 1 no contador
    if produto == n:
        return f"O numero {n} é triangular! {i-1} X {i} X {i+1} = {n}"
    else:
        return f"o numero {n} não é triangular."

while True:
    n = int(input("Digite o numero para verificar se ele é triangular: "))

    if n > 0:
        break
    else:
        print("Digite um numero positivo")

resultado = verifica_numero_triangular(n)
print(resultado)