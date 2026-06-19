n = int(input("Cantidad de números: "))

suma_pares = cont_pares = suma_impares = cont_impares = 0

for _ in range(n):
    num = int(input("ingresa mas numeros: "))

    if num % 2 == 0:
        suma_pares += num
        cont_pares += 1
    else:
        suma_impares += num
        cont_impares += 1

promedio = suma_impares / cont_impares if cont_impares else 0

print("Suma de pares:", suma_pares)
print("Cantidad de pares:", cont_pares)
print("Promedio de impares:", promedio)
