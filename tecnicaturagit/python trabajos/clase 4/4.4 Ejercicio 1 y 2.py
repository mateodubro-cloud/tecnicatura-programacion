#ejercicio 1

a = int(input("digite un numero: "))


print(f"el residuo de la division es: {a % 2}")
if a % 2 == 0:
    print(f"el valor de a es: {a} es un numero par")
else:
    print(f"el valor de a es: {a} es un numero impar")

#ejercicio 2
edad = int(input("digite su edad: "))
if edad >= 18:
    print("es mayor de edad")
elif edad < 18:
    print("es menor de edad")