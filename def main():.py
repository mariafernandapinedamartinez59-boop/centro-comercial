def main():
    nivel = 1
    otro_nivel = nivel
    otro_nivel = 5
    aria = Personaje("Aria", 100)
    copia = aria
    copia.recibir_dano(30)
    print(nivel, aria.vida)
    
def main():
    espada = Item("Espada", 3.5)
    pocion = Item("Poción", 0.5)
    print(espada.describir())
    print(pocion.describir())
