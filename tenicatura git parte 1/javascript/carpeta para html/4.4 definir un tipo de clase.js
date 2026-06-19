var nombre = "mateo";
console.log(typeof nombre);
var nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre);
var numero = 3000;
console.log(typeof numero);

var objeto = {
    nombre : "mateo",
    apellido : "dubrowszczyk",
    telefono : "2604534212"


}

console.log(typeof objeto);

//tipo de dato boolean

var bandera = true;
console.log(bandera);

//tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

//tipo de dato symbol
var simbolo = Symbol("mi Simbolo");
console.log(simbolo);

//tipo de dato clase
class persona{
constructor(nombre,apellido){

    this.nombre = nombre;
    this.apellido = apellido;
}


}