"""A sequência de Fibonacci é a seguinte: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... Sua regra de
formação é simples: os dois primeiros elementos são 1; a partir de então, cada elemento é a
soma dos dois anteriores. Faça um algoritmo que leia um número inteiro calcule o seu número
de Fibonacci. F1 = 1, F2 = 1, F3 = 2, etc."""

#f1 = 1
#f2 = 2
#f3 = f1 + 2

def resolve_fibonacci(n):
    
    if n <= 0: #se for menor que 1 nao é possivel fazer
        return "Não é possivel realizar com um numero menor que 1"
    elif n == 1 or n == 2: #se for igual a 1 ou a 2, retorna o valor 1
        return 1
    fib = [1, 1] #cria lista com o primeiro e segundo termo
    for fn in range(3, n + 1): #verifica os termos até o desejado
        f3 = fib[-1] + fib[-2] # f3 é a soma do ultimo com o penultimo termo
        if fn == n:
            fib.append(f"[{f3}]") #adiciona a lista e diferencia o ultimo termo
        else:
            fib.append(f3) #adiciona o termo calculado a lista
    return fib   

n = int(input("Digite o termo de fibonacci que deseja saber: "))
resultado = resolve_fibonacci(n)
print(resultado)