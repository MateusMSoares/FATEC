'''Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao
nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
'''

while True:
    username = input("Insira o nome de usuario: ")
    password = input("Insira a senha: ")

    if password == username:
        print("Digite uma senha diferente do nome de usuario")
    else:
        print(f"Usuario cadastrado {username} e senha {password}")
        break
    