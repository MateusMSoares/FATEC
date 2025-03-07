"""Dados dois números inteiros positivos, determinar o máximo divisor comum entre eles usando
o algoritmo de Euclides. """

def euclides(a,b):
    while b > 0:
        a, b = b, a % b
    return a

print("determinar o máximo divisor comum entre eles usando o algoritmo de Euclides.")
while True:
    
    num_a = int(input("Digite um numero inteiro positivo> "))
    num_b = int(input("Digite um numero inteiro positivo> "))
    
    if num_a > 0 and num_b > 0:
        break
    else:
        print("Digite apenas numeros positivos")

mdc = euclides(num_a, num_b)
print(f"O menor menor divisor comum de {num_a} e {num_b} é {mdc}")
