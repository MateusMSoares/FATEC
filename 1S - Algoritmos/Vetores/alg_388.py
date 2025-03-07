"""Criar um algoritmo que armazene 10 números em um vetor. Na entrada de dados, 
o número já deverá ser armazenado na sua posição definitiva em ordem decrescente. 
Imprimir o vetor logo após a entrada de dados. """

vetor = []

for i in range(10):
    num = input("Insira um valor para armazenar em ordem decrescente: ")
    vetor.append(num)

for i in range(len(vetor)):
    for j in range(len(vetor) - 1):
        if vetor[j] < vetor[j+1]:
            vetor[j], vetor[j+1] = vetor[j+1], vetor[j]

print("Em ordem decrescente:")
print(vetor)    