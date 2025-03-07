#imc = peso (kg)/ altura** (m)

peso = float(input('Digite o peso em KG: '))
altura = float(input('Digite a altura em metros: '))

imc = peso / (altura**2)
print(f"o seu IMC: {imc:.2f} é considerado:")
if imc < 20:
    print("abaixo do peso ")
elif imc <=20 or imc <=25:
    print("normal")
elif imc <=25 or imc <=30:
    print("excesso de peso ")
elif imc <=30 or imc <=35:
    print("obesidade")
else:
    print("obesidade mórbida")
