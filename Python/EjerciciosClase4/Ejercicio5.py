"""
Ejercicio 4: Sumar numeros pares dentro de un rango.
Por ejemplo: 
    suma de numeros pares del 2 al 30
    suma = 240
"""
rangoMenor = int(input("Ingrese desde donde arranca el rango a sumar: "))
rangoMayor = int(input("Ingrese hasta donde llega el rango a sumar: "))

suma = 0

for i in range(rangoMenor, rangoMayor+1):
    if i % 2 == 0:
        suma += i
    else:
        continue
        
print("La suma es: ", suma)