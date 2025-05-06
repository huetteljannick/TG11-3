import random

# Erstelle eine Liste mit 1000 zufälligen Ganzzahlen zwischen 0 und 99
liste = [random.randint(-2, 10) for _ in range(1000)]

while True:

    eingabe = input("Gebe eine natürliche Zahl ein:")
    wert = int(eingabe)
    print (f"dein Wert ist: {wert} \n")

    if wert == -1:
        break

    def lineareSuche(liste, wert):
        gefunden = 0
        for index, element in enumerate(liste):
            if element == wert:
                print(index+1)  # Ausgabe des Index, wenn der Wert gefunden wird
                gefunden = gefunden + 1
                print(f"Deine Zahl wurde {gefunden} Mal gefunden.")
            

         


# Aufruf der Funktion
lineareSuche(liste, wert)