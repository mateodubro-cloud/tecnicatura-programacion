comoEstuvoTuDia = int(input("del 1 al 10 como estuvo tu dia: "))

if comoEstuvoTuDia >= 1  and comoEstuvoTuDia < 3:
    print("tu dia fue malo")
elif comoEstuvoTuDia >= 3  and comoEstuvoTuDia < 6:
    print("tu dia fue regular")
elif comoEstuvoTuDia >= 6 and comoEstuvoTuDia < 10:
    print("tuviste un buen dia")

else:
    print("dato invalido")