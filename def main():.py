def main():
    nivel = 1
    otro_nivel = nivel
    otro_nivel = 5
    aria = Personaje("Aria", 100)
    copia = aria
    copia.recibir_dano(30)
    print(nivel, aria.vida)
