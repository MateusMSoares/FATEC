#pede o dia/mes/anos de nascimento e pede a data dia/mes/anos atual , e fala quantos dias meses e anos a pessoa tem
from datetime import datetime as dt

data_nascimento = input("Digite a data de nascimento (dd/mm/aaaa): ")
data_nascimento = dt.strptime(data_nascimento, "%d/%m/%Y")
data_atual = dt.now()

diferenca = data_atual - data_nascimento

anos = diferenca.days // 365
meses = (diferenca.days % 365) // 30
dias = (diferenca.days % 365) % 30

print(diferenca)

print(f"Você tem {anos} anos, {meses} meses e {dias} dias de idade.")