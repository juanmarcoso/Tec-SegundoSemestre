"""
Ejercicio 7: Juego adivina el numero
Realizar un juego para adivinar un numero. Para ello se debe generar un numero 
aleatorio entre 1 - 100, y luego ir pidiendo numeros indicando "es mayor" o "es menor"
con respecto a N. El proceso termina cuando el usuario acierta y alli se debe mostrar 
el numero de intentos. 
"""
from random import randint

numero = int(input("Ingresa un numero: "))
rango = randint(1, 101)
contador = 1 # Inicializo en el 1 porque se supone que arrancamos con un intento

while numero > 0 & numero <= 100:
    if numero < rango:
        print("Es menor. Intente de nuevo: ")
        numero = int(input())
        contador += 1
    elif numero > rango:
        print("Es mayor. Intente de nuevo: ")
        numero = int(input())
        contador += 1
    else:
        print("")
        break
    
print(f"Usted acerto en el intento {contador}")
        