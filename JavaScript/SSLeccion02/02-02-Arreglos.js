// Creacion de array o arreglos

//let autos = new Array('Ferrari', 'Renault', 'BMW'); Esta es la sintaxis vieja
const autos = ['Ferrari', 'Renault', 'BMW']; //Arreglo
console.log(autos);

// Recorremos los elementos de un arreglo
console.log(autos[0]); //Ferrari
console.log(autos[2]); //BMW
console.log("-------------------------")
for (let i = 0; i < autos.length; i++){
    console.log(i + " : " + autos[i]);
}
