miVariable = 3
print(miVariable)
miVariable = "hola mundo"
print(miVariable)
miVariable = 3.5
print(miVariable)

x = 10
y = 2
z = x + y
print(id(x))
#las literales se escriben x528, la variable y = x272, la variable z = x592
print(id(y))
print(id(z))




#tipos,int,float,string,bool

#ejecutar con run ctrl+mayuscula+f10 o click derecho y en run

x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "hola alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(type(x))

#manejo de cadenas (string)
miGrupoFavorito = "linkin park"
caracteristicas = "the best rock band"
print("mi grupo favorito es: ", miGrupoFavorito, caracteristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))
#el signo + sirve tanto para sumar como concatenar. al momento de sumar numeros hay que poner "int"

#tipos boleanos (bool)

miBoleano = 1 > 2
print(miBoleano)

if miBoleano:
    print("mi boleano es verdadero")
else:
    print("mi boleano es falso")

#procesar la entrada del usuario
# funcion input
resultado = input("digite un numero") #ingresa un dato tipo string
print(resultado)