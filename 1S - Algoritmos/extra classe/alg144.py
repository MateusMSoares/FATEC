
saldo_medio = float(input("Digite o saldo médio do cliente: "))


valor_credito = 0.0


if saldo_medio <= 500:
    valor_credito = 0.0
elif 501 <= saldo_medio <= 1000:
    valor_credito = saldo_medio * 0.3
elif 1001 <= saldo_medio <= 3000:
    valor_credito = saldo_medio * 0.4
else:
    valor_credito = saldo_medio * 0.5

# Exibe o saldo médio e o valor do crédito
print(f"Saldo Médio: R${saldo_medio}")
print(f"Valor do Crédito: R${valor_credito:.2f}")
