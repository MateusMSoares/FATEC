# recebe numero de 3 digitos e inverte

def inverte_numero(n):
   n = n[::-1]

   return n

while True:
    num = input("Digite um numero de 3 digitos: ")
    if len(num) == 3:
        break
    else:
        print("Digite um numero de 3 digitos!")

resultado = inverte_numero(num)

print(f"{num} invertido: {resultado}")