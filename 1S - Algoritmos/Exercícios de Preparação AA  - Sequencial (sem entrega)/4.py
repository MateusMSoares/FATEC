#apos completar o tanque, deve ser mostrado o consumo efetuado, a autonomia que o carro ainda teria antes do abastecimento:
#fornecido a capacidade do tanque e a quantidade de litros abastecidas e a quilometragem percorrida desde o ultimo abaste..

#inicial
#fornece capacidade do tanque
#km inicial

#interacao:
#abasteceu:
# qtd litros abastecido
# qtd de km percorridos desde o ultimo abastecimento

#consumo efetuado = qtd_km/ cp_tanque - qtd litros abastecido 
#autonomia sem abastecer = capacidade do tanque -  qtd litros abastecido * consumo efetuado

def resolve(cp_tanque, qtd_litros, qtd_km):
    consumo = qtd_km / (cp_tanque - qtd_litros) 
    autonomia_restante = (cp_tanque - qtd_litros)  * consumo

    return consumo, autonomia_restante



cp_tanque = float(input("Digite a capacidade do tanque: "))
qtd_km_anterior = float(input("Digite a kilometragem: "))
qtd_km_total = qtd_km_anterior

while True:
    print("\nDigite 0 para sair")
    qtd_litros = float(input("Digite a quantidade de litros abastecida: "))
    qtd_km = float(input("Digite a quantidade de KM percorrido: "))
    qtd_km_total += qtd_km
    

    if qtd_litros == 0 or qtd_km == 0:
        break
    consumo, autonomia_restante= resolve(cp_tanque, qtd_litros, qtd_km)

    print(f'O consumo foi {consumo:.2f}KM/L, sem abastecer a autonomia seria de {autonomia_restante}KM')
