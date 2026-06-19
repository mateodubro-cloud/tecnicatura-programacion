# ejercicio rango entre 20 y 30 años parte 2

edad = int(input("Introduce su edad: "))
veinte = edad >= 20 and edad <= 30
print(veinte)
treinta = edad >= 30 and edad <= 40
print(treinta)
if veinte:
    print("estas dentro del rango de los (20' 0) años")
elif treinta:
    print("estas dentro del rango de los (30'0) años")
else:
    print("no estas dentro del rango de los (20' 0) a (30'0) años")