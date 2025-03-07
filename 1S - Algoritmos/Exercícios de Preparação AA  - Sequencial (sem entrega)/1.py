#media ponderada com peso 1, 2... n+1

def media_com_peso (n, i, media):
    media[n] = i
    media_notas = 0
    media_peso = 0
    for nota, peso in media.items():
        media_notas += nota * peso
        media_peso +=  peso

    return media_notas / media_peso

media = {}
i = 1
while i < 6:
    num = int(input((f"Insira a nota {i}: ")))
    resultado = media_com_peso(num, i, media)
    i += 1

for nota, peso in media.items():
    print(f"Nota: {nota} peso:{peso}")

print(f'A media ponderada é: {resultado:.2f}')

