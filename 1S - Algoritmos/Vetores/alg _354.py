"""Armazenar 15 números inteiros em um vetor NUM e imprimir uma listagem nu -
merada contendo o número e uma das mensagens: par ou ímpar. """

num = []
for i in range(1, 16):
    num.append(i)

for i in num:
    if i % 2 == 0:
        print(f"{i} é par")
    else:
        print(f"{i} é impar")