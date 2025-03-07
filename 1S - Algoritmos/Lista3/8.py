"""Verifique se um inteiro positivo N é primo."""

def verifica_primo(n):
    divisores = 0
    for i in range(1, n + 1):
        if n % i == 0:
            divisores += 1
    if divisores == 2:
        return f"{n} é primo."
    else:
        return f"{n} não é primo."

while True:
    n = int(input("Digite um numero para verificar se ele é primo: "))
    if n > 0:
        break
    else:
        print("Digite um numero positivo")
        
resultado = verifica_primo(n)
print(resultado)