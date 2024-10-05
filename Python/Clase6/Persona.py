
class Persona: # Creamos una clase
    # pass
    def __init__(self, nombre, apellido, edad) -> None: # self es el parametro de objeto por default
        # Se le llama método Init Dunder a self
        # La referencia del init la llama de manera indirecta
        
        #self.nombre = "Juan"
        #self.apellido = "Zalazar"
        #self.edad = 22
        
        #Creamos objetos
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        
    def mostrar_detalle(self):
        # self solo se utiliza dentro de las funciones
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')
        
persona1 = Persona('Juan', 'Perez', 23) # Creamos Constructor y le pasamos argumentos
print(persona1.nombre) # Persona es el objeto, nombre es el espacio de memoria donde esta el atributo
print(persona1.apellido) # Nos va a imprimir el atributo con un valor dado
print(persona1.edad)

"""
Todo se ejecuta dentro del mismo espacio de memoria
Los objetos no comparten los valores solo los atributos
Y asi podemos asignar diferentes valores a los atributos
Hemos creado atributos de objetos
"""

persona2 = Persona('Osvaldo', 'Giordadini', 45)
print(f'El objeto 2 de la clase persona es: {persona2.nombre} {persona2.apellido}. Su edad es: {persona2.edad}')
print(f'El objeto 1 de la clase persona es: {persona1.nombre} {persona1.apellido}. Su edad es: {persona1.edad}')

# Vamos a modificar un valor a un atributo de un objeto
persona1.nombre = "Liliana"
persona1.apellido = "Buccella"
persona1.edad = 40

print(f'El objeto 3 de la clase persona1 es: {persona1.nombre} {persona1.apellido}. Su edad es: {persona1.edad}')

#Metodo de instancia
# Los atributos son: caracteristicas
# Los metodos son el comportamiento que van a tener los objetos (acciones)
# Un metodo es igual a una funcion, la diferencia es que al metodo se lo llama porque se asocia con una clase
# La funcion es propia de si misma

persona1.mostrar_detalle() # Otras formas de acceder a los atributos de un metodo
persona2.mostrar_detalle()