mes = int(input("ingrese un numero del 1 al 12: "))
if mes == 1 or mes == 2 or mes == 3:
    print("verano")
elif mes == 4 or mes == 5 or mes == 6:
    print("otoño")
elif mes == 7 or mes == 8 or mes == 9:
    print("invierno")
elif mes == 10 or mes == 11 or mes == 12:
    print("primavera")
else:
    print("mes invalido")