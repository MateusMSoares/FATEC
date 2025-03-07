"""Uma pessoa muito organizada gostaria de fazer um algoritmo para armazenar os
seguintes dados de um talonário após a utilização total do mesmo: numero do cheque,
valor, data e destino. Sabendo-se que o número de cheques pode ser variável e
não ultrapassa 20, construa esse algoritmo de tal maneira que possa gerar um relatório no vídeo. """

talonario = []

while len(talonario) < 20:
    numero_cheque = input("Digite o número do cheque (ou pressione Enter para sair):")
    
    if not numero_cheque:
        break 
    
    id_cheque = len(talonario) + 1 
    valor_cheque = input("Digite o valor do cheque:")
    data_cheque = input("Digite a data do cheque:")
    destino_cheque = input("Digite o destino do cheque:")
    
    novo_cheque = [id_cheque, numero_cheque, valor_cheque, data_cheque, destino_cheque]
    talonario.append(novo_cheque)

    print("Dados do cheque adicionado:")
    print(f"ID: {novo_cheque[0]}, Numero: {novo_cheque[1]}, Valor: {novo_cheque[2]}, Data: {novo_cheque[3]}, Destino: {novo_cheque[4]}")

print("Dados dos cheques adicionados:")
for cheque in talonario:
    print(f"ID: {cheque[0]}, Numero: {cheque[1]}, Valor: {cheque[2]}, Data: {cheque[3]}, Destino: {cheque[4]}")
