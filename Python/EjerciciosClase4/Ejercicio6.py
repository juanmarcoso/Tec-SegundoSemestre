"""
Ejercicio5: Factorial de un numero positivo
"""

factorial = int(input("Ingrese un numero entero: "))
factorial1 = 1

if factorial > 0:
    print("Es positivo.")
else: 
    print("El numero es incorrecto. Tiene que se positivo.")

for i in range(1, factorial +1):
    factorial1 *= i
    
print(f"El factorial de {factorial} es {factorial1}")