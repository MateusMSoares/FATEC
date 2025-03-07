"""
Criar um algoritmo que funcione de acordo com o menu a seguir, sabendo-se que
poderão ser cadastradas até 50 pessoas
* MENU *

1 - cadastra dados do cliente
2 - cadastra milha gem do cliente
3 - lista milha gem do cliente
4 - imprime os nomes que têm maior e menor milha gem
5- imprime os nomes e as milha gens
6- SAIR
OPCAO: 
"""
nomes = []
milhas = []

while True:
    print(" ** **\n* MENU *\n ** **")
    print("1 - Cadastrar dados do cliente")
    print("2 - Cadastrar milhagem do cliente")
    print("3 - Listar milhagem do cliente")
    print("4 - Imprimir nomes com maior e menor milhagem")
    print("5 - Imprimir nomes e milhagens")
    print("6 - SAIR")
    opcao = input("OPÇÃO: ")

    if opcao == "1":
        print("\n")
        if len(nomes) < 50:
            nome = input("Digite o nome do cliente: ")
            nomes.append(nome)
            milhas.append(0)
            print("\n")
        else:
            print("Limite de clientes atingido.")

    elif opcao == "2":
        print("\n")
        if len(nomes) == 0:
            print("Nenhum cliente cadastrado.")
        else:
            print("Clientes: ")
            for i, nome in enumerate(nomes):
                print(f"{i + 1} - {nome}")
            cliente = int(input("Selecione um cliente pelo número: "))
            index = cliente - 1 
            milhagem = int(input("Digite a quantidade de milhas: "))
            milhas[index] = milhagem
            print("\n")

    elif opcao == "3":
        print("\n")
        if len(milhas) == 0:
            print("Nenhum cliente cadastrado")  
        else:
            print("De qual cliente deseja ver as milhas:")
            for i, nome in enumerate(nomes):
                print(f"{i + 1} - {nome}")
            cliente = int(input("Selecione um cliente pelo número: "))
            index = cliente - 1 
            print(f"{nomes[index]}: {milhas[index]} milhas")
    elif opcao == "4":
        print("\n")
        if len(milhas) == 0:
            print("Nenhum cliente cadastrado") 
        else:
            index_maior = milhas.index(max(milhas))
            max_milhas = milhas[index_maior]
            index_menor = milhas.index(min(milhas))
            min_milhas = milhas[index_menor]
        print(f"Maior milhagem: {nomes[index_maior]} {max_milhas} milhas")
        print(f"Menor milhagem: {nomes[index_menor]} {min_milhas} milhas")
        print("\n")
    elif opcao == "5":
        print("\n")
        if len(milhas) == 0:
            print("Nenhum cliente cadastrado")   
        else: 
            print("Milhagens dos clientes:")
            for i, nome in enumerate(nomes):
                print(f"{nome}: {milhas[i]} milhas")
            print("\n")
    elif opcao == "6":
        print("Saindo do programa.")
        break
    else:
        print("Opção inválida. Escolha uma opção válida.")

