nome = input("Digite o nome da pessoa: ")
idade = int(input("Digite a idade da pessoa: "))

valor_a_pagar = 0.0

if idade <= 10:
    valor_a_pagar = 30.00
elif 11 <= idade <= 29:
    valor_a_pagar = 60.00
elif 30 <= idade <= 45:
    valor_a_pagar = 120.00
elif 46 <= idade <= 59:
    valor_a_pagar = 150.00
elif 60 <= idade <= 65:
    valor_a_pagar = 250.00
else:
    valor_a_pagar = 400.00

print(f"Nome da Pessoa: {nome}")
print(f"Valor a Pagar: R${valor_a_pagar:.2f}")
