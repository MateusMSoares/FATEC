'''Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa
anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de
crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a população do país B,
mantidas as taxas de crescimento'''

#A = 80000 O.3 ao ano
#B = 200000 0.15 ao ano 

populacao_a = 80000
populacao_b = 200000
ano = 0

while populacao_a <= populacao_b:
    populacao_a = populacao_a * 1.03
    populacao_b = populacao_b * 1.015
    ano = ano + 1

if populacao_a == populacao_b:
    print(f"Apos {ano} anos, o pais A terá população de {populacao_a:.0f} e igualará a população do pais B")
else:
    print(f"Apos {ano} anos, o pais A terá população de {populacao_a:.0f} e superará a população de {populacao_b:.0f} do pais B ")