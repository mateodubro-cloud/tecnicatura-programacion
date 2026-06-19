#ejercicio tienda de libro



print('ingrese el valor del libro')
nombre = input('Introduce el nombre del libro: ')
id = int(input('Introduce el id del libro: '))
precio = float(input('Introduce el precio del libro: '))
envioGratuito = input('indicar si el envio es gratuito (True/False): ')
if envioGratuito == 'True':
    envioGratuito = True
elif envioGratuito == 'False':
    envioGratuito = False
else:
    envioGratuito = 'el valor es incorrecto, debe escribir True/False'
    print(f'''
               nombre: {nombre}
               id: {id}
               precio: {precio}
               envio Gratuito?: {envioGratuito}
''')