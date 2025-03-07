#Faça um programa que peça um inteiro positivo e o mostre invertido. Ex.: 1234 gera 4321

def resolve_invertido(n):
    n = str(n) #Transforma o inteiro em string
    n = n[::-1] #Realiza a inversão da string
    return n #retorna a string invertida

while True:
    num = int(input("Insira um numero para que ele seja mostrado invertido: "))
    if num > 0:
        break
    else:
        print("Digite um numero positivo")

resultado = resolve_invertido(num)
print(f'{num} invertido é {resultado}')