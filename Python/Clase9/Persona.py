class Persona:
    
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
        
class Empleado(Persona): #Asi le asignamos que esta clase es hija de la clase Persona
    
    def __init__(self, nombre, edad, sueldo):
        
        super().__init__(nombre, edad)
        self.sueldo = sueldo
        
        
empleado1 = Empleado('Juan', 32, 75000)
print(empleado1.nombre)
print(empleado1.edad)
print(empleado1.sueldo)

# * Tarea solicitada esta en "./Tareas/Tarea1.py"
