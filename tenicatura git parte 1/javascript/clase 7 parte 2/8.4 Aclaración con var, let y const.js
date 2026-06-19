/*
Con var puedes reasignar en cualquier momento
este forma parte del ambito global
Un error es que se sobreescriba
*/

var nombre = 'Mateo';
nombre = 'Dubrowszczyk';
console.log(nombre);

function saludar(){
    var nombre = 'valentin';
    console.log(nombre);
}
console.log(nombre); //Aquí no lee el dato en la función

if(true){
    var edad = 19;
    console.log(edad);
}
console.log(edad); //En la función funciono correctamente

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves

o dentro de una función
*/

function saludar2(){
    let nombre2 = 'valentin';
    console.log(nombre2);
}

if(true){
    let edad = 19;
    console.log(edad);
}
console.log(edad);

const fechaNacimiennto = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento);
