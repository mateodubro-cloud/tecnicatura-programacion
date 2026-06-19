totalSalario = 0
for i in range (5):
 horas = float(input ("Ingrese el numero de horas: "))
 tarifa = float(input ("Ingrese el tarifa del salario: "))
 salario = horas * tarifa

 print("El salario es: ", salario)

 totalSalario += salario
 print("El total del salario es: ", totalSalario)