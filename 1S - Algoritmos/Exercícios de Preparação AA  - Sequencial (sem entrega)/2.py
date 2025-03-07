#calculo area do circulo partindo de um raio.

def calcula_area (raio):
    area = (2*3.14*(raio**2))/4
    return area

while True:
    raio = float(input("Digite o raio para saber a area do circulo: "))
    if raio > 0:
        break
    else:
        print("Digite um numero maior que 0")

resultado = calcula_area(raio)
print(f"Com raio {raio} o circulo terá area {resultado:.2f}")