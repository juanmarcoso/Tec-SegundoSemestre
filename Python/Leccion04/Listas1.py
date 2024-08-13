# Listas = ['Naty', 'Osvaldo', 'Lily', 'Ariel']

nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
print(nombres[1])
print(nombres[2])
print(nombres[-1]) # Utilizamos el -1 para acceder al ultimo indice de la lista

print(nombres[0:3]) #Seleccionamos un conjunto de indices a imprimir
print(nombres[ :3]) #Hacemos un recorrido desde el principio hasta la posicion 3
print(nombres[1:]) #Ahora incluimos desde el principio hasta el final desconocido
nombres[2] = 'Liliana' # Modificamos en el indice asignado
nombres[0] = 'Natalia'
print(nombres)
print('--------------------')
#Iteramos en la lista
for nombre in nombres: 
    print(nombre)
else:
    print('Se acabaron los nombres')