"""
Ejercicio 8: Menu interactivo - Cajero automatico
Hacer un programa que simule un cajero automatico con un saldo inicial de $1000.
Tendrá el siguiente menu de opciones: 
    1. Ingresar dinero en la cuenta;
    2. Retirar dinero de la cuenta;
    3. Mostrar dinero disponible
    4. Salir
"""

saldoIni = 1000
opcion = int
saldoIng = 0
saldoRest = 0

print("********* MENU OPCIONES *********")
print("")
print("1. Ingresar dinero en la cuenta;\n2. Retirar dinero de la cuenta;\n3. Mostrar dinero disponible;\n4. Salir.")
print("")
opcion = int(input("Ingrese una opcion: "))

while opcion != 4:
    if opcion == 1:
        saldoIng = int(input("Ingrese el monto a sumar: "))
        saldoIni = (saldoIni + saldoIng)
        opcion = int(input("Ingrese otra opcion: "))
    elif opcion == 2:
        saldoRest = int(input("Ingrese cuanto retira: "))
        saldoIni = (saldoIni - saldoRest)
        opcion = int(input("Ingrese otra opcion: "))
    elif opcion == 3:
        print(f"Su saldo disponible es: {saldoIni}")
        opcion = int(input("Ingrese otra opcion: "))
    else:
        print("Gracias por usar este cajero.")
        
