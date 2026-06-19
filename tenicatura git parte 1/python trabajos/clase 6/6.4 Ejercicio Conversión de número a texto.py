num = int(input("Ingrese un numero del 1 al 3: "))
numtexto = ''
if num == 1:
    numtexto = "numero 1"
elif num == 2:
    numtexto = "numero 2"
elif num == 3:
    numtexto = "numero 3"
else:
 numtexto = "El numero esta fuera del rango"
print(f"El numero ingresado es:  {num} - {numtexto}")