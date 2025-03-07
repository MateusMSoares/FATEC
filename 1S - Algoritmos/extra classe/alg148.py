destino = input("Digite o destino (Região Norte, Nordeste, Centro-Oeste ou Sul): ").strip().title()
ida_e_volta = input("A viagem inclui ida e volta? (S para Sim, N para Não): ").strip().upper()

preco_ida_volta = {
    "Norte": 900.00,
    "Nordeste": 650.00,
    "Centro-Oeste": 600.00,
    "Sul": 550.00
}

preco_somente_ida = {
    "Norte": 500.00,
    "Nordeste": 350.00,
    "Centro-Oeste": 350.00,
    "Sul": 300.00
}

if ida_e_volta == "S":
    if destino in preco_ida_volta:
        preco = preco_ida_volta[destino]
    else:
        preco = "Destino inválido"
else:
    if destino in preco_somente_ida:
        preco = preco_somente_ida[destino]
    else:
        preco = "Destino inválido"

print(f"Preço da passagem para {destino}: R${preco}")