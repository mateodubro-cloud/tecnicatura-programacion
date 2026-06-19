numero = int(input("ingrese el numero: "))
if numero < 0:
    print("el numero es incorrecto")
else: factorial = 1
for i in range(1, numero + 1):
    factorial = factorial * i
    print("factorial: ", factorial)

