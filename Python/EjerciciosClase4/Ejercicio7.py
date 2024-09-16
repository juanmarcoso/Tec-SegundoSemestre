"""
Ejercicio6: Tabla de multiplicar 
Hacer un programa que pida un numero por teclado y guarde en una lista 
su tabla de multiplicar hasta el 10.
Por ejemplo:
Si digito el 5 la lista tendra: 
5, 10, 15, 20, 25, 30, 35, 40, 45, 50.
"""

numero = int(input("Ingrese un numero a multiplicar: "))
tabla = []

for i in range(1, 11):
    tabla.append(i * numero)
    
print("")
print(f"La tabla del {numero} es:\n{tabla}")