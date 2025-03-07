import math as m

x = float(input("Entre com valor de x"))

if x <= 1:
    y = 1
elif 1.0 < x <= 2.0:
    y = 2
elif 2.0 < x <= 3.0:
    y = x ** 2
else:
    y = x ** 3
print(f"Valor de f({x}) = {y}")