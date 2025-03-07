import math

angulo = float(input("Digite um angulo em graus: "))

angulo_radianos = math.radians(angulo)
quadrante = int(angulo_radianos / (math.pi / 2)) + 1


if quadrante % 2 == 0:
    seno = math.sin(angulo_radianos)
    print(f"O ângulo {angulo} graus pertence a um quadrante par.")
    print(f"O seno do ângulo é {seno}")
else:
    # Se for ímpar, calcula e exibe o cosseno
    cosseno = math.cos(angulo_radianos)
    print(f"O ângulo {angulo} graus pertence a um quadrante ímpar.")
    print(f"O cosseno do ângulo é {cosseno}")
