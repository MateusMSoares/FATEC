#um comerciante cobra 10% de acrescimo por cada prestao em atraso e depois da um desconto de 10% sobre esse valor.
#solicitar valor da prestacao em atraso e apresentar o valor final a pagar, assim como o prejuizo do comerciante

prestacao = float(input("Insira o valor da prestação: "))

juros = 1.1
desconto = 0.1

valor_prestacao = prestacao * juros

valor_desconto = valor_prestacao - (valor_prestacao * desconto)
prejuizo = prestacao - valor_desconto

print(f"Valor da prestacao {prestacao:.2f}")
print(f"Valor a pagar {valor_prestacao:.2f}")
print(f"Valor com desconto {valor_desconto:.2f}")
print(f"Prejuizo comerciante {prejuizo:.2f}")